package inheritnce.salarypackage;
import java.util.*;

public class Basic {
	double basicsalary;
	double deduct;
	double bonus;
public void getEmployeeDetails()
{
Scanner scanner=new Scanner(System.in)	;

System.out.println("Enter the Basic Pay");
basicsalary=scanner.nextDouble();

System.out.println("Enter the deduction");
deduct=scanner.nextDouble();

System.out.println("Enter the bonus");
bonus=scanner.nextDouble();
}

public  double getBasicpay()
{
	return basicsalary;
	
}
public double getDeduction()
{
	return deduct;

}
public double getBonus()
{
	return bonus;
}
	

 
 
}
