package throwexception;

public class Main {
	
	public void sub(int x,int y)
	{
		int sub=x-y;
		if(sub>0)
		{
			throw new ArithmeticException("Positive number");
		}
		else
		{
			System.out.println("Negative number");
		}
		
	}

	public static void main(String[] args) {
		
		Main obj=new Main();
		
		
		try
		{
			obj.sub(55, -20);
			int arr[][]=new int[2][3];
			arr[3][4]=50;
		int c=50/0;
		
	
		
		
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


