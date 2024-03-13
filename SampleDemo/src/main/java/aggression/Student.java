package aggression;

public class Student {
	String name;
	int roll;
	Address add;
	
	public Student(String name,int roll,Address add)
	{
		this.name=name;
		this.roll=roll;
		this.add=add;
	}
	public void getData()
	{
		System.out.println("Name : "+name);
		System.out.println("roll : "+roll);
		System.out.println("HouseName : "+add.housename);
		System.out.println("HouseNumber : "+add.houseno);
	}

	public static void main(String[] args) {
		Address obj=new Address("Anu house ",567);
		Student obj1=new Student("Anu ",12,obj);
		
		obj1.getData();

	}

}
