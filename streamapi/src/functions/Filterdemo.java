package functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Filterdemo {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		
		
		Predicate<Integer> pred=new Predicate<Integer>()
		{
//			public boolean test(int i)
//			{
//				
//			}

			@Override
			public boolean test(Integer t) {
				
				 if(t>300)
				 {
					 return true;
				 }
				 else
				 {
					 return true;
				 }
			}
			
			
		};
				//System.out.println(pred.test(400));
		
		
		
		list.add(100);
		list.add(123);
		list.add(171);
		list.add(500);
		list.add(200);
		
		list.stream().filter(pred).forEach((i)-> System.out.println(i));
		//list

	}

}
