package exceptionmulticatch;

public class ParentClass {

	public static void main(String[] args) {
		
		int a=67;
		int b=98;
		System.out.println(a+b);
		try
		{
			
			int arr[]=new int[3];
			arr[5]=65;
			int c= 50/0;
		}
       catch(ArithmeticException t)
		{
    	   System.out.println(t);
    	   
		}
		catch(ArrayIndexOutOfBoundsException o)
		{
			System.out.println(o);
		}
		catch(Exception k)
		{
			System.out.println(k);
		}
		System.out.println("Rest of the codes");
	}

}
