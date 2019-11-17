package CommandPackage;

import java.util.Map;

import Travel.Companies.PlaneCompany;
import data.TravelBookingDatabase;

public class CompanyCreationCommand implements Command {

	private String name = "CompanyCreationCommand";

	private Map<String, String> form;

	public CompanyCreationCommand(Map<String, String> form) {
		this.form = form;
	}

	@Override
	public boolean execute() {
		TravelBookingDatabase db = TravelBookingDatabase.getInstance();
		String id = form.get("Company ID");
		return db.companyDB.add(id, new PlaneCompany(id));
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