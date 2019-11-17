package Travel.formModels;

public class FormEntryBuilder {
	
	private String title;
	
	private String value;
	
	private boolean editable = true;
	
	private boolean compulsory = true;
	
	private String[] possibleValues;
	
	public FormEntry build() {
		FormEntry newFormEntry = new FormEntry();
		newFormEntry.setTitle(title);
		newFormEntry.setValue(value);
		newFormEntry.setEditable(editable);
		newFormEntry.setCompulsory(compulsory);
		newFormEntry.setPossibleValues(possibleValues);
		return newFormEntry;
	}

	public FormEntryBuilder setTitle(String title) {
		this.title = title;
		return this;
	}

	public FormEntryBuilder setValue(String value) {
		this.value = value;
		return this;
	}

	public FormEntryBuilder setEditable(boolean editable) {
		this.editable = editable;
		return this;
	}

	public FormEntryBuilder setCompulsory(boolean compulsory) {
		this.compulsory = compulsory;
		return this;
	}
	
	public FormEntryBuilder setPossibleValues(String[] possibleValues) {
		this.possibleValues = possibleValues;
		return this;
	}
}
