package ex01;

import java.util.ArrayList;

class A{
	@Override
	public String toString() {
		return "A class";
	}
}

public class ArrayList01 {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(10);
		list.add(new Integer(20));
		list.add("kor");
		list.add(new A());
		
		for(Object obj : list)
			System.out.print(obj + " ");
		
	}

}
