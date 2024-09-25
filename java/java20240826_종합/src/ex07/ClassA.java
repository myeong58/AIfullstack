package ex07;

public class ClassA {
	private int a;
	
	public ClassA() {}
	
	public ClassA(int a) {
		this.a = a;
	}
	
	public int getA() {
		return a;
	}
	
	public void info() {
		System.out.print(this.a + " ");

	}
}
