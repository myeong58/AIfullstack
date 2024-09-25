package 연습문제;

public class PayPalPayment implements Payment{
	@Override
	public void makePayment(double amount) {
		System.out.println("Paypal로 " + amount+ "원을 결제합니다.");
	}
}
