package accessmodifier;

public class Add {
	protected int a=10;
	 protected int b=20;
	
	protected void getAdd()
	{
		
		int s=a+b;
		System.out.println(s);
		}

	public static void main(String[]args)
	{
		Add obj=new Add();
		obj.getAdd();
		System.out.println(obj.a);
		System.out.println(obj.b);
	}
}
