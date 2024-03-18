package abstraction;

public class AbstractSub extends Abstract{
	
	public void print()
	{
		System.out.println("Printing");
	}

	public void get()
	{
		System.out.println("Abstract created");
	}
	public static void main(String[] args) {
		AbstractSub obj=new AbstractSub();
		obj.print();
		obj.get();
	   obj.sum();

	}

}
