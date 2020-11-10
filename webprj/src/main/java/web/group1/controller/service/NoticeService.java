package web.group1.controller.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import web.group1.controller.entity.Notice;


public class NoticeService  {
		public List<Notice> getList()throws ClassNotFoundException, SQLException{
		String url = "jdbc:oracle:thin:@oracle.cise.ufl.edu:1521/orcl";
		String sql = "SELECT * FROM AGASKIN.location";
	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,"daye","qwert1234");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		List<Notice> list = new ArrayList<Notice>();
		
		while(rs.next()) {
		String country_code = rs.getString("country_code");
		String country_name = rs.getString("country_name");
		String region_code = rs.getString("region_code");
		String region_name = rs.getString("region_name");
		
		
		
		Notice notice = new Notice(country_code, country_name,region_code,region_name);
		list.add(notice);
		}
		rs.close();
		st.close();
		con.close();
		return list;
		}
		
	}
	


