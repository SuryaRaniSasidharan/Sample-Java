package encapsulation1;

public class Encapsulation {
	private String name;
	private long acc;
	private String mail;
	
	public void setter(String name,long acc,String mail)
	{
		this.name=name;
		this.acc=acc;
		this.mail=mail;
	}
	public void getter()
	{
		System.out.println("NAME : "+name);
		System.out.println("ACCOUNT NO : "+acc);
		System.out.println("MAIL ID : "+mail);
	}

}
