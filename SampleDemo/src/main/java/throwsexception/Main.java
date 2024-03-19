package throwsexception;

public class Main {
	
	public static void sum() throws ArithmeticException  //unchecked exception
	{
		throw new ArithmeticException("Sum is calculated");
	}

	public static void main(String[] args) {
		
	sum();

	}

}
