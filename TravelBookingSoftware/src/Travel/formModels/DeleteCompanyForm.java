package Travel.formModels;

public class DeleteCompanyForm extends FormModel {
	
	public DeleteCompanyForm() {
		FormEntry e = new FormEntryBuilder().setTitle("Company ID").setCompulsory(true).build();
		putEntry(e);
	}
	
}