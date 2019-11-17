package Travel.vehicules;

import java.util.List;

import Travel.vehicules.sections.VehiculeSection;

public abstract class Vehicule {
	
	private String vehiculeID;
	
	private List<VehiculeSection> sections;
	
	private Double priceRatio;

	public String getVehiculeID() {
		return vehiculeID;
	}

	public void setVehiculeID(String vehiculeID) {
		this.vehiculeID = vehiculeID;
	}

	public List<VehiculeSection> getSections() {
		return sections;
	}

	public void setSections(List<VehiculeSection> sections) {
		this.sections = sections;
	}

	public Double getPriceRatio() {
		return priceRatio;
	}

	public void setPriceRatio(Double priceRatio) {
		this.priceRatio = priceRatio;
	}
	
	
	
}
