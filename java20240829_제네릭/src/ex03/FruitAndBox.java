package ex03;

class Apple{

	@Override
	public String toString() {
		return "I am an apple.";
	}
}

class Orange{
	
	@Override
	public String toString() {
		return "I am an orange.";
	}
}

class Box<T>{
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}


public class FruitAndBox {

	public static void main(String[] args) {

//		error없이 동작하나 이런식으로 사용하지 않음
//		Box aBox = new Box();
//		aBox.setObj(new Apple());
//		Apple ap = (Apple)aBox.getObj();
//		System.out.println(ap);
		
		Box<Apple> aBox = new Box<Apple>();
		aBox.setObj(new Apple());
		Apple ap = aBox.getObj();
		System.out.println(ap);
	
//		의도하지 않은 error를 줄일 수 있음
//		aBox.setObj("new Apple()");
		
	}

}
