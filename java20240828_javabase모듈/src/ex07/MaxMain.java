package ex07;

public class MaxMain {
	public static void main(String[] args) {
		
		int max = maxFunc(12,20,2);
		System.out.println(max);
		
		int min = minFunc(12,0,2);
		System.out.println(min);
	}

	static int maxFunc(int n1, int n2, int n3) {
		int max = 0;
		
//		max = Math.max(n1, n2);
//		max = Math.max(max, n3);
		max = Math.max(Math.max(n1, n2), n3);
				
		return max;
	}
	
	static int minFunc(int n1, int n2, int n3) {
		return Math.min(Math.min(n1, n2), n3);
	}
}

