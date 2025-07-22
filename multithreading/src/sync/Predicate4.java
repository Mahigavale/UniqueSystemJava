package sync;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Predicate4 {

//	public static void checkcondition(int i , Predicate<Integer> pred)
//	{
//		
//		if(pred.test(i))
//		{
//			System.out.println("condition passed......");
//			
//		}
//		else {
//		System.out.println("condition failed......");
//	}
	
	public static void main(String[] args) {
		
		
//		checkcondition(25, (i)->(i<40));
		
		
		Consumer<List<Integer>> consumer=new Consumer<List<Integer>>() {

			@Override
			public void accept(List<Integer> t) {
			
				for(int i:t)
				{
					System.out.println(i);
				}
				
			}};

			
			
			List<Integer> numbers=Arrays.asList(10,12,13,14,15,26);
			consumer.accept(numbers);
			
			
			Consumer<String> consumer_one=(s)->System.out.println(s);
			Consumer<String> consumer_two=(s)->System.out.println(s+"A");
			
			consumer_one.andThen(consumer_two).accept("Mahesh");
			
	}

}
