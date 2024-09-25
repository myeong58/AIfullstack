package 연습문제;

public class CashPayment implements Payment {
	@Override
	public void makePayment(double amount) {
		System.out.println("현금로 " + amount+ "원을 결제합니다.");
	}

	
}
