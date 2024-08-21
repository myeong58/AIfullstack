package ex05;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.info();
		
		Student s2 = new Student("차은우", 30, "000-2222-1111");
		s2.info();

//		s2.nameChange("차우은");
//		s2.nameInfo();

		s2.setName("차우은");
		System.out.println(s2.getName());
	}

}
