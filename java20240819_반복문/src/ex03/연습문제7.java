package ex03;

import java.util.Scanner;

public class 연습문제7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		boolean check = true;
		
		while(check) {
			System.out.println("--------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("--------------------------------");
			
			System.out.print("선택> ");
			int num = scan.nextInt();
			
			switch(num) {
				case 1:
					System.out.print("예금액> ");
					count += scan.nextInt();
					break;
				case 2:
					System.out.print("출금액> ");
					int tmp = scan.nextInt();
					if(count-tmp < 0)
						System.out.println("잔액이 부족합니다.");
					else
						count -= tmp;
					break;
				case 3:
					System.out.print("잔고> " + count);
					System.out.println();
					break;
				case 4:
					System.out.print("\n프로그램 종료 ");
					check = false;
					break;
			}
		}

	}

}
