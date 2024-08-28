package 연습문제;

public class TVTest {
	public static void main(String args[]) {
		SaleTV st = new SaleTV("SALETV-1", 40, 1, 300000);
		RentalTV rt = new RentalTV("RENTALTV-10", 42, 1, 100000);
		
		st.channelUP();
		st.channelUP();
		
		rt.channelDown();
		rt.channelDown();
		rt.channelDown();
		
		printAllTV(st);
		printAllTV(rt);
		
		printRentalTV(rt);
		
	}
	static void printAllTV(TV tv) {
		System.out.println(tv.toString());
		if(tv instanceof SaleTV) {
			SaleTV st = (SaleTV)tv;
			st.paly();
			st.sale();
		}
		else {
			RentalTV rt = (RentalTV)tv;
			rt.paly();
		}
			
	}
	static void printRentalTV(Rentable tv) {
		tv.rent();
	}
}



//main
//  SaleTV, RentalTV 클래스 의 객체를 각각 생성한다
//	SaleTV 객체는 채널을 두 개 높인다
//	RentalTV 객체는 채널을 세 개 내린다
//	각 객체에 대하여 printAllTV() 을 호출한다
//	Rentable 타입의 객체 인 RentalTV 객 체는 printRentalTV() 를 호출한다

//printAllTV
// 아규먼트로 전달된 객체의 toString() 을 호출하여 각 상품의 정보를 출력한다
// 아규먼트로 전달된 객체의 play () 를 호출한다
// tv 변수에 전달된 객체가 Sa l eTV 타입이면 sale() 메서드를 호출한다

//printRentalTV
//아규먼트로 전달된 Rentable 객체의 rent() 메서드를 호출한다