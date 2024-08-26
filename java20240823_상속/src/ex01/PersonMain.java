package ex01;

public class PersonMain {

	public static void main(String[] args) {

		Person person = new Person("홍길동", 20);
		
		person.intruduce();
		person.walk();
		System.out.println("------------------------");
		
		Student student = 
				new Student("홍길동",20,"아주대학교", "12345678");
		
		student.intruduce();
		student.walk();
		student.study();
		System.out.println("------------------------");
		
		Saleman sale = 
				new Saleman("홍길순",22,"삼성", 100000);
		
		sale.intruduce();
		sale.walk();
		sale.work();
	}
}
