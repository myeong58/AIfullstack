package ex05;

public class Car {
	String model;
	
	static int num_car;
	
	Car(String model){
		this.model = model;
		System.out.println("차량 구입, 이름: " + model);
		num_car++;
	}
	
	static void showTotalCars() {
		System.out.println("구매한 차량 수:" + num_car);
	}
}
