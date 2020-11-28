package web.group1.controller.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import web.group1.controller.entity.Notice;
import web.group1.controller.entity.WeaponTrend;


public class NoticeService  {
		
	
	public List<WeaponTrend> getList()throws ClassNotFoundException, SQLException{
		String url = "jdbc:oracle:thin:@oracle.cise.ufl.edu:1521/orcl";
		String sql = "SELECT * FROM AGASKIN.location";
		String sql1 = "SELECT wep_type, event_year, COUNT(*) num FROM AGASKIN.Weapon\r\n"
				+ "NATURAL JOIN AGASKIN.Event\r\n"
				+ "WHERE event_year >= 1985\r\n"
				+ "AND event_year <= 2000\r\n"
				+ "AND weapon_id <> -9\r\n"
				+ "GROUP BY wep_type, event_year\r\n"
				+ "ORDER BY wep_type, event_year ASC";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,"daye","qwert1234");
		Statement st = con.createStatement();
//		ResultSet rs = st.executeQuery(sql);
//		
//		ArrayList<Notice> list = new ArrayList<Notice>();
//		
//		while(rs.next()) {
//		String country_code = rs.getString("country_code");
//		String country_name = rs.getString("country_name");
//		String region_code = rs.getString("region_code");
//		String region_name = rs.getString("region_name");
//				
//		Notice notice = new Notice(country_code, country_name,region_code,region_name);
//		list.add(notice);
//		}
		
		
		ResultSet wp = st.executeQuery(sql1);
		
		ArrayList<WeaponTrend> wplist = new ArrayList<WeaponTrend>();
		
		while(wp.next()) {
		String wep_type = wp.getString("wep_type");
		int event_year = wp.getInt("event_year");
		int num = wp.getInt("num");
		
		WeaponTrend weapontrend = new WeaponTrend(wep_type,event_year,num);
		
		wplist.add(weapontrend);
		}
		
		
		
		
		
		
		
		wp.close();
		st.close();
		con.close();
		return wplist;
		}
		
	}
	


