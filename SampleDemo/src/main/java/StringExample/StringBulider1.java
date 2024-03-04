package StringExample;

public class StringBulider1 {

	public static void main(String[] args) {
    StringBuilder sb =new StringBuilder("Java");
    System.out.println(sb);
    
    System.out.println("TO APPEND-");
    sb.append("Method");
    System.out.println(sb);
    
    System.out.println("INSERT METHOD-");
    sb.insert(4, "advanced");
    System.out.println(sb);
    
    System.out.println("REPLACE MEHOD-");
    sb.replace(1, 3, "hai");
    System.out.println(sb);
    
    System.out.println("DELETE METHOD-");
    sb.delete(2, 4);
    System.out.println(sb);
    
    System.out.println("REVERSE METHOD-");
    sb.reverse();
    System.out.println(sb);
    
     System.out.println("CAPACITY-");
     System.out.println(sb.capacity());
     
     System.out.println("ENSURE CAPACITY");
     sb.ensureCapacity(6);
     System.out.println(sb.capacity());
    
    
	}

}
