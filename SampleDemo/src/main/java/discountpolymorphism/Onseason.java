package discountpolymorphism;
import java.util.*;

 
public class Onseason {
	
	public void calculateDiscount()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Purchased amount");
		double amount=sc.nextDouble();
	    amount=amount-amount*0.15;
	    System.out.println("Payable Amount after Onnseason discount "+amount);

	}

}
