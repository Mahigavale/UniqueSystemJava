package demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class mapimpl {

	public static void main(String[] args) {

//		
//		Map<Integer,Integer> nums= new LinkedHashMap<Integer, Integer>();
//		for(int i=0;i<25;i++)
//			
//		{
//			nums.put(i, i);
//		}
//	
//	System.out.println(nums);
		
		Map<String, Integer>map=new HashMap<String, Integer>();
		long start=System.nanoTime();
		for(int i=0;i<200;i++)
			
		{
			map.put(i+"A",i);
		}
			
		System.out.println(map.size());
		long end=System.nanoTime();
		
		System.out.println("Toatl:"+(end-start)/1000);
		
		
	
	}

}
