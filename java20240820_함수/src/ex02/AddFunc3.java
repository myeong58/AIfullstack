package ex02;

public class AddFunc3 {

	public static void main(String[] args) {

		//정수 값 n을 전달하면 함수에서 1~n까지 평균을 구하여 리턴한다.
		double result = func(100);
		
		System.out.println(result);
		
		int num = 10;
		
		int nArr[] = {1,2,3,4,5};
		
		
		
	}
	
	static double func(int n) {
		
		int sum = 0;
		
		for(int i=0; i<=n; i++) {
			sum += i;
		}
		
		return (double) sum/n;
	}

}
