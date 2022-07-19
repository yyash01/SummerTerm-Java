package Assignment7;

public class Item {
	private String name;
	private int amount;
	private int Quantity;
	
	public Item(String name,int amnt,int Q) {
		this.name = name;
		amount = amnt;
		Quantity = Q;
	}
	
	boolean Available() {
		if(Quantity==0)return false;
		return true;
	}
	
	//Description of The Items
	public void ItemDescription() {
		System.out.println("Item Name : "+name);
		System.out.println("Item Amount : "+amount);
		System.out.println("Item Avialaible or Not : "+
		(Available()==true ? "Yes" : "No"));
		System.out.println();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	
	
}
