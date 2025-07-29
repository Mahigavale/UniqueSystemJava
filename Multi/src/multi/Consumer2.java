package multi;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Consumer2 {

	public static void main(String[] args) {

//       
//		Consumer<Integer> con1=(i)->{ System.out.println(i*2);};
//		Consumer<Integer> con2=(i)->{ System.out.println(i*4);};
//		
//
//		 con1.andThen(con2).accept(40); 
		
		
		
		Supplier<String> sup=()->("hello");
		
		System.out.println(sup.get());
		
		
		
		Function<Double,Double> function=(i)->(i*2.0);
		
		Function<Double,Double> function2=(i)->(i*2.0);
		
		
	
		
//		System.out.println(function.apply(34.0));
//		System.out.println(function2.apply(67.90));
		
		Function<Double,Double> function3=function.andThen(function2);
		
		Function<Double,Double> function4=function.compose(function2);
		
		
		System.out.println(function3.apply(100.0));
		System.out.println(function4.apply(120.0));
		
		Function<Double,Double> function5=Function.identity();
		
		 
		     double result=function5.apply(100.9);
		     
		      System.err.print(result);
		      
		
		
		
		

	}
}