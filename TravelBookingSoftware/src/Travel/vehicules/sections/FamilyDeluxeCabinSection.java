package Travel.vehicules.sections;

public abstract class FamilyDeluxeCabinSection extends CabinSection {
	
	private int capacity = 6;
	
	private Double priceRatio = (double) 1;

	public int getCapacity() {
		return capacity;
	}
	
	public Double getPriceRatio() {
		return priceRatio;
	}
	
}
