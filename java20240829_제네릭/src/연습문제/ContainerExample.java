package 연습문제;

class Container<T, V>{
	private T key;
	private V value;
	
	public T getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
	public void set(T key, V value) {
		this.key = key;
		this.value = value;
	}
	

	
}

public class ContainerExample {
	public static void main(String[] args) {
		Container<String, String> container1 = new Container<String, String>();
		container1.set("홍길동", "도적");
		String name1 = container1.getKey();
		String job = container1.getValue();
		System.out.printf("이름: %s, 직업:%s\n", name1, job);

		
		Container<String, Integer> container2 = new Container<String, Integer>();
		container2.set("홍길동", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
		System.out.printf("이름: %s, 나이:%d\n", name2, age);
	}
}

