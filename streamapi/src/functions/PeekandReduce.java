package functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class PeekandReduce {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,20,30,40,50);
		
		
//		list.stream().filter((i)->(i>20))
//		.peek((i)->System.out.println("from filter:"+i))//debugging
//		.map((i)->(i+10.0))
//		.peek((i)->System.out.println("From map:"+i))
//		.forEach((i)->System.out.println(i+5));
		
		
	BinaryOperator<Integer> bin=(i,j)->{return (i+
			j);};
//		
//		
//		 System.out.println(bin.apply(10,20));
//		 
//		 
	 BiFunction<Integer, Integer, Integer> bi=(i,j)->(i+5);
//		 
//		 System.out.println(bi.apply(10, 10.0));
		
		
	int reduced=list.stream().reduce(1,bin);
	
	int reduced2=list.stream().reduce(10,bi,bin); //
	
	System.out.println(reduced);
	System.out.println(reduced2);

	}

}
