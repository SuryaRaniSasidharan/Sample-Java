package superkeyword;

public class ChildClass extends ParentClass{
	
	int a=20; int b=70;
	
	public ChildClass()             //constructor
	{
		System.out.println("Child class constructed");
	}
	
 public void getData()           //instance method
 {
	 super.getData();     //to invoke method in parent class
	 
	 String s1="Hello";
	 System.out.println(s1);
	 System.out.println(super.a+b);
	 
 }
	public static void main(String[] args) {
		
ChildClass obj=new ChildClass();
obj.getData();


	}

}
