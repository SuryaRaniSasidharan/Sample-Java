package collection_assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<String>list=new ArrayList();
		list.add("Red");
		list.add("Purple");
		list.add("Indigo");
		list.add("Green");
		list.add("Yellow");
		
		System.out.println("The colours in ArrayList :");
		System.out.println(list);
		
		System.out.println("Retrieving an element at index 1 :");
		list.remove(1);
		System.out.println(list);
		
		System.out.println("Iterating using Iterator Interface :");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("Removing 3rd element");
		list.remove("Indigo");
		System.out.println(list);
		
		System.out.println("Searching an element");
		System.out.println(list.contains("Green"));
		

	}

}
