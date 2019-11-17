package Travel.formModels;

public class DeleteAreaForm extends FormModel {
	
	public DeleteAreaForm() {
		FormEntry e = new FormEntryBuilder().setTitle("Area ID").setCompulsory(true).build();
		putEntry(e);
	}
	
}