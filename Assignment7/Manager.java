package Assignment7;

public class Manager {
	private String name;
	private String PhoneNumber; 
	private String Address;
	
	public Manager(String name,String PhoneNumber,String Address) {
		this.name = name;
		this.PhoneNumber=PhoneNumber;
		this.Address = Address;
	}
	
	//verification of the customer by manager
	public void verify(Customer cus) throws Fraud{
		if(cus.getType()=="NonPrime") {
			throw new Fraud();
		}
		else {
			System.out.println("Prime Memeber");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	

}
