package ex06;

import java.util.Scanner;

public class 예외처리01 {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int sum = 0;
		
		
		//try --> 문제가 될 소지가 있는 경우 try{} 블럭 내부에 작성
		//catch --> 예외(문제)가 발생하면 실행
		try {
			int a = 6/0;
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위를 벗어난 경우");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(ArithmeticException e){
			System.out.println("분모가 0인 경우");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(NullPointerException e){
			System.out.println("Null를 참조한 경우");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(Exception e){
			System.out.println("그 외 예외처리 구문");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	
		System.out.println("결과는 " + sum);
		
		System.out.println("프로그램 종료.");
	}
}
