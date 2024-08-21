package ex01;

import java.util.Random;

public class 연습문제 {
	
	public static void main(String[] args) {
		
		//int 형 배열 참조변수 nArr 설정
		int nArr[] = new int[5];
		int l = nArr.length;
		
		//배열 초기화 -> 값 범위는 1~100 => 랜덤함수 이용해서
		for(int i=0; i<l; i++)
			nArr[i] = (int)(Math.random()*100) + 1;
		
		for(int i=0; i<l; i++)
			System.out.print(nArr[i] + ", ");
		
		//최대값 & 최소값 구하기
		int max = 0; int min = 999;
		for(int i=0; i<l; i++) {
			if(nArr[i] < min)
				min = nArr[i];
			if(nArr[i] > max)
				max = nArr[i];
		}	
		System.out.print("\n최대값: " + max + " 최소값: " + min);
		
		//총점 & 평균
		int sum = 0; double avg = 0.1;
		
		for(int i=0; i<l; i++) {
			sum += nArr[i];
		}
		avg = sum/l;
		
		System.out.print("\n총점: " + sum + " 평균: "+ avg);
		
		//오름차순 정렬(이중 for)
		
		for(int i=0; i<l;i++) {
			for(int j=0; j<l-i-1; j++) {
				if(nArr[j] > nArr[j+1]) {
					int tmp = nArr[j];
					nArr[j] = nArr[j+1];
					nArr[j+1] = tmp;
				}
			}
		}
		
		System.out.println();
		for(int i=0; i<l; i++)
			System.out.print(nArr[i] + ", ");
		
	}

}
