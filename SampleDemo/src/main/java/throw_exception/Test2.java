package throw_exception;

public class Test2 {
	
	public static void div(int a,int b)
	{
		
		if(b==0)
		{
			throw new ArithmeticException("Exception found");
		}
		else
		{
			int c=a/b;
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		try {
		div(12,0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally block always executed");
		}

	}

}
