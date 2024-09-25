package ex06;

abstract class Animal{//추상 클래스(미완성클래스) -> 객체 생성 불가능
	private String name; //멤버변수, 인스턴스 변수 --> 생성된 객체들이 개별적으로 가지고 있음.
	
	public Animal() {}

	public Animal(String name) {
		this.name = name;
	}

	abstract void speak(); //추상 메소드
	
	void info() { //메소드, 인스턴스 메소드
		System.out.println(name + "입니다.");
	}
	
}