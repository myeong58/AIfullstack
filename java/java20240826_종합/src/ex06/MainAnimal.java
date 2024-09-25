package ex06;

public class MainAnimal {
	public static void main(String[] args) {
		//Animal an = new Animal(); error 추상 클래스는 객체를 생성할 수 없음		
		
		Dog dog = new Dog("강아지", 2);
		dog.speak();
		
		Cat cat = new Cat("고양이", 3);
		cat.speak();
		
		Cow cow = new Cow();
		cow.speak();
	}
}
