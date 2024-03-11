package instancemethod;

public class InstanceMethodName {
	String name;
	public String getName(String name)
	{
		this.name=name;
		//String name="surya";
		return name;
	}

	public static void main(String[] args) {
	
   InstanceMethodName obj=new InstanceMethodName();
  String name1=obj.getName("surya");
   System.out.println(name1);
	}

}
