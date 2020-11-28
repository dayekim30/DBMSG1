package web.group1.controller.entity;

public class WeaponTrend {
	private String wep_type;
	private int event_year;
	private int num;
	
	public WeaponTrend() {}

	public WeaponTrend(String wep_type, int event_year, int num) {
		super();
		this.wep_type = wep_type;
		this.event_year = event_year;
		this.num = num;
	}

	public String getWep_type() {
		return wep_type;
	}

	public void setWep_type(String wep_type) {
		this.wep_type = wep_type;
	}

	public int getEvent_year() {
		return event_year;
	}

	public void setEvent_year(int event_year) {
		this.event_year = event_year;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}


	
	
}
