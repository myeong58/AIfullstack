package ex17;

import java.util.HashMap;

public class HashMap02 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "kim");
		map.put(2, "park");
		map.put(3, "hong");
		map.put(4, "lee");
		map.put(4, "cho");
	
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(3));
		System.out.println(map.get(4));
	}
	
}
