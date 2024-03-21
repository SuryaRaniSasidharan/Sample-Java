package collection_arraylist1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Generic {

	public static void main(String[] args) {
		
		System.out.println("Generic ArrayList");
		
		ArrayList<String>list=new ArrayList();
		
		list.add("Blue");
		list.add("Green");
		list.add("Red");
		list.add("Purple");
		list.add("Apple");
		list.add(null);
		list.add(null);
		
		System.out.println(list);
		
	//	System.out.println("Lengnth of ArrayList");
	//	System.out.println(list.size());
		
		ArrayList<String>list1=new ArrayList();
		
		list1.add("Apple");
		list1.add("Orange");
		list1.add("Banana");
		list1.add("Grapes");
		
		System.out.println(list1);
		
		list.addAll(list1);
		System.out.println(list);
		
		list.removeAll(list1);
		System.out.println(list);
		
		System.out.println("Sorting");
		
	    Collections.sort(list);
	    System.out.println(list);
	    
	    System.out.println("Setting");
	     list.set(1, "Black");
	    System.out.println(list);
	    
	    System.out.println("Remove Index");
	    list.remove(3);
	    System.out.println(list);
	    
	    
		
	/*	System.out.println("Contains String in ArrayList");
		System.out.println(list.contains("Red"));
		System.out.println(list.contains("White"));
		
		System.out.println("Getting a String from ArrayList");
		System.out.println(list.get(2));
		
		System.out.println("Removing a String from ArrayList");
		list.remove("Red");
		System.out.println(list);       //removed Red from ArrayList
		
		
		System.out.println("Using for loop");
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
		System.out.println("");         //used for nextline 
		
		System.out.println("Using for each");
		for(String i:list)
		{
			System.out.print(i+" ");
		}
        System.out.println("");
        
        System.out.println("Using Iterator");
        Iterator itr=list.iterator();
        while(itr.hasNext())
        {
        	System.out.print(itr.next()+" ");
        }
        System.out.println("");
        itr.remove();
        System.out.println("After using iteration remove :"+list); */
     
	}

}
