package superkeyword;

public class Add {
	
	int a;
	int b;
	public Add()
	{
		a=95; b=65;
		System.out.println("Add parent constructor " + (a+b));
	}
	public Add(int a)
	{
	this.a=a;
	System.out.println("Parameterized constructor "+a);
	}
	public void getAdd()
	{
		a=20;b=10;
	
	System.out.println("Add parent method " +(a+b));
	}

}
