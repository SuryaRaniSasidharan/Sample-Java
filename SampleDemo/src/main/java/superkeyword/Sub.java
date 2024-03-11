package superkeyword;

public class Sub extends Add {
	int x;int y;
	public Sub()
	{
		
		super(10);
		
		x=75;y=40;
	System.out.println("Sub child constructor " +(x-y))	;
	}
	
	
	public void getSub()
	{
		
		 x=20; y=10;
		super.getAdd();
		//System.out.println("Add parent Method " +(super.a+b));
		System.out.println("Sub child method "+(x-y));
		
	}

	public static void main(String[] args) {
		
		Sub s=new Sub();
		s.getSub();

	}

}
