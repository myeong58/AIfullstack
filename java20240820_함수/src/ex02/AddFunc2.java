package ex02;

public class AddFunc2 {

	public static void main(String[] args) {

		//정수 값 10을 전달하면 함수에서 1~10까지 합 구하여 리턴한다.
		int result = func(100);
		
		System.out.println(result);
		
	}
	
	static int func(int n) {
		
		int sum = 0;
		
		for(int i=0; i<=n; i++) {
			sum += i;
		}
		
		return sum;
	}

}
