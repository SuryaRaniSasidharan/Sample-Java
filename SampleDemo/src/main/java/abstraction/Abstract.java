package abstraction;

public abstract class Abstract {
	
	public abstract void print();
	public abstract void get();
	
	int x=12; int y=22;
	
	public void sum()
	{
		int a=10;
		int b=12;
		int sum=a+b;
		int sum1=x+y;
		System.out.println("SUM "+sum);
		System.out.println("SUM1 "+sum1);
	}

}
