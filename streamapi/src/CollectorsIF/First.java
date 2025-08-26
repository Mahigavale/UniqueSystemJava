package CollectorsIF;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class First {

	
	public static void main(String args[])
	{
//		
//	int[] arr= {12,13,45,21,23};
//	
//	Arrays.sort(arr);
//	
//	for(int i:arr)
//	{
//		System.out.println(i);
//	}
		
		
		//Collector <T,A,R>
		
		List<String> list=Arrays.asList("abc","ade","eedfg","dfjnjrn","dnedkd");
		
list.stream().map(String::length).collect(Collectors.toList()).sort((i,j)->{
	if(i>j)
	{
		return 1;
	}
	else if(i<j)

	{
		return -1;
	}
	return 0;
});
	

		
	}
}
