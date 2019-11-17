package Travel.entityFactories;

import Travel.journeys.Flight;
import Travel.journeys.Journey;

public class PlaneEntityFactory extends EntityFactory {

	private static PlaneEntityFactory instance;

	public PlaneEntityFactory() {
		// TODO - implement PlaneEntityFactory.PlaneEntityFactory
//		throw new UnsupportedOperationException();
	}

	public PlaneEntityFactory getInstance() {
		return this.instance;
	}
	
	@Override
	public Journey createJourney() {
		return new Flight();
	}

}