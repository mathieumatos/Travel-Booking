package CommandPackage;

import java.util.Map;

import data.TravelBookingDatabase;

public class JourneyDeletionCommand implements Command {
	
	private String name = "JourneyDeletionCommand";
	
	private Map<String, String> form;

	public JourneyDeletionCommand(Map<String, String> form) {
		this.form = form;
	}

	@Override
	public boolean execute() {
		TravelBookingDatabase db = TravelBookingDatabase.getInstance();
		String id = form.get("Journey ID");
		return db.journeyDB.remove(id);
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