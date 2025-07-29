package multi;

import java.util.function.Function;

public class Function3 {

	 static Double convert(int i, Function<Integer,Double> fun)
	 {
		 
		 return  fun.apply(i);
		 
	 }
	public static void main(String[] args) {
		 
		
		Function<Integer, Double> first=(i)->(i*2.0);
		
		Function<Double,Double> second=(i)->(i*4.0);
		
		 System.out.println(convert(10, (i)->(i*2.0)));
		
		
		 
		    // Function<Integer,Double>  third=first.andThen(second);
		     Function<Integer,Double>  third=second.compose(first);
		     
		     System.out.println(third.apply(100));
	}

}


