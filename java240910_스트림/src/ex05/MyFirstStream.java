package ex05;

import java.util.Arrays;
import java.util.List;

public class MyFirstStream {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("alice", "bob", "charlie");
		
		list.stream()
		.map(str -> str.toUpperCase()) //대문자 변환
		.forEach(n -> System.out.println(n)); //출력
		
	}
}
