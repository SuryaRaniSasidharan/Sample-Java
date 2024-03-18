package abstractionassignment;
import java.util.*;

public class FullTimeEmpolyee extends Employee {
		double HOUR=8;
	
	
	public void calculateSalary()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter paymentperhour for FulltimeEmployee");
		double paymentperhour=sc.nextDouble();
		double salary=paymentperhour*HOUR;
		System.out.println("FullTimeEmployee Salary : "+salary);
	}

	public static void main(String[] args) {
		
		
	Contractor obj=new Contractor();
	obj.calculateSalary();
	
	 FullTimeEmpolyee obj1=new FullTimeEmpolyee();
	obj1.calculateSalary();
	 

	}

}
