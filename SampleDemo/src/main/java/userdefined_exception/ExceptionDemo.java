package userdefined_exception;

public class ExceptionDemo {
	
	public static void vote(int a) throws IllegalAgeException
	{
		if(a<18)
		{
			throw new IllegalAgeException("Not eligible");
		}
		else
		{
			System.out.println("eligible");
		}
	}

	public static void main(String[] args) throws IllegalAgeException {
		
		vote(12);

	}

}
