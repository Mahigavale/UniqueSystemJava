package logicbuilding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class First {
	 static public Map<String,Integer> demo(List<String> list)
	{
		 
		 List<String> list2=new ArrayList<String>();
		 
		 for(int i=0;i<list.size();i++)
		 {
			 list2.add(list.get(i).toLowerCase());
		 }
		 
		 List<String> list3=new ArrayList<String>();
		 
		 for(int i=0;i<list2.size();i++)
		 {
			 
			 if(list2.get(i).startsWith("u"))
			 {
				 list3.add(list2.get(i));
			 }
		 }
		Map<String,Integer> map=new HashMap<String, Integer>();
		for(int i=0;i<list3.size();i++) {
			Iterator<String> itr=list3.iterator();
			int count =0;
		  	String current= list3.get(i);
		     while(itr.hasNext())
		      {
			   if(current.equals(itr.next()))
			   {
				   count++;
			   }   
			   map.put( current, count);
		  }
		}
		
		return map;
	}

	public static void main(String[] args) {
		
		// "welcome to pune welocme to pune"
		//{welcome=2, to=2, pune=2}
		String str="welcome to pune welcome to pune dkdjdldkd mumbai mumabi Mumbai";
		
		List<String> sentence=
				Arrays.asList("welcome","to", "pune","welcome","to","pune","dkdjdldkd","mumbai","mumbai","Mumbai","agra","agra","Udaipur","udaipur","Ichalkaranji","uganda");
		
		
		
		Function<List<String>, Map<String, Integer>> fun=First::demo;
		
		System.out.println(fun.apply(sentence));
		
		//System.out.println(sentence.stream().collect(Collectors.counting()));
		

	}

}
