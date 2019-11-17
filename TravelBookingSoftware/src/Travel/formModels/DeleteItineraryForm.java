package Travel.formModels;

public class DeleteItineraryForm extends FormModel {
	
	public DeleteItineraryForm() {
		FormEntry e = new FormEntryBuilder().setTitle("Itinerary ID").setCompulsory(true).build();
		putEntry(e);
	}
	
}