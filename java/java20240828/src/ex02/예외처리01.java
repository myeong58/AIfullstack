package ex02;

import java.util.Scanner;

public class 예외처리01 {
	public static void main(String[] args) {
		
		/*
		 * 예외처리 if~
		 */
		
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 정수를 입력하세요.");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		double result = 0;
		
		if(num2 !=0)
			result = num1 / num2;
	
		System.out.println("두 수를 나눈 결과는 " + result);
		
		System.out.println("프로그램 종료.");
	}
}
