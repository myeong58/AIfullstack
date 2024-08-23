package ex05;

public class PersonMain {

	public static void main(String[] args) {
		
		//상위클래스(Person)는 하위클래스(Student)를 참조할 수 있다. 
		//단, 접근할 수 있는 영역은 상위클래스(Person)내로 한정된다. 
		Person p1 = new Person();
		
		Person ps1 = new Student();
		Person pps1 = new PartTimeStudent();
		
		//Student s2 = new Person();
		/*이유: s2는 Student 참조변수이기 때무에
		 * Student와 Person 정보를 다 활용할 수 있다.
		 * 그러나 Person 객체를 참조하면 그 객체안에는
		 * person 정보만 있기 때문에 기능이 제한된다.
		 * 
		 */

		
		//강제 타입 변환
		Student s2 = (Student) ps1;

		//Student s3= (Student) p1; error		
		
		Person p2 = new PartTimeStudent();

		Student s3 = (Student) p2;

		PartTimeStudent pp3 = (PartTimeStudent) p2;

		
	}
}
