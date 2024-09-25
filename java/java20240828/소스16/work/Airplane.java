package work;

public class Airplane extends Plane{

	public Airplane() {}

	public Airplane(String planeName, int fuleSize) {
		super(planeName, fuleSize);
	}
	
	
	@Override
	void filght(int distance) {
		setFuelSize(getFuelSize() - distance * 3);
		
	}
	

	
	
}
