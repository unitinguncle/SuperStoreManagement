package Project;

public class EmployeeDetails {
	private int empId;
	private String username;
	private String password;
	private double sale;
	
	public EmployeeDetails() {
	}
	
	public EmployeeDetails(int empId, String username, String password) {
		super();
		this.empId = empId;
		this.username = username;
		this.password = password;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getSale() {
		return sale;
	}
	public void setSale(double sale) {
		this.sale = sale;
	}
	
}
