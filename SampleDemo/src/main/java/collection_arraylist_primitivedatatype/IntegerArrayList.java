package collection_arraylist_primitivedatatype;

import java.util.ArrayList;
import java.util.Iterator;

public class IntegerArrayList {

	public static void main(String[] args) {
	
		ArrayList<Integer>list=new ArrayList<Integer>();
		 
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println("Integer ArrayList");
		System.out.println(list);
		
		System.out.println("Size of ArrayList");
		System.out.println(list.size());
		
	  /*  list.addAll(list);
	    System.out.println(list);*/
		
		/*list.removeAll(list);
		System.out.println("After removing : " +list);*/
	    
	    System.out.println("iteration using for each");
		for (int i:list)
		{
			System.out.print(i+" ");
		}
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}


}
