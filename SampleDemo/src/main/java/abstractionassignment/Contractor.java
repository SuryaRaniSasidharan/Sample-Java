package abstractionassignment;

import java.util.Scanner;

public class Contractor extends Employee{
	
	int workinghours;
	

	public void calculateSalary()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter paymentperhour for Contactor");
		double paymentperhour=sc.nextDouble();
		System.out.println("Enter the working hours of the Contractor");
		int workinghours=sc.nextInt();
		double salary=paymentperhour*workinghours;
		
		System.out.println("Contactor Salary "+salary);
	}
	

}
