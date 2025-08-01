package functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Fourth {

	public static void main(String[] args) {
	
	List<Integer> list1=new ArrayList<Integer>();
	 
	list1.add(10);
	list1.add(12);
	list1.add(30);
	
	List<Integer> list2=new ArrayList<Integer>();
	list2.add(20);
	list2.add(22);
	list2.add(40);
	
	
	List<List<Integer>> composed=new ArrayList<List<Integer>>();
	
	composed.add(list2);
	composed.add(list1);
	
	System.out.println(composed);

	
//	for(List<Integer> i:composed)
//	{
//
//		System.out.println("printing the whole list");
//		System.out.println(i);
//		System.out.println("ACCESSING THE ELEMENTS");
//       for(int j:i)
//       {
//    	   System.out.println(j);
//       }
//       System.out.println("List finished");
//	}
		
		
		
	
	Consumer<List<Integer>> cons=(list)->{
		for(int i:list)
		{
			System.out.println(i);
		}
		System.out.println("list finished..");
	};
	
	composed.stream().forEach(cons);
	



}
}
