package ex07;

public class ClassB extends ClassA{
	private int b;
	
	public ClassB() {}
	
	public ClassB(int b) {
		this.b = b;
	}
	
	public ClassB(int a, int b) {
		super(a);
		this.b = b;
	}

	public int getB() {
		return b;
	}
	
	public void info() {
		super.info();
		System.out.print(this.b + " ");
	}

}
