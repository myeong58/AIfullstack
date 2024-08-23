package ex05;

public class Truck extends Vehicle{
	double loadCapacity; //적재 용량
	
	public Truck() {}
	
	public Truck(String licensePlate, String owner,double loadCapacity) {
		super(licensePlate, owner);
		this.loadCapacity = loadCapacity;
	}

	@Override
	void info() {
		super.info();
		System.out.printf("적재 용량: %.1f톤\n", loadCapacity);
		System.out.printf("정비 비용: %.1f원\n", calculateMaintenanceCost() );

	}
	
	@Override
	double calculateMaintenanceCost() {
		return loadCapacity * 20000.0;
	}
}
