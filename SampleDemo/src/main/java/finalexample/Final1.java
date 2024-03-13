package finalexample;

public class Final1 {
	final int a=10;
    final int b=20;
	
	
	public void getFinal()
	{
		final int c=28;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public void display()
	{
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		System.out.println("sum ="+(a+b));
	}

	public static void main(String[] args) {
		Final1 obj=new Final1();
		obj.display();
		obj.getFinal();

	} 

}
