package inheretence;

public class Hirerachical2 extends Hierarchical{
	
	public void display2()
	{
		System.out.println("The last one");
	}

	public static void main(String[] args) {
		Hirerachical2  obj=new Hirerachical2 ();
		obj.display();
		obj.display2();
		Hierarchical1 obj1=new Hierarchical1 ();
		obj1.display1();

	}

}
