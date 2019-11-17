package data;

import Travel.Companies.Company;

public class CompanyDatabase extends ModifiableDatabase<Company> {

	@Override
	public boolean add() {
		return false;
	}

	@Override
	public boolean modify() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove() {
		// TODO Auto-generated method stub
		
		return false;
	}

	@Override
	public void attach(Observer ob) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void detach(Observer ob) {
		// TODO Auto-generated method stub
		
	}


}
