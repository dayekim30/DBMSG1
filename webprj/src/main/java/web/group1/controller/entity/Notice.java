package web.group1.controller.entity;

public class Notice {
	
	private String country_code;
	private String country_name;
	private String region_code; 
	private String region_name; 
	
	public Notice() {//초기화?
	}
//생성자 오보로드
	
	public String getCountry_code() {
		return country_code;
	}

	public Notice(String country_code, String country_name, String region_code, String region_name) {
		super();
		this.country_code = country_code;
		this.country_name = country_name;
		this.region_code = region_code;
		this.region_name = region_name;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public String getRegion_code() {
		return region_code;
	}

	public void setRegion_code(String region_code) {
		this.region_code = region_code;
	}

	public String getRegion_name() {
		return region_name;
	}

	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}

	
	
	

}
