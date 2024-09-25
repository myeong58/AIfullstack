package 연습문제;

public class MainPay {

	public static void main(String[] args) {
		Payment cp = new CreditCardPayment();
		Payment pp = new PayPalPayment();
		Payment cashp = new CashPayment();
		
		cp.makePayment(10000);
		pp.makePayment(10000);
		cashp.makePayment(10000);
		

	}

}
