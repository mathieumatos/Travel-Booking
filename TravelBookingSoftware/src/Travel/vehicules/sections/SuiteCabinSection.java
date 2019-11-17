package Travel.vehicules.sections;

public abstract class SuiteCabinSection extends CabinSection {
	
	private int capacity = 5;
	
	private Double priceRatio = 0.9;

	public int getCapacity() {
		return capacity;
	}
	
	public Double getPriceRatio() {
		return priceRatio;
	}
	
}
