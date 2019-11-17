package Travel.formModels;

import java.util.HashMap;
import java.util.Map;

public abstract class FormModel {
	
	protected Map<String,FormEntry> entries = new HashMap<String,FormEntry>();
	
	public boolean validateForm() {
		return true;
	}
	
	public Map<String,FormEntry> getEntries() {
		return entries;
	}
	
	public void putEntry(FormEntry formEntry) {
		entries.put(formEntry.getTitle(), formEntry);
	}
	
	public String getEntryValue(String name) {
		return entries.get(name).getValue();
	}
	
}
