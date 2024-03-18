package encapsulationassignment;
import java.util.*;
public class User {
	public void withdraw()
	{
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter  the amount");	
	double amount=sc.nextDouble();
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pin number");
		int pin=sc.nextInt();
		
		User obj1=new User();
		Bank obj=new Bank();
		
		obj.setPin(pin);
		obj.setValidpin(1001);
		obj.setValidpin1(1212);
		obj.setValidpin2(1234);
		obj.getValidpin();
		obj.getValidpin1();
		obj.getValidpin2();
		if(obj.checkPin(obj.getPin()))
				{
			    obj1.withdraw();
			    System.out.println("withdraw successful");
			
				}
		else
		{
			System.out.println("Invalid Pin");
		}
		 
         
	}      

}
