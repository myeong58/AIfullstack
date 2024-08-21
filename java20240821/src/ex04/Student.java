package ex04;

class Student{//클래스명 첫글자는 대문자, 변수 및 함수는 소문자
	
	private String name;
	private int age;
	private String phone;
	
	//Default 생성자 
	Student(){
		System.out.println("default 생성자 호출");
	}

	Student(String name, int age, String phone){
		this.name  = name;
		this.age = age;
		this.phone = phone;
	}
	
//	//write --> set+변수명
//	void nameChange(String name) {
//		this.name = name;
//	}
//	//read --> get+변수명
//		void nameInfo() {
//			System.out.println("이름: " + this.name);
//	}

	String getName() { //getter
		return this.name;
	}
	
	void setName(String name) { //setter
		this.name = name;
	}
	
	int getAge() {
		return this.age;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	String getPhone() {
		return this.phone;
	}
	
	void setPhone(String phone) { 
		this.phone = phone;
	}

	void info() {
		System.out.printf("이름: %s, 나이: %d, 전화번호: %s\n", 
				name, age, phone);
	}
	
	void 입실() {
		System.out.println("입실하다.");
	}
	void 퇴실() {
		System.out.println("퇴실하다.");
	}
	void 조퇴() {
		System.out.println("조퇴하다.");
	}
}