package methodoverriding;

public class Cricket extends Sports {
	
	public void play()
	{
		
		System.out.println("3. Cricket");
	}

	public static void main(String[] args) {
		
	Sports obj=new Cricket();
	Sports obj1=new Basketball();
	Sports obj2=new Football();
	obj.play();
	obj1.play();
	obj2.play();

	}

}
