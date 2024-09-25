package 연습문제1;

class Pair<T, V>{
	private T t;
	private V v;
	
	public void setFirst(T t) { this.t = t; }
	
	public void setSecond(V v) { this.v = v;}
	
	public T getFirst() { return t; }
	
	public V getSecond() { return v;}

	@Override
	public String toString() {
		return "Pair{first="+ t + ", second="  +  v + "}";
	}
}

public class PairTest {
	public static void main(String[] args) {
		Pair<Integer, String> pair1 = new Pair<>();
		pair1.setFirst(1);
		pair1.setSecond("data");
		System.out.println(pair1.getFirst());
		System.out.println(pair1.getSecond());
		System.out.println("pair1 = " + pair1);
		
		Pair<String, String> pair2 = new Pair<>();
		pair2.setFirst("key");
		pair2.setSecond("value");
		System.out.println(pair2.getFirst());
		System.out.println(pair2.getSecond());
		System.out.println("pair2 = " + pair2);
		
	}

}
