package ex06;

public class StudentMain {

	public static void main(String[] args) {
		
//		Student s1 = new Student();	
//		s1.setName("차은우");
//		System.out.println(s1.getName());
		
		System.out.println(Student.job);
		
		Student.change("차승우");

		System.out.println(Student.job);
		
		Student s2 = new Student();
		 
		s2.change("접근가능");//권장 x --> static인지 아닌지 헷갈릴 있음

		
		
		
	
	}

}
