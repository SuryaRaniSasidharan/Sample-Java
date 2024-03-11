package StringExample;

class StringReverse
{

	public static void main(String[] args) {
    String s1="java";
    System.out.println(s1);
    //int length=s1.length();
    String reverse="";
    for(int i=s1.length()-1;i>=0;i--)
{
	reverse+=s1.charAt(i);
}
    System.out.println(reverse);
    
    String s2="malayalam";
    System.out.println(s1);
   String reverse1="";
   for(int i=s2.length()-1;i>=0;i--)
   {
	   reverse1+=s2.charAt(i);  
   }
   System.out.println(reverse1);
   
   if(s1.equals(reverse))
   {
	   System.out.println(s1+" Palindrome");
   }
   else {
	   System.out.println(s1+" Not Palindrome");
   }
   if(s2.equals(reverse1))
   {
	   System.out.println(s2+" Palindrome");
   }
   else
   {
	   System.out.println(s2+" Not Palindrome");
   }
	} 

}
