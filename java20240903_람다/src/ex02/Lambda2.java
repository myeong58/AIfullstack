package ex02;

interface Printable{
	void print(String msg);
}

class Printer implements Printable{
	
	@Override
	public void print(String msg) {
		System.out.println(msg);
	}
}

public class Lambda2 {

	public static void main(String[] args) {

		Printable p = new Printer();
		p.print("이 문장 출력 요망!");
	
			
	}

}
