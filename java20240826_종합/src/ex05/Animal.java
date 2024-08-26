package ex05;

class Animal{
	private String name; //멤버변수, 인스턴스 변수 --> 생성된 객체들이 개별적으로 가지고 있음.
	
	public Animal() {}

	public Animal(String name) {
		this.name = name;
	}

	void speak() {}
	
	void info() { //메소드, 인스턴스 메소드
		System.out.println(name + "입니다.");
	}
	
}