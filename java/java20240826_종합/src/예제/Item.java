package 예제;

public class Item {
	String name;
	int price;
	
	public Item() {}
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	int getPrice(){
		return price;
	}
	
	public void print() {
		System.out.println("이름: " + name + ", 가격: " + price);
	}

}
