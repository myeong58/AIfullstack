package ex05;

//final class Student --> Student 클래스 상속 불가 
public class Student extends Person{
	String school;
	String studentID; //학번
	
	public Student() {}
	
	public Student(String school, String studentID) {
		this.school = school;
		this.studentID = studentID;
	}
	
	public Student(String name, int age, String school, String studentID) {
		super(name, age);
		this.school = school;
		this.studentID = studentID;
	}
	
	@Override //@:어노테이션 --> 상위클래스 메소드를 하위클래스가 재정의했다.
	public void introduce() {
		super.introduce();
		//System.out.printf("안녕하세요. 제 이름은 %s이고, 나이는 %d살입니다.\n", name, age);
		System.out.printf("학교는 %s이고, 학번은 %s입니다. \n", school, studentID);
		
	}

	public void study() {
		System.out.println(name + "이(가) 공부하고 있습니다.");
	}
	
	
}
