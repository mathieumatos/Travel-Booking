package Travel;

import AppUtils.DateUtils;
import Travel.journeys.Itinerary;
import Travel.journeys.Journey;
import Travel.vehicules.Vehicule;

public class AllJourneyVisitor implements JourneyVisitor {

	
//	YUL-YYZ:[AIRCAN]AC481(2014.11.28:06.00-2014.11.28:07:24)|PS(0/12)474.00|AM(5/16)355.50|EL(150/200)237.00 (exemple pour les vols d'avion). 
//	Cette donnée représente le vol AC481 par AIRCAN partant de YUL le 28/11/2014 à 6h arrivant à YYZ le même jour à 7h24 ayant une classe Première étroite avec 0 sièges réservés sur 12 chacun coûtant 474$, une classe Affaire moyenne avec 5 sièges réservés sur 16 chacun coûtant 355.50$ et une classe Économie large avec 150 sièges réservés sur 200 chacun coûtant 237$.
	
	private String fromArea;
	
	private String toArea;
	
	private String departureTime;
	
	private String arrivalTime;
	
	private String companyID;
	
	private String seatData;
	
	private String journeyID;
	
	@Override
	public void visitJourney(Journey j) {
		System.out.println(String.format("Visiting journey with ID : %s", j.getJourneyID()));
		journeyID = j.getJourneyID();
		companyID = j.getCompany().getCompanyID();
	}
	
	@Override
	public void visitVehicule(Vehicule v) {
		
	}
	
	@Override
	public void visitItinerary(Itinerary i) {
		fromArea = i.getFromArea().getAreaID();
		toArea = i.getToArea().getAreaID();
		departureTime = DateUtils.formatDate(i.getDepartureDate());
		arrivalTime = DateUtils.formatDate(i.getArrivalDate());
	}
	
	public String getGatheredData(){
		return String.format("%s-%s:[%s]%s(%s-%s)", fromArea, toArea, companyID, journeyID, departureTime, arrivalTime, seatData);
	}
	
}