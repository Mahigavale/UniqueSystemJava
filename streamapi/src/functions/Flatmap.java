package functions;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Flatmap {

	public static void main(String[] args) {
	
		
		List<List<Integer>> list=Arrays
				        .asList(Arrays.asList(10,20,20,30),
						  Arrays.asList(40,50,60,70));
		
	//System.out.println(list.stream().flatMap((i)->(i.stream()).forEach((i))));
		
	//	list.stream().map((i)->i.stream()).forEach((i)->System.out.println(i));
		
//		list.stream().forEach((i)->{
//		
//		    //int k(int)i;
//			for(int j:i)
//			{
//				System.out.println(j*2);
//			}
//		});
//		
		//[[12,23,24,2,4],[112,221,43,13]]
		//[12,23,34,2,4],[112,221,43,13]
		// 12,23,34,2,4 , 112,221,43,13
		//[                              ]
	 List<?>	 num=list.stream().flatMap((i)->(i.stream())).map((i)->(i*2)).collect(Collectors.toList());

System.out.println(num);
}
}