package Travel;

import Travel.journeys.Itinerary;
import Travel.journeys.Journey;
import Travel.vehicules.Vehicule;

public interface JourneyVisitor {
	
	/**
	 * 
	 * @param j
	 */
	public void visitJourney(Journey j);

	/**
	 * 
	 * @param v
	 */
	void visitVehicule(Vehicule v);

	void visitItinerary(Itinerary i);

}