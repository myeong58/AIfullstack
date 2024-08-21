package ex04;

import java.util.Scanner;

public class 연습문제 {

	public static void main(String[] args) {
		/*
		 * 1.과목 등록 | 2. 과목목록보기 | 3. 종료
		 * String 배열을 이용하여 작업하기(배열의 크기는 최대 10)
		 */
		Scanner scan = new Scanner(System.in);
		String[] classs = new String[10];
	
		int index = 0;
		boolean check = true;
		
		while(check) {
			System.out.println("--------------------------------");
			System.out.println("1.과목 등록 | 2. 과목목록보기 | 3. 종료");
			System.out.println("--------------------------------");

			System.out.print("선택> ");
			
			//int n = Integer.parseInt(scan.nextLine());
			int n = scan.nextInt();
			//엔터 제거
			scan.nextLine();
			switch(n) {
				case 1:
					System.out.print("과목명> ");
					classs[index++] = scan.nextLine();
					break;
				case 2:
					for(int i=0;i<index; i++) 
						System.out.print(classs[i] + ", ");
					System.out.println();
					break;
				case 3:
					check = false;
					break;
				default:
					System.out.println("1~3 사이의 숫자를 입력하세요.");
					break;
			}		
		}
		System.out.println("프로그램 종료!");
	}
}
