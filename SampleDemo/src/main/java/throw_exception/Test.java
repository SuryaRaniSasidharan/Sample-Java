package throw_exception;

import java.util.Scanner;

public class Test {
	
	public static void check(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Not eligible");
		}
		else
		{
			System.out.println("Eligible");
		}
	}
	
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		check(age);
		
		

	}

}
