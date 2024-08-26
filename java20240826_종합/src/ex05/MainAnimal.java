package ex05;

public class MainAnimal {
	public static void main(String[] args) {
		speakTest(new Animal());
		speakTest(new Dog());
		speakTest(new Cat());
		speakTest(new 진돗개());
		
		Animal an1 = new Cat();
		Animal an2 = new Dog();
		Animal an3 = new 진돗개();
		
		
	}
	
	static void speakTest(Animal an) {
		
		an.speak();
	}

}
