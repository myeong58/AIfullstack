package ex01;

import java.util.Random;

public class 로또3 {
	public static void main(String[] args) {
		//로또 -> 5게임
		
		int lotto[] = new int[45]; //45개방 개설
		
		Random random = new Random();
		
		for(int i=0; i<45; i++) // 1~45개 숫자 대입
			lotto[i] = i+1;
		
		for(int k=0; k<5; k++) { //로또 게임 5개
			
			for(int i=0; i<45; i++) { // 배열 섞기
				int index = random.nextInt(45);
				int tmp = lotto[i];
				lotto[i] = lotto[index];
				lotto[index] = tmp;
				
			}
					
			for(int j=0; j<6; j++) //앞자리 6개 출력
				System.out.print(lotto[j] + " ");
			System.out.println();

			
		}
	}
}
