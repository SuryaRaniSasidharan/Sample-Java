package encapsulation2;

public class Main {

	public static void main(String[] args) {
	
		Base obj=new Base();
		obj.setName("ANU");
		obj.setAge(10);
		System.out.println("NAME : "+obj.getName());
		System.out.println("AGE :"+obj.getAge());

	}

}
