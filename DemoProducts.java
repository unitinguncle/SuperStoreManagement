package Project;

public class DemoProducts {
	AdminClass admin;

		public DemoProducts() {
			admin = new AdminClass();
			admin.addProductfromList(new ProductDetails(101, "TATA salt",67.5, 100, "13/03/2023"));
			admin.addProductfromList(new ProductDetails(102, "Horlicks",123.67, 500, "23/07/2023"));
			admin.addProductfromList(new ProductDetails(103, "Bournvita",24.5, 60, "33/05/2023"));
			admin.addProductfromList(new ProductDetails(104, "Maggie",56.7, 170, "13/09/2023"));
			admin.addProductfromList(new ProductDetails(105, "Colgate",56.78, 300, "12/03/2023"));
			admin.addProductfromList(new ProductDetails(106, "Parle g",34.65, 7700, "25/12/2023"));
			admin.addProductfromList(new ProductDetails(107, "Boost",122.45, 700, "23/05/2023"));
			admin.addProductfromList(new ProductDetails(108, "Fogg",45.67, 8900, "23/12/2023"));
			
			admin.addEmployeefromList(new EmployeeDetails(111, "saiteja", "employee"));
			admin.addEmployeefromList(new EmployeeDetails(222, "pranay", "npci"));
			
			admin.addCustomerfromList(new CustomerDetails(8405822842L, "Rahul"));
			admin.addCustomerfromList(new CustomerDetails(1234567890L, "Sai Kiran"));

			
			//admin.seeInventory();
	}
		public AdminClass getUpdatedList(){
			return admin;
		}
		
}
