package Project;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Cart {
	private HashMap<Integer, Integer> carthashmap;

	public Cart() {
		carthashmap = new HashMap<Integer, Integer>();
	}

	public HashMap<Integer, Integer> cartManagement(AdminClass admin) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("\nEnter 1 to add to cart.\t\t\tEnter 3 to view cart\n" +
					"Enter 2 to remove item from cart.\tEnter 4 to finalise the cart");
			int next = scan.nextInt();
			if (next == 1) {
				System.out.println("Enter Product id - ");
				int id = scan.nextInt();
				int flag = 0;
				for (ProductDetails list : admin.getListOfProduct()) {
					if (list.getProductid() == id) {
						flag = 1;
						System.out.println("Enter Quantity to buy - ");
						int quant = scan.nextInt();
						if (list.getProductStock() > quant) {
							carthashmap.put(id, quant);
							list.setProductStock(list.getProductStock() - quant);
						} else
							System.out.println("Item Out of stock!!!");
					}
				}
				if (flag == 0)
					System.out.println("Product not found!!!");
				flag = 0;
			}
			if (next == 4)
				return carthashmap;

			else if (next == 2) {
				System.out.println("Enter id to remove - ");
				int id = scan.nextInt();
				int quantity = carthashmap.get(id);
				carthashmap.remove(id);
				for (ProductDetails list : admin.getListOfProduct()) {
					if (list.getProductid() == id) {
						list.setProductStock(list.getProductStock() + quantity);
					}
				}
				System.out.println("Product removed successfully.\n");
			} else if (next == 3)
				seecart(admin);

		}
	}// cartManagement()
	
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

	public void seecart(AdminClass admin) {
		double amount = 0.0;
		System.out.println("------------------------------------------------");
		System.out.println(String.format("|%-10s||%-10s||%-10s||%-10s|","PrdName","PrdQt","PrdPrice","PrdAmount"));
		System.out.println("------------------------------------------------");
		for (Integer hmap: carthashmap.keySet()){
			int quantity = carthashmap.get(hmap);
			amount += (quantity * price(admin, hmap));
			System.out.println(String.format("|%-10s||%-10d||%-10s||%-10s|", getname(admin, hmap), quantity, String.format("%.2f",price(admin, hmap)), String.format("%.2f",amount)));
		}
		System.out.println("------------------------------------------------");
	}
}
