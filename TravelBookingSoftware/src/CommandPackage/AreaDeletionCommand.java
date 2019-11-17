package CommandPackage;

import java.util.Map;

import data.TravelBookingDatabase;

public class AreaDeletionCommand implements Command {
	
	private String name = "AreaDeletionCommand";
	
	private Map<String, String> form;

	public AreaDeletionCommand(Map<String, String> form) {
		this.form = form;
	}

	@Override
	public boolean execute() {
		TravelBookingDatabase db = TravelBookingDatabase.getInstance();
		String id = form.get("Area ID");
		return db.areaDB.remove(id);
	}

	@Override
	public boolean undo() {
		// TODO Auto-generated method stub
		return false;
	}

	
	@Override
	public String getName() {
		return name;
	}
}