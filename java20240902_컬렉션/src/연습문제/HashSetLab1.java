package 연습문제;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class HashSetLab1{
	public static void main(String[] args) {
		HashSet<Integer> s = new HashSet<Integer>();
		Random r = new Random();
		
		while(s.size() != 10) {
			s.add(r.nextInt(30)+1);
		}
		

		for(int n: s)
			System.out.print(n + ", ");
		
	
	}
}