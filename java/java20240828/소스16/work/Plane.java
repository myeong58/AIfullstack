package work;

abstract class Plane {
	private String planeName;
	private int fuelSize;
	

	public Plane() {}

	public Plane(String planeName, int fuleSize) {
		this.planeName = planeName;
		this.fuelSize = fuleSize;
	}
	
	public String getPlaneName() {
		return planeName;
	}
	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}
	public int getFuelSize() {
		return fuelSize;
	}
	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}

	public void refuel(int fuel) {
		fuelSize += fuel; 
	}

	abstract void filght(int distance);
}
