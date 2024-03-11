package inheretence;

public class Grandchild extends ChildClass{

	public void display2()
	{
		System.out.println("GrandChild");
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
Grandchild obj1=new Grandchild();
obj1.display();
obj1.display1();
obj1.display2();
	}

}
