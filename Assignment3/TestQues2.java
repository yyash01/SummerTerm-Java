package Assignment3;

class SavingsAccount{
	static double annualInterestRate;
	
	private double savingsBalance;
	
	public SavingsAccount(double amnt) {
		savingsBalance = amnt;
	}
	
	double calculateMonthlyInterest() {
		return (savingsBalance*annualInterestRate)/12.00;
	}
	
	static void modifyInterestRate(double x) {
		annualInterestRate = x;
	}
	
	double getSavingBalance() {
		return savingsBalance;
	}
	
	void setSavingBalance(double y) {
		savingsBalance+=y;
	}
}
public class TestQues2 {

	public static void main(String[] args) {
		SavingsAccount saver1  = new SavingsAccount(2000.00);
		SavingsAccount saver2  = new SavingsAccount(3000.00);
		
		System.out.println("AnnualInterestRate set to 4% ");
		SavingsAccount.modifyInterestRate(0.04);
		
		double monthlyInterest_saver1 = saver1.calculateMonthlyInterest();
		double monthlyInterest_saver2 = saver2.calculateMonthlyInterest();
		
		saver1.setSavingBalance(monthlyInterest_saver1);
		saver2.setSavingBalance(monthlyInterest_saver2);
		
		System.out.println("Saving Balance for Saver1 : "+saver1.getSavingBalance());
		System.out.println("Saving Balance for Saver2 : "+saver2.getSavingBalance());
		
		SavingsAccount.modifyInterestRate(0.05);
		
		System.out.println("\nAnnualInterestRate changes to 5% ");
		saver1.setSavingBalance(saver1.calculateMonthlyInterest());
		saver2.setSavingBalance(saver2.calculateMonthlyInterest());
		
		System.out.println("Saving Balance for Saver1 : "+saver1.getSavingBalance());
		System.out.println("Saving Balance for Saver2 : "+saver2.getSavingBalance());
		
	}

}
/*
Output :

AnnualInterestRate set to 4% 
Saving Balance for Saver1 : 2006.6666666666667
Saving Balance for Saver2 : 3010.0

AnnualInterestRate changes to 5% 
Saving Balance for Saver1 : 2015.0277777777778
Saving Balance for Saver2 : 3022.5416666666665

*/
