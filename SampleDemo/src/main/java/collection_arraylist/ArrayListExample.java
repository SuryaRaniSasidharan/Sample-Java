package collection_arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		System.out.println("Generic ArrayList");
		
		List<String> list1=new ArrayList();        //Generic
		list1.add("Surya");
		list1.add("Rani");
		list1.add("pathanamthitta");
		
		
		System.out.println(list1);
		System.out.println(list1.size()); 
	
	System.out.println("Non Generic ArrayList");
	
	ArrayList list2=new ArrayList();
	list2.add("Red");
	list2.add("orange");
	list2.add("blue");
	list2.add(12);
	list2.add('A');
	System.out.println(list2);
	
	System.out.println("Null Array List");
	
	ArrayList<String>list3=new ArrayList();
	list3.add("banana");
	list3.add("apple");
	list3.add(null);
	list3.add(null);
	
	
	System.out.println(list3);
	System.out.println(list3.contains("apple")); //if apple in arraylist return true
	
	System.out.println("Using for loop ");
	
	for(int i=0;i<list3.size();i++)
	{
		System.out.println(list3.get(i));
	}
	
	System.out.println("Using for each");
	
	for(String s:list3)
	{
		System.out.println(s);
	}
	
	System.out.println("Using iterator");
	
	Iterator<String> itr=list3.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	}

}
