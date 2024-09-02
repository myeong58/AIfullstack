package 연습문제;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapLab1 {
	public static void main(String[] args) {
		HashMap<String, Integer> c = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		
		while(c.size()<5) {
			System.out.print("나라이름을 입력하세요: ");
			String s = sc.nextLine();
			System.out.print("인구수를 입력하세요: ");
			int i = sc.nextInt();
			sc.nextLine();
			
			if(c.put(s,i) == null)
				System.out.println("저장 되었습니다. ");
			else
				System.out.println("나라명 " + s + "는 이미 저장되었습니다.");
			
		}
		System.out.println("5개가 모두 입력되었습니다.");
		System.out.print("입력된 데이터 : ");
		
		Set<String> keySet = c.keySet();
		for (String key : keySet) {	
			System.out.print(key + "(" + c.get(key) +"), ");	
		}
	}
}
