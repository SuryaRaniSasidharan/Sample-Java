package interfacemultiinheritence1;

public class Family implements Parent,Boy,Girl {
	
	int a=11;
	int b=10;
	@Override
	public void getNameGirl() {
		System.out.println("Girl name is Anu");
		
	}

	@Override
	public void getNameBoy() {
		System.out.println("Boy name is Vinu");
		
	}

	public void getNameParents() {
		System.out.println("Parents names are Sanu and Vimala");
		
	}
	
	@Override
	public void multi() {
		
		System.out.println("A+B = "+(a+b));
		System.out.println("X+Y = "+(X+Y));
		
	}

	@Override
	public void sub() {
		System.out.println("A-B = "+(a-b));
		System.out.println("X-Y = "+(X-Y));
		
	}

	@Override
	public void sum() {
		int X=34; int Y=56;
         // System.out.println("x+y = "+(x+y));
		System.out.println("A*B = "+(a*b));
		System.out.println("X*Y = "+(X*Y));
		
	}

	public static void main(String[] args) {
		Family obj=new Family();
		obj.getNameParents();
		obj.getNameBoy();
		obj.getNameGirl();
		obj.sum();
		obj.sub();
		obj.multi();
		
	}

	
	

}
