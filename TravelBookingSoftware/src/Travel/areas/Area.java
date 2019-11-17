package Travel.areas;

public abstract class Area {

	private String city;
	
	private String areaID;
	
	public Area(String areaID) {
		this.areaID = areaID;
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAreaID() {
		return areaID;
	}
	
	
}