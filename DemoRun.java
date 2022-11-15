package Project;

import java.util.Scanner;

public class DemoRun {
	
	public static void main(String[] args) {
		AdminClass admin;
		DemoProducts dp = new DemoProducts();
		admin = dp.getUpdatedList();
		CustomerDetails custDetails = new CustomerDetails();
		
		Scanner scan = new Scanner(System.in);
		
		while(true){
			admin.banner();
			System.out.println("----------------------------------------------------------------------");
			System.out.println("\n1. Admin Login\t\t2.Biller Login\n\t\t3.EXIT.");
			switch(scan.nextInt()) {
			case 1:
				System.out.println("Enter username : ");
				String id = scan.next();
				if (id.equals("admin")) {
					System.out.println("Enter Password :");
					String password = scan.next();
					if(password.equals("admin")){
						while(true) {
							int flag = 0;
							System.out.println("-------------------------------------------------------");
							System.out.println("1.Add products\t\t\t5.Add Employee\n2.Remove Products\t\t" +
									"6.Remove Employee\n3.Update Products\t\t7.Get Employee Details\n" +
									"4.Show Inventory\t\t8.View Customer Log\n\t\t9.Logout");
							int n = scan.nextInt();
							switch(n){
							case 1:
								admin.addProducts();
								break;
							case 2:
								admin.removeProduct();
								break;
							case 3:
								admin.editProducts();
								break;
							case 4:
								admin.seeInventory();
								break;
							case 5:
								admin.addEmployee();
								break;
							case 6:
								admin.removeEmployee();
								break;
							case 7:
								admin.seeEmployee();
								break;
							case 8:
								admin.seeCustomer();
								break;
							case 9:
								flag = 1;
								break;
																
							default:
								System.out.println("Invalid Choice.");
							}
							if(flag == 1)
								break;
						}
					}
					else
						System.out.println("Wrong password!");
				}
				else
					System.out.println("Wrong Username!");
				break;
			case 2:
				System.out.println("Enter Employee id : ");
				int empid = scan.nextInt();
				int flag = 0;
				for (EmployeeDetails listofemp: admin.getListOfEmployee()){
					int flag2 = 0;
					if (listofemp.getEmpId() == empid){
						flag = 1;
						System.out.println("Enter username : ");
						String empname = scan.next();
						if (listofemp.getUsername().equals(empname)){
							System.out.println("Enter password : ");
							String emppass = scan.next();
							if(listofemp.getPassword().equals(emppass)){
								while(true){
									System.out.println("---------------------------------------------------------");
									System.out.println("Welcome to Rushikesh Mart!\n");
									Billing bill = new Billing();
									double amt = bill.bill(admin);
									
									listofemp.setSale(listofemp.getSale() + amt);
									System.out.println("Press 1 to continue or 0 to logout.");
									if(scan.nextInt() == 0)
										break;
								}
							}
							else{
								System.out.println("\nInvalid Password");
							}
						}
						else{
							System.out.println("\nInvalid username.");
						}
						if (flag2 == 1)
							break;
						
					}
				}
				if(flag == 0)
					System.out.println("Employee ID not found!!!\n");
				break;
			case 3:
				System.out.println("Thank you. Have a nice day!");
				System.exit(0);
			default:
				System.out.println("Wrong Option.\n");
			}
		}
	}
}
