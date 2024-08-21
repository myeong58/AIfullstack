package ex08;

public class BookMain {

		public static void main(String[] args) {
			BookClass b1 = new BookClass();
			
			b1.제목 = "책책책책책책책";
			b1.저자 = "홍길동";
			b1.가격 = 3000;
			
			b1.info();
			
			b1.입고(100);
			b1.판매(3);
			b1.총판매금액();
			
			b1.info();
			
		}
}

class BookClass{
	String 제목;
	String 저자;
	int 가격;
	int 재고수량;
	int 총판매금액;
	
	void 판매(int num) {
		재고수량 -= num;
		총판매금액 += 가격*num;
		System.out.printf("%d권 판매했습니다.\n",num);
	}
	void 입고(int num) {
		재고수량 += num;
		System.out.printf("%d권 입고되었습니다.\n",num);
	}
	void 총판매금액() {
		System.out.printf("현재 총 판매 금액은 %d원입니다.\n",총판매금액);
	}
	
	void info() {
		System.out.printf("제목: %s, 저자: %s, 가격: %d, 재고수량:%d\n", 제목, 저자, 가격, 재고수량);
	}
}