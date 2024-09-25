package ex01;

public class Main {
	public static void main(String[] args) {
//		ClassA a = new ClassC();
//	
//		a.info();
//		((ClassB) a).info();
//		
//		if (a instanceof ClassB) { // a가 ClassB의 인스턴스인지 확인
//            ClassB b = (ClassB) a; // 다운캐스팅
//            b.info(); // ClassB의 info 호출
//		}
		
		 ClassA a = new ClassC();  // 실제 객체는 ClassC
	        ClassB b = (ClassB) a;    // ClassB로 다운캐스팅
	        b.info();  // ClassB의 info 호출 x

	}
}
