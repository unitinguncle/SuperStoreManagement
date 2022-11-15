package Project;

public class ProductDetails {
	private int productid;
	private String productName;
	private double productPrice;
	private int productStock;
	private String productExpiry;  
	
	public int getProductid() {
		return productid;
	}


	public void setProductid(int productid) {
		this.productid = productid;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getProductStock() {
		return productStock;
	}


	public void setProductStock(int productStock) {
		this.productStock = productStock;
	}


	public void setProductExpiry(String productExpiry) {
		this.productExpiry = productExpiry;
	}


	public String getProductExpiry() {
		return productExpiry;
	}
	
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}


	public ProductDetails() {
		}
	
	public ProductDetails(int productid, String productName,double productPrice, int productStock, String productExpiry) {
		this.productid = productid;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productStock = productStock;
		this.productExpiry = productExpiry;
		
	}

	@Override
	public String toString() {
		return "ProductDetails [productid=" + productid + ", productName="
				+ productName + ", productPrice=" + productPrice
				+ ", productStock=" + productStock + ", productExpiry="
				+ productExpiry + "]";
	}
	
}
