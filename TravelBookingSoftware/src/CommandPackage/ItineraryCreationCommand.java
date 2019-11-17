package CommandPackage;

import java.util.Map;

import AppUtils.DateUtils;
import Travel.areas.Area;
import Travel.journeys.Itinerary;
import data.TravelBookingDatabase;

public class ItineraryCreationCommand implements Command {

	private String name = "ItineraryCreationCommand";

	private Map<String, String> form;

	public ItineraryCreationCommand(Map<String, String> form) {
		this.form = form;
	}

	@Override
	public boolean execute() {
		TravelBookingDatabase db = TravelBookingDatabase.getInstance();
		
		Itinerary itinerary = new Itinerary();
		
		itinerary.setItineraryID(form.get("Itinerary ID"));
		itinerary.setDepartureDate(DateUtils.createEasyDate(form.get("Departure Date")));
		itinerary.setArrivalDate(DateUtils.createEasyDate(form.get("Arrival Date")));

		Area fromArea = db.getArea(form.get("From Area"));
		itinerary.setFromArea(fromArea);
		Area toArea = db.getArea(form.get("To Area"));
		itinerary.setToArea(toArea);
		
		return db.itineraryDB.add(itinerary.getItineraryID(), itinerary);
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