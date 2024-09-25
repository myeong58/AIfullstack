package ex03;

public class MainAnimal {
	public static void main(String[] args) {
		Dog dog = new Dog("강아지", 2);
		dog.info();
		dog.speak();
		
		Cat cat = new Cat("고양이", 3);
		cat.info();
		cat.speak();
	
	}

}
