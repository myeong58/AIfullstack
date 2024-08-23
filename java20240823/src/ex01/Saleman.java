package ex01;

public class Saleman extends Person {
	private String company;
	private int salary;
	
	public Saleman(String name, int age, String company, int salary) {
		super(name, age);
		this.company = company;
		this.salary = salary;
	}
	
	public void intruduce() {
		super.intruduce();
		//System.out.printf("안녕하세요. 제 이름은 %s이고, 나이는 %d살입니다.\n", name, age);
		System.out.printf("회사는 %s이고, 급여는 %s원 입니다. \n", company, salary);
		
	}

	public void work() {
		System.out.println(name + "이(가) 근무 중 있습니다.");
	}
	
	
}
