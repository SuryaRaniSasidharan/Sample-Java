package collection_set_interface;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Example {

	public static void main(String[] args) {
		
		       	HashSet<String>set=new HashSet<String>();
				 set.add("Purple");
				 set.add("Red");
				 set.add("Green");
				 set.add("Balck");
				 set.add("Red");
				 System.out.println("Generic");
				 System.out.println(set);
				 
				 HashSet set1=new HashSet();
				 
				 set1.add("Orange");
				 set1.add(34);
				 set1.add('A');
				 set1.add(null);
				 System.out.println("NonGeneric");
				 System.out.println(set1);
				 
				 System.out.println("Iterating Generic");
				 Iterator itr=set.iterator();
				 while(itr.hasNext())
				 {
					 System.out.println(itr.next());
				 }
				 	
				 System.out.println("Iterating NonGeneric");
				 Iterator itr1=set1.iterator();
				 while(itr1.hasNext())
				 {
					 System.out.println(itr1.next());
				 }
				 
				 System.out.println(set.size());
		          System.out.println(set.contains("Red"));
		         
		        //  System.out.println(list.get());
		         // System.out.println(Collections.sort(list));
		          
		          System.out.println("Add all elements");
		           set.addAll(set1);
		           System.out.println(set);
		           
		           System.out.println("Removing an element");
		           set.remove("Red");
		           System.out.println(set);
		           
		           System.out.println("Removing");
		           set.removeAll(set1);
		           System.out.println(set);
			
			
			

		


	}

}
