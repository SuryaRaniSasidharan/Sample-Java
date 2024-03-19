package exceptionmulticatch1;

public class Main {

	public static void main(String[] args) {
		
		int a= 34; int b=67;
		System.out.println("A+B ="+(a+b)); 
		
		try
		{
		
			int arr[][]=new int[2][3];
			arr[3][4]=50;
		int c=50/0;
		
		//String s=null;
		//System.out.println(s.length());
		
		}
		catch(ArithmeticException x)
		{
			System.out.println(x);
		}
        catch(ArrayIndexOutOfBoundsException y)
		{
        	System.out.println(y);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally block always excuted");
		}
		System.out.println("Rest of the codes");
}
}
