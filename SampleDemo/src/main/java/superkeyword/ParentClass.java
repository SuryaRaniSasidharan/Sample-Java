package superkeyword;

public class ParentClass {
	
	int a=10; int b=20;
	
	public ParentClass()   //constructor
	{
		System.out.println("Parent classconstructed");
		}
	
   public void getData()  //instance method
   {
	   String s="Welcome";
	   System.out.println(s);
	   System.out.println(a+b);
	   
   }
}
