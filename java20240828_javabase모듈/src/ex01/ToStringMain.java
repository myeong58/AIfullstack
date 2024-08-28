package ex01;

class A{
	String name ="홍길동";
	int age = 100;

	@Override
	public String toString() {
		return "A [이름=" + name + ", 나이=" + age + "]";
	}

	
	
}

public class ToStringMain {

	public static void main(String[] args) {
			
		Object obj = new A();
		
		System.out.println(obj.toString());
		System.out.println(obj);
	}

}
