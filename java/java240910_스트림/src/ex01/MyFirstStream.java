package ex01;

import java.util.Arrays;

public class MyFirstStream {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6};
		
		int total = Arrays.stream(arr).filter(n -> n%2 == 1).sum();

		System.out.println(total);
	}

}
