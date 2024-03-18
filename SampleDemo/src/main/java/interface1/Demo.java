package interface1;

public class Demo implements InterfaceDemo {
	
	public void get()
	{
		System.out.println(A);
		
	}

	public static void main(String[] args) {
		
		InterfaceDemo obj=new Demo();       //upcasting
		obj.get();

	}

}
