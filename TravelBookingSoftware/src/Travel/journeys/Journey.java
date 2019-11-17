package Travel.journeys;

import Travel.JourneyVisitor;
import Travel.TravelType;
import Travel.VisitableJourney;
import Travel.Companies.Company;
import Travel.vehicules.Vehicule;

public abstract class Journey implements VisitableJourney {

	private String journeyID;
	
	private TravelType type;
	
	private Company company;
	
	private Vehicule vehicule;
	
	private Itinerary itinerary;
	
	@Override
	public void accept(JourneyVisitor jv) {
		jv.visitJourney(this);
		jv.visitItinerary(this.itinerary);
		jv.visitVehicule(this.getVehicule());
	}
	
	public String getJourneyID() {
		return journeyID;
	}

	public void setJourneyID(String journeyID) {
		this.journeyID = journeyID;
	}

	public TravelType getType() {
		return type;
	}

	public void setType(TravelType type) {
		this.type = type;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Vehicule getVehicule() {
		return vehicule;
	}

	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}

	public Itinerary getItinerary() {
		return itinerary;
	}

	public void setItinerary(Itinerary itinerary) {
		this.itinerary = itinerary;
	}
	
}