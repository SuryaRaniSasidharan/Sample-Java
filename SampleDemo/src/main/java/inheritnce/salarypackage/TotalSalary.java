package inheritnce.salarypackage;

public class TotalSalary extends Calculate {
	double totalsalary;
	public void totalsalary()
	{
	
	
		
		
		
		totalsalary=getBasicpay()+hra-pf-getDeduction()+getBonus();
		
	}
	public void display()
	{
		System.out.println("SALARY SLIP :");
		System.out.println("Basic pay ="+basicsalary);
		System.out.println("Deduction ="+deduct);
		System.out.println("hra ="+hra);
		System.out.println("pf ="+pf);
		System.out.println("Bonus ="+bonus);
		System.out.println("TotalSalary ="+totalsalary);
	}

	public static void main(String[] args) {
		TotalSalary obj=new TotalSalary();
		obj.getEmployeeDetails();
		obj.calculate();
		obj.totalsalary();
		obj.display();
		
		

		
        
	}

}
