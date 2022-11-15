package Project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Billing {
	public double price(AdminClass admin, int id){
		for (ProductDetails arr: admin.getListOfProduct()) {
			if(arr.getProductid() == id)
				return arr.getProductPrice();
		}
		return 0.0;
	}
	
	public String getname(AdminClass admin, int id){
		for (ProductDetails arr: admin.getListOfProduct()) {
			if(arr.getProductid() == id)
				return arr.getProductName();
		}
		return "";
	}
	
	public double bill(AdminClass admin){
				
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Mobile Number : ");
		long ph = scan.nextLong();
		admin.addCustomer(ph);
		
		Cart rahulCart = new Cart();
		HashMap<Integer, Integer> hashcart = rahulCart.cartManagement(admin);
		
		double amount = 0.0;
		
		try{
			Thread.sleep(100);
			System.out.println(String.format("\n|%45s|","RUSHIKESH MART               "));
			Thread.sleep(100);
			System.out.println(String.format("|%45s|","Talentsprint-NPCI              "));
			Thread.sleep(100);
			System.out.println(String.format("|%45s|","INVOICE                   "));
			Thread.sleep(100);
			java.util.Date date = new java.util.Date(); 
			System.out.println(String.format("|%45s|",date));
			
			Thread.sleep(100);
			System.out.println("---------------------------------------------");
			Thread.sleep(100);
			System.out.println(String.format("|%-10s|%-10s|%-10s|%-10s|","PrdName","PrdQt","PrdPrice","PrdAmount"));
			Thread.sleep(100);
			System.out.println("---------------------------------------------");
			Thread.sleep(100);
			for (Integer hmap: hashcart.keySet()){
				int quantity = hashcart.get(hmap);
				amount += (quantity * price(admin, hmap));
				System.out.println(String.format("|%-10s|%-10d|%-10s|%-10s|", getname(admin, hmap), quantity, 
						String.format("%.2f",price(admin, hmap)), String.format("%.2f",amount)));
				Thread.sleep(100);
			}
			System.out.println("---------------------------------------------");
			Thread.sleep(100);
			System.out.println("\t\tTotal bill : Rs."+String.format("%.2f",amount));
			Thread.sleep(100);
			System.out.println("\tThank You , " + admin.getCustomerName(ph) + " Visit Again!\n");
			}
		catch(InterruptedException ex){
			ex.getStackTrace();
		}
		
		admin.setsalesofCustomer(ph, amount);
		return amount;
	}
	
}
