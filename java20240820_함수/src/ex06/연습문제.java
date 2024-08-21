package ex06;

import java.util.Scanner;

public class 연습문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		bank a = new bank();
		
		a.name = "현명";
		a.number = "0000";
		
		boolean check = true;
		
		while(check){
			System.out.println("1. 입금 | 2. 출금 | 3. 잔액 | 4. 계좌 정보 | 5. 종료");
			int n = scan.nextInt();
			
			if(n==1) {
				a.input();
			}
			else if(n==2) {
				a.output();
			}
			else if(n==3){
				a.count();
			}
			else if(n==4) {
				a.info();
			}
			else
				check = false;
				
		}
		System.out.println("프로그램 종료!");
				

	}

}

class bank{
	Scanner sc = new Scanner(System.in);
	String number;
	String name;
	int money = 0;
	
	void info() {
		System.out.printf("이름: %s, 계좌번호: %s, 잔액: %d\n", name, number, money);
	}
	
	void input() {
		System.out.print("입금할 금액>");
		int num = sc.nextInt();
		money += num;
	}
	
	void output() {
		System.out.print("출금할 금액>");
		int num = sc.nextInt();
		if (money - num < 0)
			System.out.println("잔액이 부족합니다.\n");
		else
			money -= num;
	}
	
	void count() {
		System.out.printf("%s님의 현재 잔액은 %d원 입니다.\n", name, money);
	}
	
}
