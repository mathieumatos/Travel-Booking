package CommandPackage;

import java.util.Map;

import Travel.Companies.PlaneCompany;
import data.TravelBookingDatabase;

public class ItineraryDeletionCommand implements Command {
	
	private String name = "ItineraryDeletionCommand";
	
	private Map<String, String> form;

	public ItineraryDeletionCommand(Map<String, String> form) {
		this.form = form;
	}

	@Override
	public boolean execute() {
		TravelBookingDatabase db = TravelBookingDatabase.getInstance();
		String id = form.get("Itinerary ID");
		return db.itineraryDB.remove(id);
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