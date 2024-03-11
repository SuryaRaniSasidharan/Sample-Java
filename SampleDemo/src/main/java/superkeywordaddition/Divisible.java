package superkeywordaddition;

public class Divisible extends Addition {
	
	
		
	
	public void checkDivisible()
	{
		super.add(23,95);
		if(sum%10==0)
		{
			System.out.println(sum+ " is Divisible");
		}
		else {
			System.out.println(sum+ " is Not Divisible");
		}
	}
	public static void main(String[] args) {
		
		Divisible obj=new Divisible();
		obj.checkDivisible();
			
		

	}

}
