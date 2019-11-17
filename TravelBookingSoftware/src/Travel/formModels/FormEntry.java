package Travel.formModels;

public class FormEntry {
	
	private String title;
	
	private String value;
	
	private String[] possibleValues;
	
	private boolean editable;
	
	private boolean compulsory;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	public boolean isCompulsory() {
		return compulsory;
	}

	public void setCompulsory(boolean compulsory) {
		this.compulsory = compulsory;
	}

	public String[] getPossibleValues() {
		return possibleValues;
	}

	public void setPossibleValues(String[] possibleValues) {
		this.possibleValues = possibleValues;
	}
}
