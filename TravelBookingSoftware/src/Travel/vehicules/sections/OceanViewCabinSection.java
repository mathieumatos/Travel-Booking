package Travel.vehicules.sections;

public abstract class OceanViewCabinSection extends CabinSection {
	
	private int capacity = 2;
	
	private Double priceRatio = 0.75;

	public int getCapacity() {
		return capacity;
	}
	
	public Double getPriceRatio() {
		return priceRatio;
	}
	
}
