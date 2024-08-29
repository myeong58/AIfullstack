package ex09;

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
	public static void peekBox(Box<? extends Number> box) {
		System.out.println(box);
	}
}

public class 와일드카드01 {

	public static void main(String[] args) {
	
		Box<Integer> ibox = new Box();
		ibox.setObj(1234);
		
		Box<Double> dbox = new Box();
		dbox.setObj(12.34);

		Box<String> sbox = new Box();
		sbox.setObj("1234");
		
		BoxFactory.peekBox(ibox);
		BoxFactory.peekBox(dbox);
		//BoxFactory.peekBox(sbox);
	}

}
