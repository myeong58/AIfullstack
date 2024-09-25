package collection;

import java.util.HashSet;
import java.util.Set;

public class ProductTest {

	public static void main(String[] args) {

		HashSet<Product> set = new HashSet<Product>();
		
		Product p1 = new Product("p100", 	"TV", 			"20000");
		Product p2 = new Product("p200", 	"Computer", 	"10000");
		Product p3 = new Product("p100", 	"MP3", 			"700");
		Product p4 = new Product("p300", 	"Audio",	 	"1000");
		
		Product[] pp = {p1, p2, p3, p4};
		
		for(Product p: pp) {
			if(!set.contains(p)) {
				set.add(p);
				System.out.println("성공적으로 저장되었습니다.");
			}else
				System.out.println("동일한 ID의 제품이 이미 저장되어 있습니다.");
		}
		
		System.out.println("제품 ID\t 제품명\t\t 가격");
		System.out.println("--------------------------------");
		
		for(Product n: set)
			System.out.printf("%s\t %-8s\t  %s\n", 
					n.getProductID(), n.getProductName(), n.getProductPrice() );
		
		
	}

}
