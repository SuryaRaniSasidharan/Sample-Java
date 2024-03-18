package abstraction1;

public class Video extends Google {

	public void search()         //implemenation of abstract method
	{
		System.out.println("Searching video");
		
	}
	public void displayvideo()
	{
		System.out.println("Displaying video");
	}
	public static void main(String[] args) {
		
		Video obj=new Video();
		obj.search();
		obj.displayvideo();
		Image obj1=new Image();
		obj1.search();
		obj1.displayImage();
				

	}

}
