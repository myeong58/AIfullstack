package ex03;

public class Book {
	String title; //제목
	String author; //저자
	int page; //페이지 수
	
	Book() {
		this("", "", 0);
	}
	
	Book(String title, String author) {
		this(title,author,0);
		System.out.println("변수 2개짜리 생성자");
		// 생성자에서 this는 항상 첫줄에 있을 것!
	}
	
	Book(String title, String author, int page) {
		this.title = title;
		this.author = author;
		this.page = page;
		//page = this.page; --> 오류
		
	}
	
	void displayInfo() {
		System.out.printf("제목: %s, 저자: %s, 페이지: %d\n", 
				this.title, this.author, this.page );
	
	}
	
}
