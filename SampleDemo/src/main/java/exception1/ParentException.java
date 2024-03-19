package exception1;

import java.util.Scanner;

public class ParentException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		try {
			int array[]=null;
		    System.out.println(array[1]);
		    
			System.out.println("Enter a number");
			int s=sc.nextInt();
			
			int arr[]=new int[10];
			arr[10]=20;
			System.out.println(arr[10]);
			
		    int a=10/0;
		    System.out.println(a);
		    
		    
		
		
		
		}
		catch(ArithmeticException b)
		{
			System.out.println(b);
		}
        catch(ArrayIndexOutOfBoundsException c)
		{
        	System.out.println(c);
		}
		catch(NullPointerException r)
		{
			System.out.println(r);
		}
		catch(Exception e)
		{
			System.out.println("Enter an integer");
		}
		
		finally
		{
			System.out.println("Finally always excuted");
		}
		System.out.println("Rest of codes");
		int x=10; int y=30;
		System.out.println(x+y);
	}

}
