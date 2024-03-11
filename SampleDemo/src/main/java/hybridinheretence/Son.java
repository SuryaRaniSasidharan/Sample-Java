package hybridinheretence;

public class Son extends Father{
	public void display2()
	{
		System.out.println("I am your son");
	}
public static void main(String[] args)
{
	Son son=new Son();
	son.display2();
	son.display1();
	son.display();
	Daughter daughter=new Daughter();
	daughter.display3();
	daughter.display1();
	daughter.display();
}
}
