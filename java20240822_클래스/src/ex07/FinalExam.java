package ex07;

import ex06.MathArrayUtils;

public class FinalExam {
	
	final int MAX;
	
	FinalExam(int n){
		MAX = n;
	}

	public static void main(String[] args) {
		
		//final 함수는 값을 수정할 수 없음.
		final double PI = 3.14159; //상수(대문자로 작성)

		MathArrayUtils mUtil = new MathArrayUtils();
		int ss[] = {1, 2, 3, 4, 5};
		System.out.println(mUtil.sum(ss));
		System.out.println(mUtil.num);
		
		
		
	}

}
