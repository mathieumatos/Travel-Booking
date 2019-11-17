package Travel.vehicules.sections;

public abstract class FamilyCabinSection extends CabinSection {
	
	private int capacity = 6;
	
	private Double priceRatio = 0.9;

	public int getCapacity() {
		return capacity;
	}
	
	public Double getPriceRatio() {
		return priceRatio;
	}
	
}
