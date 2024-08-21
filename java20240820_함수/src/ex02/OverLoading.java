package ex02;

public class OverLoading {

	public static void main(String[] args) {
		
		func();
		func(5);
		func(5,2);
		func("abcd");

	}

// 오버로딩의 조건
// 함수명은 같아야함, 매개변수의 종류 또는 개수가 다르면 가능
	static void func() {}
	static void func(int i) {}
	static void func(int i, int j) {}
	static void func(String s) {}
}
