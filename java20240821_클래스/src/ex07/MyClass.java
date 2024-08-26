package ex07;

public class MyClass {
	//클래스 변수 (정적 변수)
	static String classVariable = "This is a class variable";
	
	//인스턴스 변수
	String instanceVariable;
	
	//생성자
	MyClass(String instanceVariable){
		this.instanceVariable = instanceVariable;
	}
	
	//인스턴스 메소드 --> 인스턴스 메소드, 인스턴스 변수, 클래스변수(정적변수), 클래스 메소드 다 접근 가능
	void instanceMethod() {
		System.out.println("This is an instance method");
		System.out.println("Instance variable: " + instanceVariable);
		System.out.println("Class variable: " + classVariable);
		
		//정적 메소드 호출
//		MyClass.classMethod();
	}
	
	static void classMethod2() {}
	
	//클래스 메소드 (정적 메소드) --> 접근 가능 영역은 클래스변수(정적변수), 클래스 메소드만 가능
	//-> 인스턴스 메소드, 인스턴스 변수 접근 불가
	static void classMethod() {
		System.out.println("This is an class method");
		System.out.println("Class variable: " + classVariable);
//		System.out.println("Instance variable: " + instanceVariable); // -> 접근 불가능

		classMethod2();
//		instanceMethod(); // -> 전근 불가능
		
		//인스턴스 생성 후 인스턴스 메소드 호출
		MyClass myInstance = new MyClass("Instance variable from class method");
		myInstance.instanceMethod();
	}
}
