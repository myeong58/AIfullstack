package 연습문제;

public class CreditCardPayment implements Payment{
	@Override
	public void makePayment(double amount) {
		System.out.println("신용카드로 " + amount+ "원을 결제합니다.");
	}

}
