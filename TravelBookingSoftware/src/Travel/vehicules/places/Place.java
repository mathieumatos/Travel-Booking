package Travel.vehicules.places;

import Travel.vehicules.AvailabilityState;
import Travel.vehicules.sections.VehiculeSection;

public class Place {

	private AvailabilityState state;
	
	private String placeID;
	
	private VehiculeSection section;
	
	public AvailabilityState getState() {
		return state;
	}

	public void setState(AvailabilityState state) {
		this.state = state;
	}

	public String getPlaceID() {
		return placeID;
	}

	public void setPlaceID(String placeID) {
		this.placeID = placeID;
	}

	public VehiculeSection getSection() {
		return section;
	}

	public void setSection(VehiculeSection section) {
		this.section = section;
	}

}