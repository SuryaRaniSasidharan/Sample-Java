package finalexample;

public class Final2 extends Final1{
	
	public void getFinal()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	
	public void display1()
	{
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Final keyword constructed");
	}

	public static void main(String[]args)
	{
		Final1 obj1=new Final2();
		obj1.display();
		//obj1.display1();
		obj1.getFinal();
	}
}
