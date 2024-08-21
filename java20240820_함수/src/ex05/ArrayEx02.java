package ex05;

public class ArrayEx02 {

	public static void main(String[] args) {
		
		int[] oldIntArray = {1,2,3};
		
		int[] newIntArray = new int[5];
		
		newIntArray = oldIntArray;
		
		oldIntArray[2]=300;
		for(int i=0; i<oldIntArray.length; i++)
			System.out.println(oldIntArray[i]);
		
		System.out.println();
		
		for(int i=0; i<newIntArray.length; i++)
			System.out.println(newIntArray[i]);
	
		
		System.out.println("--------------------");
		
		int[] oldIntArray2 = {1,2,3};
		int[] newIntArray2 = new int[5];
		
		for(int i=0; i<oldIntArray2.length; i++)
			newIntArray2[i] = oldIntArray2[i];
		
		oldIntArray[2]=300;
		for(int i=0; i<oldIntArray2.length; i++)
			System.out.println(oldIntArray2[i]);
		
		System.out.println();
		
		for(int i=0; i<newIntArray2.length; i++)
			System.out.println(newIntArray2[i]);
		

		System.out.println("--------------------");
		
		
		//oldIntArray3에 있는 값을 newIntArray3로 복사
		int[] oldIntArray3 = {10,20,30,40,50};
		int[] newIntArray3 = new int[5];
		System.arraycopy(oldIntArray3, 0, newIntArray3, 0, oldIntArray3.length);
		
		for(int i=0; i<newIntArray3.length; i++)
			System.out.println(oldIntArray3[i]);
		
		System.out.println("------");
		
		for(int i=0; i<newIntArray3.length; i++)
			System.out.println(newIntArray3[i]);
		
		System.out.println("------");
		
		for(int n : newIntArray3)
			System.out.println(n);
		
		String str[] = {"java", "spring", "python", "javascript"};
		for(String s: str)
			System.out.println(s);
		
		
	}

}
