package Assignment7;
import java.util.Scanner;

public class Shop {
	
	Scanner sc = new Scanner(System.in);
	
	//Creating the Manager of the Shop
	Manager M=new Manager("Shatish","434543634","NewDelhi");
	
	
	 //Hard Coding Some of the Items
	static Item a = new Item("Choclate",200,10);
	static Item b = new Item("Ice-Cream",20,15);
	static Item c = new Item("Chips",10,150);
	static Item d = new Item("Kurkure",16,50);
	
	void takeOrder(Customer cus) {
		int n;
		System.out.println("Enter Number of Choices: "+cus.getName());
		n = sc.nextInt();
		System.out.println("Enter Your Choices like 1 2 3 4");
		
		int choice[] = new int[n];
		for(int i=0;i<n;i++) {
			choice[i]=sc.nextInt();
		}
		
		int total=0;
		for(int i=0;i<choice.length;i++) {
			
			if(choice[i]==1) {
				total+=a.getAmount();
			}
			if(choice[i]==2) {
				total+=b.getAmount();
			}
			if(choice[i]==3) {
				total+=c.getAmount();
			}
			if(choice[i]==4) {
				total+=d.getAmount();
			}
		}
		
		try {
			M.verify(cus);
		} catch (Fraud e) {
			System.out.println(e.toString());
			System.exit(1);
		}
		
		System.out.println("Your Total :"+total+"\n");
		
	}

	public static void main(String[] args) {
		Shop OnlineShop = new Shop();
		
		//Hard Coding Some of the customers
		PrimeCustomer c1 = new PrimeCustomer("Yash","452365654");
		PrimeCustomer c2 = new PrimeCustomer("Anuj","742490752");
		NonPrimeCustomer c3 = new NonPrimeCustomer("Ashutosh","66734543");
		
		//to show the items-list to customers
		a.ItemDescription();
		b.ItemDescription();
		c.ItemDescription();
		d.ItemDescription();
		
		
		OnlineShop.takeOrder(c1);
		OnlineShop.takeOrder(c2);
		OnlineShop.takeOrder(c3);
		
	}

}
