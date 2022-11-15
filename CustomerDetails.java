package Project;

public class CustomerDetails {
	private long phone;
	private String Name;
	private double custsale;
	
	public CustomerDetails() {
	}
	
	public CustomerDetails(long phone, String name) {
		this.phone = phone;
		Name = name;
	}
	
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getcustSale() {
		return custsale;
	}
	public void setcustSale(double sale) {
		this.custsale = sale;
	}

	@Override
	public String toString() {
		return "CustomerDetails [phone=" + phone + ", Name=" + Name + ", sale="
				+ custsale + "]";
	}
}
