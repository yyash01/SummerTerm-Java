package Assignment3;
// Question 3 Solution - file

class Invoice{
	private String number,description;
	private int quantity;
	private double ppi; // ppi = price per item
	
	//constructor
	public Invoice()
	{
		number = "A1";
		description = "item";
		quantity=0;
		ppi=0.0;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if(quantity < 0) {
			this.quantity = 0;
			return;
		}
		this.quantity = quantity;
	}

	public double getPpi() {
		return ppi;
	}

	public void setPpi(double ppi) {
		if(ppi < 0.0) {
			this.ppi = 0.0;
			return;
		}
		this.ppi = ppi;
	}
	
	public double getInvoiceAmount() {
		return (quantity*ppi);
	}
	
	public void printItemDetail()
	{
		System.out.println("number of Item : "+number);
		System.out.println("description of Item : "+description);
		System.out.println("Quantity of Item : "+quantity);
		System.out.println("price per Item  : "+ppi);
		System.out.println("");
	}
	
}

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice A = new Invoice();
		Invoice B = new Invoice();
		A.setNumber("112");
		A.setQuantity(5);
		A.setDescription("Maggi");
		A.setPpi(3.43);
		
		B.setNumber("113");
		B.setQuantity(2);
		B.setDescription("Noodles");
		B.setPpi(4.43);
		
		System.out.println("Deatils of A : ");
		A.printItemDetail();
		
		System.out.println("Deatils of B : ");
		B.printItemDetail();
		
		B.setPpi(-4.43);
		System.out.println("B's price per item : "+B.getPpi());
		
		
	}

}
/*
	Output :
  
Deatils of A : 
number of Item : 112
description of Item : Maggi
Quantity of Item : 5
price per Item  : 3.43

Deatils of B : 
number of Item : 113
description of Item : Noodles
Quantity of Item : 2
price per Item  : 4.43

B's price per item : 0.0

 */

