package StringExample;

public class String1 {

	public static void main(String[] args) {
		String s1="welcome";
	    String s2="   to   ";
		String s3="JAVA";
		String s4=new String("Hai");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println("Length");
		System.out.println(s1.length());
	    System.out.println(s2.length());
	    System.out.println(s3.length());
	    System.out.println(s4.length());
	    
	System.out.println("Concated");
	s3=s1.concat(s3);
	System.out.println(s3);

	System.out.println("equals");
	System.out.println(s1.equals(s2));
	
	System.out.println("equalsignore");
	System.out.println(s1.equalsIgnoreCase(s2));
	
	System.out.println("Operator");
	System.out.println(s1==s2);
	
	System.out.println("Compareto");
	System.out.println(s1.compareTo(s4));
	
	System.out.println("charAt");
	System.out.println(s1.charAt(2));
	
	System.out.println("Uppercase");
	System.out.println(s2.toUpperCase());
	
	System.out.println("Lowercase");
	System.out.println(s3.toLowerCase());
	
	System.out.println("Trim");
	System.out.println(s2.trim());
	
	System.out.println("Startswith and Endswith");
	System.out.println(s1.startsWith("w"));
	System.out.println(s1.endsWith("s"));
	
	System.out.println("Contains");
	System.out.println(s1.contains("come"));
	

	
	
	
	}

}
