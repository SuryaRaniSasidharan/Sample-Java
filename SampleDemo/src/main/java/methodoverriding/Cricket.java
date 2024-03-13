package methodoverriding;

public class Cricket extends Basketball {
	
	public void play()
	{
		super.play();
		System.out.println("3. Cricket");
	}

	public static void main(String[] args) {
		
	Sports obj=new Cricket();
	obj.play();

	}

}
