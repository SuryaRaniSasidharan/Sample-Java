package collection_arraylist1;

import java.util.ArrayList;
import java.util.Iterator;

public class NonGeneric {

	public static void main(String[] args) {
		
		ArrayList list1=new ArrayList();
		
		System.out.println("Non generic ArrayList");
		list1.add("Banana");
		list1.add(34);
		list1.add('A');
		System.out.println(list1);
		
		System.out.println("Size of ArrayList");
		System.out.println(list1.size());
		
		System.out.println("Contains element in ArrayList");
		System.out.println(list1.contains(34));
		
		/*System.out.println("Removing elements from ArrayList");
		list1.remove("Banana");
		System.out.println(list1);*/
		
		
		System.out.println("Using for loop");
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
		}
		
		System.out.println("Using for each");
	/*	for(String i:list1)
		
		{
			
		}  */
		
		System.out.println("Iteration using iterator");
		Iterator itr= list1. iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		itr.remove();
		System.out.println("After using iterator remove : "+list1);

	}

}
