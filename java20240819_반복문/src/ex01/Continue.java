package ex01;

public class Continue {

	public static void main(String[] args) {
		
		//0~10 짝수 합 구하기
		int sum = 0;
		for(int i=0; i<=10; i+=2)
			sum += i;
		System.out.println(sum);
	
		
		//2의 배수 | 3의 배수가 아닌 숫자만 출력(1~10사이)
		sum=0;
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) continue;	
			if(i%3 == 0) continue;
			System.out.print(i + ", ");
		}
			
	}
}
