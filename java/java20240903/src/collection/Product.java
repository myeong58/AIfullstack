package collection;

public class Product {
	private String productID;
	private String productName;
	private String productPrice;
	
	public String getProductID() {
		return productID;
	}

	public String getProductName() {
		return productName;
	}

	public String getProductPrice() {
		return productPrice;
	}
	
	
    public boolean equals(Object obj) {
        Product p = (Product) obj;
        return productID.equals(p.productID);
    }
	
    @Override
    public int hashCode() {
        return productID.hashCode();
    }
	
	
	public Product() {}

	public Product(String productID, String productName, String productPrice) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	
	
}
