package aggregation1;

public class Data {
	String country;
	String state;
	String city;
	AddData data;
	
	public Data(String country,String state,String city,AddData data)
	{
		this.country=country;
		this.state=state;
		this.city=city;
		this.data=data;
	}
 public void getData()
 {
	 System.out.println("NAME : "+data.name);
	 System.out.println("HOUSE NAME : "+data.housename);
	 System.out.println("HOUSE NO : "+data.houseno);
	 System.out.println("COUNTRY : "+country);
	 System.out.println("STATE : "+state);
	 System.out.println("CITY : "+city);
	 
 }
 public static void main(String[]args)
 { 
	 
	AddData obj=new AddData("ANU ","XXX ",123);
	Data obj1=new Data("INDIA ","KERALA ","PTA ",obj);
	obj1.getData();
 }
}
