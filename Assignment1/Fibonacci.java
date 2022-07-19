package Assignment1;
import java.util.Scanner;

public class Fibonacci {
	
	static int findFibbonaci(int x){
		
		//array to store the fibonacci numbers
		int arr[] = new int[x+2];
		arr[0]=0; //base case
		arr[1]=1; //base case
		
		for(int i=2;i<=x;i++) {
			arr[i] = arr[i-1]+arr[i-2];
		}
		
		return arr[x];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the integer");
		int input = sc.nextInt();
		int output = findFibbonaci(input);
		System.out.printf("The %dth Fibonaci Number is %d ",input,output);
		sc.close();
	}

}
