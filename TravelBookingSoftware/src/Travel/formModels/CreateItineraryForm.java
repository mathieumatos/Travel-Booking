package Travel.formModels;

public class CreateItineraryForm extends FormModel {
	
	public CreateItineraryForm() {
		FormEntry c = new FormEntryBuilder().setTitle("TravelType").setPossibleValues(new String[]{"Plane","Train","Boat"}).build();
		putEntry(c);
		
		FormEntry e = new FormEntryBuilder().setTitle("Itinerary ID").build();
		putEntry(e);
		
		FormEntry departureDate = new FormEntryBuilder().setTitle("Departure Date").build();
		putEntry(departureDate);
		
		FormEntry arrivalDate = new FormEntryBuilder().setTitle("Arrival Date").build();
		putEntry(arrivalDate);
		
		FormEntry fromArea = new FormEntryBuilder().setTitle("From Area ID").build();
		putEntry(fromArea);
		
		FormEntry toArea = new FormEntryBuilder().setTitle("To Area ID").build();
		putEntry(toArea);
		
	}
	
}
