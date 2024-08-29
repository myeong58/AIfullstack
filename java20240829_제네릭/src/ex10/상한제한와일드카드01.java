package ex10;

class Box<T>{ 
	private T obj;

	public T getObj() { return obj; }
	public void setObj(T obj) { this.obj = obj; }

	@Override
	public String toString() {
		return obj.toString();
	}
}

class BoxFactory{
	public static <T> T openBox(Box<T> box){ 
		return box.getObj();
	}

	//? -> 와일드카드
	public static void peekBox(Box<?> box) {
		System.out.println(box);
	}
}

public class 상한제한와일드카드01 {

	public static void main(String[] args) {
	
		Box<String> box = new Box();
		box.setObj("Sweet");
		BoxFactory.peekBox(box);
	}

}
