package ex05;

public class Vehicle {
	String licensePlate; //차량 번호
	String owner; //소유자
	
	public Vehicle() {}

	public Vehicle(String licensePlate, String owner) {
		this.licensePlate = licensePlate;
		this.owner = owner;
	}
	
	//차량 시동
	void startEngine() {
		System.out.println("차량이 시동을 걸었습니다.");
	}
	
	void info() {
		System.out.println("차량 번호: " + licensePlate);
		System.out.println("소유자: " + owner);
		startEngine();
	}
	
	double calculateMaintenanceCost() {
		return 0;
	}		
}
