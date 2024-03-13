package accessmodifier1;

import accessmodifier.Add;

public class Add3 extends Add {

	public static void main(String[] args) {
		
		Add3 obj=new Add3();
		obj.getAdd();
		System.out.println("a = "+obj.a);
		System.out.println("b = "+obj.b);

	}

}
