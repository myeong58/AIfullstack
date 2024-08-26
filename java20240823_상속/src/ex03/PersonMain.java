package ex03;

public class PersonMain {

	public static void main(String[] args) {

		Person person = new Person("홍길동", 20);
		
		person.introduce();
		person.walk();
		System.out.println("------------------------");
		
		Student student = 
				new Student("홍길동", 20, "아주대학교", "12345678");
		
		student.introduce();
		student.walk();
		student.study();
		System.out.println("------------------------");
		
		Saleman sale = 
				new Saleman("홍길순", 22, "삼성", 100000);
		
		sale.intruduce();
		sale.walk();
		sale.work();
		
		System.out.println("------------------------");
		PartTimeStudent partTimeStudent = 
				new PartTimeStudent("홍수빈", 20, "아주대", "12345678", "구내서점", 100000);
		
		partTimeStudent.introduce();
		partTimeStudent.walk();
		partTimeStudent.study();
	}
}
