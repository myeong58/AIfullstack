package ex05;

public class PartTimeStudent extends Student{
	String job;
	int pay;
	
	public PartTimeStudent() {}

	public PartTimeStudent(String name, int age, String school, String studentID, String job, int pay) {
		super(name, age, school, studentID);
		this.job = job;
		this.pay = pay;
	}
	
	@Override
	public void introduce() {
		super.introduce();
		System.out.printf("근무지는 %s이고, 급여는 %d원입니다.\n", job, pay);
	}
	
	public void work() {
		System.out.println("근무 중!");
	}

}
