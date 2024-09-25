package 연습문제;

public class SaleTV extends TV{
	private int price;

	public SaleTV() {}
	
	public SaleTV(String model, int size, int channel, int price) {
		super(model, size, channel);
		this.price = price;
	}

	public void paly() {
		System.out.println("판매TV 채널 "+ getChannel() +"번의 프로를 플레이 합니다.");
	}

	public void sale() {
		String str_price = String.format("%,d", this.price);
		System.out.printf("%s모델의 상품을 판매합니다. %s원을 지불해 주세요.\n", getModel(), str_price);
	}
	
	public String toString() {
		String str_price = String.format("%,d", this.price);
		String s = "판매상품정보 : 모델명(" + getModel() + "), 가격(" + str_price + "원), 크기(" + getSize()+ ")";
		return s;
	}
	
	

}
