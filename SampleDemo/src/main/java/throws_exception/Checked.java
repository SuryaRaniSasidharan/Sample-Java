package throws_exception;

public class Checked {
	
	public static void sum() throws ArithmeticException
	{
		 int a=10; int b=0;
			int s=a/b;
		
		throw new ArithmeticException("Found Exception");
		
		
	}
	public static void sub() throws ArithmeticException
	{
		throw new ArithmeticException("substraction occur");
	}

	public static void main(String[] args) {
		  sub();
          sum();
         
	}

}
