package demo;

public class Main {

	public static void main(String[] args) {
		
		try
		{
			try
			{
				int a=20/0;
				
			}
			catch(ArithmeticException a)
			{
			System.out.println(a);
		}
		catch(Exception e)
		{
			System.out.println("Handled");
		}
		try
		{
			int a[]=new int[5];
			a[6]=34;
		}
		catch(ArrayIndexOutOfBoundsException y)
		{
			System.out.println(y);
		}
		}
		catch(Exception e)
		{
			System.out.println("Handled");
		}
		System.out.println("Rest of codes");
		
}
}