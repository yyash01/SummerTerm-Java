package Assignment6;

public class Branches{
	String BranchName;
	boolean avail; // is this branch is availaible or not.
	int seats;
	
	//constructor
	Branches(String Bname,int seats){
		BranchName=Bname;
		this.seats=seats;
		avail = this.seats>0;
	}
	
	public String getBranchName() {
		return BranchName;
	}
	public void setBranchName(String branchName) {
		BranchName = branchName;
	}
	public boolean isAvail() {
		return avail;
	}
	public void setAvail(boolean avail) {
		this.avail = avail;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
}
