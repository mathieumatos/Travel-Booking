package Travel.Companies;

import Travel.JourneyVisitor;

public class TrainCompany extends Company {

	public TrainCompany(String companyID) {
		super(companyID);
	}

	@Override
	public void accept(JourneyVisitor jv) {
		this.accept(jv);
		
	}
}