package polymorphismdiscount;

import java.util.Scanner;

public class Offseason extends Onseason {
	
	public void calculateDiscount()
	{
		//super.calculateDiscount();;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Purchased amount");
		double amount=sc.nextDouble();
		amount=amount-amount*0.40;
		System.out.println("Payable amount after Offseason discount "+amount);
		
	}
	public void getSeason()
	{
		while(true)
		{
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("choose season : off/on/exit");
		String season=sc.nextLine();
		switch(season)
		{
		case "off":
			calculateDiscount();
			break;
		case "on":
			super.calculateDiscount();
			break;
		case "exit":
			System.exit(0);
		 default:
			System.out.println("Enter a valid input");
		}
		
	}
	}
	public static void main(String[] args) {


		
		Offseason obj =new Offseason();
		obj.getSeason();
				
	}

}
