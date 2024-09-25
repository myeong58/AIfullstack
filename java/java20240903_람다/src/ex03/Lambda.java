package ex03;

import java.util.function.Supplier;

interface Mym{
	int max(int x, int y);
}

interface Mys{
	int square(int x);
}


interface Myp{
	void printVar(String name, int i);
}

interface Myss{
	int sumArr(int[] arr);
}

public class Lambda {

	public static void main(String[] args) {
		Mym m = (x, y) -> x > y  ?  x : y;
		
		Myp p = (name, i) -> System.out.println(name + "=" + i);
		
		Mys s = (x) -> x*x;
		
				
		Supplier<Integer> roll = () -> (int)(Math.random() * 6);

		
		Myss ss = (int[] arr) -> {
			int sum=0;
			for(int i:arr)
				sum+=i;
			return sum;
		};
		
	}

}
