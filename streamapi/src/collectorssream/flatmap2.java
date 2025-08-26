package collectorssream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatmap2 {

	public static void main(String[] args) {
	
		List<Integer> list=Arrays.asList(10,20,30,40,50);
		
		List<Integer> list2=Arrays.asList(60,70,80,90,100);
		
		
		List<List<Integer>> accul=new ArrayList<List<Integer>>();
		
		accul.add(list2);
		accul.add(list);
		
		
	List<Integer> flattened=accul.stream().flatMap(list3->list3.stream()).collect(Collectors.toList());
	
	System.out.println(flattened);
	} 

}
