package Travel.formModels;

public class CreateJourneyForm extends FormModel {
	
	public CreateJourneyForm() {
		FormEntry c = new FormEntryBuilder().setTitle("TravelType").setPossibleValues(new String[]{"Plane","Train","Boat"}).build();
		putEntry(c);
		FormEntry e = new FormEntryBuilder().setTitle("Journey ID").build();
		putEntry(e);
		FormEntry company = new FormEntryBuilder().setTitle("Company ID").build();
		putEntry(company);
		FormEntry itinerary = new FormEntryBuilder().setTitle("Itinerary ID").build();
		putEntry(itinerary);
		
	}
	
}
