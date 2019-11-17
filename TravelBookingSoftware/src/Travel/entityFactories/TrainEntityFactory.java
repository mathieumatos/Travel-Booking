package Travel.entityFactories;
public class TrainEntityFactory extends EntityFactory {

	private static TrainEntityFactory instance;

	public TrainEntityFactory() {
		// TODO - implement TrainEntityFactory.TrainEntityFactory
		throw new UnsupportedOperationException();
	}

	public TrainEntityFactory getInstance() {
		return this.instance;
	}
}