package Assignment7;

public class Customer {
	
	private String name;
	private String phoneNumber;
	public String type;
	 
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Customer(String name,String phone) {
		this.setName(name);
		this.setPhoneNumber(phone);
		this.type="";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}

class PrimeCustomer extends Customer {

	public PrimeCustomer(String name, String phone) {
		super(name, phone);
		this.type = "Prime";
	}
}

class NonPrimeCustomer extends Customer {

	public NonPrimeCustomer(String name, String phone) {
		super(name, phone);
		this.type = "NonPrime";
	}
}

