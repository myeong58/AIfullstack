package work;

public class Cargoplane extends Plane{

	public Cargoplane() {}
	
	public Cargoplane(String planeName, int fuleSize) {
		super(planeName, fuleSize);
	}

	@Override
	void filght(int distance) {
		setFuelSize(getFuelSize() - distance * 5);
		
	}
	

}
