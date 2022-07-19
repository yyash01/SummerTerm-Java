package Assignment1;
import java.util.Scanner;

class solve{
	boolean isPrime(int n)
	{
		if(n==0 || n==1)return false;
		
		for(int i=2;i*i<=n;i++) {
			if(n%i==0)
				return false;
		}
		
		return true;
	}
	public void printPrime(int start,int end)
	{
		for(int i=start;i<=end;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
		
	}
}

public class Question2 {
	
	public static void main(String[] args) {
		
		int start,end;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start of interval : ");
		start = sc.nextInt();
		System.out.println("Enter end of interval : ");
		end = sc.nextInt();
		solve obj = new solve();
		
		obj.printPrime(start,end);
		sc.close();

	}

}
