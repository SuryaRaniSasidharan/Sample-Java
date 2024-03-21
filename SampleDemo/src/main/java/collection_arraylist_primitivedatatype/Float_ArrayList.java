package collection_arraylist_primitivedatatype;

import java.util.ArrayList;
import java.util.Iterator;

public class Float_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<Float>list1=new ArrayList<Float>();
		
		list1.add(1.2f);
		list1.add(4.5f);
		list1.add(6.8f);
		list1.add(9.5f);
		
		System.out.println("Float Array List");
		System.out.println(list1);
		
		/*list1.addAll(list1);
		System.out.println(list1);
		
		list1.addAll(0, list1);
		System.out.println(list1); */
		
		/*list1.removeAll(list1);
		System.out.println("After removing : "+list1);*/
		
		Iterator<Float> itr=list1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		itr.remove();
		System.out.println(list1);
		

	}

}
