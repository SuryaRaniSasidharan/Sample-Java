package StringExample;

public class StringReverse {

	public static void main(String[] args) {
    String s="java";
    System.out.println(s);
    int length=s.length();
    System.out.println(length);
    
    char[] a=new char[length];
    for(int i=0;i<length;i++)
    {
    	
    	a[i]=s.charAt(length-1-i);
    	
    }
    System.out.println(a);
    
    if(a.equals(s))
    {
    	  System.out.println("java is palindrome");
    }
    else {
    	  System.out.println("java not a palindrome");
    }
    
    String s1="malayalam";
    System.out.println("malayalam");
   
    int length1=s1.length();
    
    
    char[] b=new char[length1];
    String s2= s1;
    
    for(int j=0;j<length1;j++)
    {
     b[j]=s1.charAt(length1-1-j);
    	
    	
    }
    System.out.println(b);
    if(s2.equals(b))
    {
    	 System.out.println("malayalam is palindrome");
    }
    else {
    	System.out.println("malayalam not a palindrome");	
    }
	}

}
