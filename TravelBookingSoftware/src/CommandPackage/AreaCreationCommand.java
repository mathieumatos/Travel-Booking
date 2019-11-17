package CommandPackage;

import java.util.Map;

import Travel.areas.Airport;
import data.TravelBookingDatabase;

public class AreaCreationCommand implements Command {

	private String name = "CompanyCreationCommand";
	
	private Map<String, String> form;

	public AreaCreationCommand(Map<String, String> form) {
		this.form = form;
	}
	
	@Override
	public boolean execute() {
		TravelBookingDatabase db = TravelBookingDatabase.getInstance();
		String id = form.get("Area ID");
		return db.areaDB.add(id, new Airport(id));
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