package Travel.Companies;

import Travel.VisitableJourney;

public abstract class Company implements VisitableJourney {

	private String companyID;
	
	public Company(String companyID) {
		this.companyID = companyID;
	}

	public String getCompanyID() {
		return companyID;
	}

	public void setCompanyID(String companyID) {
		this.companyID = companyID;
	}

}