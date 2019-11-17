package Travel.vehicules.sections;

public abstract class InsideCabinSection extends CabinSection {
	
	private int capacity = 4;
	
	private Double priceRatio = 0.5;

	public int getCapacity() {
		return capacity;
	}
	
	public Double getPriceRatio() {
		return priceRatio;
	}
	
}
