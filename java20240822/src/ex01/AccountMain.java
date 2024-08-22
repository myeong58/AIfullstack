package ex01;

public class AccountMain {

	public static void main(String[] args) {
		Account a = new Account();
	
		a.deposit(10000);
		a.withdraw(9000);
		a.withdraw(2000);

		System.out.printf("잔액: %d", a.getBalance());
	}

}
