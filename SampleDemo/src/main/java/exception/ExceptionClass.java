package exception;

import javax.sql.rowset.serial.SQLOutputImpl;

public class ExceptionClass {
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
		int s=a+b;
		System.out.println(s);
		try
		{
		int x=65/0;
		}
		catch(ArithmeticException t)
		{
			System.out.println("Exception found");
		}
		
		System.out.println("Exception Handled");

	}

}