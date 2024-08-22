package ex06;

public class MathArrayUtils {
	
	public static int num = 100;
	
	public static int sum(int[] values) {
		int sum=0;
		for(int i=0; i<values.length; i++)
			sum += values[i];
		return sum;
	}
	
	static double average(int[] values) {

		double avg = sum(values) / values.length;
		
		return avg;
	}

	static int max(int[] values) {
		int max=0;
		for(int i=0; i<values.length; i++) {
			if(values[i] > max)
				max = values[i];
		}
		return max;
	}
	
	static int min(int[] values) {
		int min=99999;
		for(int i=0; i<values.length; i++) {
			if(values[i] < min)
				min = values[i];
		}
		return min;
	}
}
