package ex05;

public class Car extends Vehicle{
	String fuelType; //연료 타입
	int seatingCapacity; //탑승 인원
	
	public Car() {}
	
	public Car(String licensePlate, String owner, String fuelType, int seatingCapacity) {
		super(licensePlate, owner);
		this.fuelType = fuelType;
		this.seatingCapacity = seatingCapacity;
	}
	
	@Override
	void info() {
		super.info();
		System.out.printf("연료 타입: %s\n", fuelType);
		System.out.printf("탑승 인원: %d명\n", seatingCapacity);
		System.out.printf("정비 비용: %.1f원\n", calculateMaintenanceCost() );
	}

	@Override
	double calculateMaintenanceCost() {
		return seatingCapacity * 10000.0;
	}
	
}
