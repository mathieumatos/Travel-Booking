package Travel.formModels;

public class DeleteJourneyForm extends FormModel {
	
	public DeleteJourneyForm() {
		FormEntry e = new FormEntryBuilder().setTitle("Journey ID").setCompulsory(true).build();
		putEntry(e);
	}
	
}