package Travel.vehicules.sections;

import java.util.List;

import Travel.vehicules.places.Place;

public abstract class VehiculeSection {
	
	private Double priceRatio;
	
	private List<Place> places;

	public Double getPriceRatio() {
		return priceRatio;
	}

	public List<Place> getPlaces() {
		return places;
	}
	
}
