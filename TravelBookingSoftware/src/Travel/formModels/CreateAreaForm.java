package Travel.formModels;

public class CreateAreaForm extends FormModel {
	
	public CreateAreaForm() {
		FormEntry c = new FormEntryBuilder().setTitle("TravelType").setCompulsory(true).setPossibleValues(new String[]{"Plane","Train","Boat"}).build();
		putEntry(c);
		FormEntry e = new FormEntryBuilder().setTitle("Area ID").setCompulsory(true).build();
		putEntry(e);
	}
	
}
