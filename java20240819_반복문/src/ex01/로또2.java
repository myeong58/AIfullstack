package ex01;

import java.util.Random;

public class 로또2 {
	public static void main(String[] args) {
		//로또 -> 5게임
		
		int lotto[] = new int[6];
		//(int)(Math.random()*45) + 1;
		//random.nextInt{45)+1;
		
		Random random = new Random();	
		
		for(int k=0; k<5; k++) {
			for(int i=0; i<6; i++) {
				lotto[i] = random.nextInt(45)+1;
				
				for(int j=0; j<i; j++) {
					if(lotto[i] == lotto[j]) {
						i--;
					}
				}
			}
			for(int i=0;i<6;i++)
				System.out.print(lotto[i] + ", ");
		
			System.out.println();
		}
	}
}
