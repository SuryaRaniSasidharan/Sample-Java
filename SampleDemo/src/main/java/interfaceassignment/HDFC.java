package interfaceassignment;

import java.util.Scanner;

public class HDFC implements RBI {
	
	
public void recurringDeposit()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the deposit amount");
	double amount=sc.nextDouble();
	amount=amount*Math.pow(1+INTEREST, DURATION);
	System.out.println("Amount after " +DURATION +" years : "+amount);
	
	
}
	public static void main(String[] args) {
		
		RBI obj=new HDFC();
		
		
		obj.recurringDeposit();
		
	}

}
