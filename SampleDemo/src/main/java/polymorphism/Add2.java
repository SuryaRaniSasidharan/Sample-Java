package polymorphism;

public class Add2 extends Add{
	
	public void getAdd(int a,int b)
	{
		super.getAdd(35 ,45);
		int c=a+b;
		System.out.println("Child class method Add c "+c);
					
	}
	public void sub(int f,int e)
	{
		int g=f-e;
		System.out.println("Child class method sub g "+g);
	}
	public static void main(String[]args)
	{
		Add obj1=new Add2();
		obj1.getAdd(20, 30);
		obj1.getSub(45,23 );
		Add2 obj=new Add2();
		obj.sub(57, 23);
	}
}