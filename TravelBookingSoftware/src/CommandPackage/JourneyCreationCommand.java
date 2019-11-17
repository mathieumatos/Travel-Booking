package CommandPackage;

import java.util.Map;

import Travel.Companies.Company;
import Travel.journeys.Flight;
import Travel.journeys.Itinerary;
import Travel.journeys.Journey;
import Travel.vehicules.Vehicule;
import data.TravelBookingDatabase;

public class JourneyCreationCommand implements Command {

	private String name = "JourneyCreationCommand";

	private Map<String, String> form;

	public JourneyCreationCommand(Map<String, String> values) {
		this.form = values;

	}

	@Override
	public boolean execute() {
		TravelBookingDatabase db = TravelBookingDatabase.getInstance();

		String id = form.get("Journey ID");

		Journey flight = new Flight();

		flight.setJourneyID(id);

		Vehicule vehicule = db.getVehicule(form.get("Vehicule ID"));

		flight.setVehicule(vehicule);

		Company company = db.getCompany(form.get("Company ID"));

		flight.setCompany(company);

		Itinerary iti = db.getItinerary(form.get("Itinerary ID"));

		flight.setItinerary(iti);

		return db.journeyDB.add(id, flight);
	}

	@Override
	public boolean undo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getName() {
		return name;
	}
}