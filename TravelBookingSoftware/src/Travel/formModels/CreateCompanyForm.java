package Travel.formModels;

public class CreateCompanyForm extends FormModel {
	
	public CreateCompanyForm() {
		FormEntry c = new FormEntryBuilder().setTitle("TravelType").setCompulsory(true).setPossibleValues(new String[]{"Plane","Train","Boat"}).build();
		putEntry(c);
		FormEntry e = new FormEntryBuilder().setTitle("Company ID").setCompulsory(true).build();
		putEntry(e);
	}
	
}
