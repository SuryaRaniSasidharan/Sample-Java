package polymorphism;

public class BankB extends BankA {
	
	
		public int getInterest()
		{
			super.getInterest();
			return 16;
		}

	public static void main(String[] args) {
		BankA obj =new BankB();
		obj.getInterest();
		
        System.out.println(obj.getInterest());
	}

}
