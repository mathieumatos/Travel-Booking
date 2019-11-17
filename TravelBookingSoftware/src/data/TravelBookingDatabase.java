package data;

import java.util.ArrayList;
import java.util.List;

import AppUtils.DateUtils;
import Travel.Companies.Company;
import Travel.Companies.PlaneCompany;
import Travel.areas.Airport;
import Travel.areas.Area;
import Travel.entityFactories.PlaneEntityFactory;
import Travel.journeys.Flight;
import Travel.journeys.Itinerary;
import Travel.journeys.Journey;
import Travel.vehicules.Plane;
import Travel.vehicules.Vehicule;

public class TravelBookingDatabase {

	private static TravelBookingDatabase instance = null;

	public CompanyDatabase companyDB = new CompanyDatabase();
	public JourneyDatabase journeyDB = new JourneyDatabase();
	public VehiculeDatabase vehiculeDB = new VehiculeDatabase();
	public AreaDatabase areaDB = new AreaDatabase();
	public ItineraryDatabase itineraryDB = new ItineraryDatabase();

	public TravelBookingDatabase() {
		fillData();
	}

	private void fillData() {
		PlaneEntityFactory eFactory = new PlaneEntityFactory();
		
		Company company = new PlaneCompany("PlaneCompany");
		companyDB.add(company.getCompanyID(), company);
		
		Area area1 = new Airport("a1");
		areaDB.add(area1.getAreaID(),area1);
		Area area2 = new Airport("a2");
		areaDB.add(area2.getAreaID(),area2);

		Itinerary itinerary = new Itinerary();
		itinerary.setItineraryID("iti");
		itinerary.setDepartureDate(DateUtils.createEasyDate("03/10/2011"));
		itinerary.setArrivalDate(DateUtils.createEasyDate("03/10/2019"));
		itinerary.setFromArea(new Airport("YUL"));
		itinerary.setToArea(new Airport("MOD"));
		itineraryDB.add(itinerary.getItineraryID(), itinerary);
		
		Vehicule plane = new Plane();
		plane.setVehiculeID("planeid");
		vehiculeDB.add(plane.getVehiculeID(), plane);
		
		
		Flight flight = (Flight) eFactory.createJourney();
		flight.setJourneyID("flight1");
		flight.setCompany(company);
		flight.setItinerary(itinerary);
		flight.setVehicule(plane);
		journeyDB.add("flight", flight);
		
		Flight flight1 = (Flight) eFactory.createJourney();
		flight1.setJourneyID("flight2");
		flight1.setCompany(company);
		flight1.setItinerary(itinerary);
		flight1.setVehicule(plane);
		journeyDB.add("flight23", flight);
		
		Company company2 = new PlaneCompany("SmileCompany");
		companyDB.add(company2.getCompanyID(), company2);
		
		Area area12 = new Airport("YUL");
		areaDB.add(area12.getAreaID(),area12);
		Area area22 = new Airport("MOD");
		areaDB.add(area22.getAreaID(),area22);

		Itinerary itinerary2 = new Itinerary();
		itinerary2.setItineraryID("longMarch");
		itinerary2.setDepartureDate(DateUtils.createEasyDate("03/10/2011"));
		itinerary2.setArrivalDate(DateUtils.createEasyDate("03/10/2020"));
		itinerary2.setFromArea(area12);
		itinerary2.setToArea(area22);
		itineraryDB.add(itinerary2.getItineraryID(), itinerary2);
		
		Vehicule plane2 = new Plane();
		plane2.setVehiculeID("planeid");
		vehiculeDB.add(plane2.getVehiculeID(), plane2);
		
		
		Flight flight22 = (Flight) eFactory.createJourney();
		flight22.setJourneyID("flight13");
		flight22.setCompany(company2);
		flight22.setItinerary(itinerary2);
		flight22.setVehicule(plane2);
		journeyDB.add("flight13", flight22);
		
	}

	public static TravelBookingDatabase getInstance() {
		if (TravelBookingDatabase.instance == null) {
			synchronized (TravelBookingDatabase.class) {
				if (TravelBookingDatabase.instance == null) {
					TravelBookingDatabase.instance = new TravelBookingDatabase();
				}
			}
		}
		return TravelBookingDatabase.instance;
	}

	public List<Journey> getJourneys() {
		return new ArrayList<>(journeyDB.elements.values());
	}

	public List<Company> getCompanies() {
		return new ArrayList<>(companyDB.elements.values());
	}
	
	public List<Vehicule> getVehicules() {
		return new ArrayList<>(vehiculeDB.elements.values());
	}
	
	public Vehicule getVehicule(String ID) {
		return vehiculeDB.elements.get(ID);
	}

	public Itinerary getItinerary(String ID) {
		return itineraryDB.elements.get(ID);
	}
	
	public Company getCompany(String ID) {
		return companyDB.elements.get(ID);
	}
	
	public Area getArea(String ID) {
		return areaDB.elements.get(ID);
	}
}