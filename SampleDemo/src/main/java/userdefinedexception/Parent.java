package userdefinedexception;

public class Parent {
	public static void check(int age) throws LicenseException
	{
		if(age>18)
		{
			throw new LicenseException("Eligible");
		}
		else
		{
			System.out.println("Not Eligible");
		}
	}

	public static void main(String[] args) {
	
    try {
		check(23);
	} catch (LicenseException e) {
		System.out.println(e);
	}
    System.out.println("Rest of codes");
	}

}
