package StringExample;

public class StringBuffer1 {

	public static void main(String[] args) {
		
		StringBuffer sb1=new StringBuffer("Welcome");
		StringBuffer sb2=new StringBuffer("Home");
		
		System.out.println("TO APPEND");
		sb1.append("back");
		System.out.println(sb1);

		System.out.println("TO INSERT");
		sb1.insert(1,"dear");
		System.out.println(sb1);
		
		System.out.println("TO REPLACE");
		sb1.replace(0, 2,"hai");
		System.out.println(sb1);
		
		System.out.println("DELETE METHOD");
		sb1.delete(1, 4);
		System.out.println(sb1);
		
		System.out.println("TO REVERSE");
		sb1.reverse();
		System.out.println(sb1);
	}
}

 
