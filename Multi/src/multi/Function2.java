package multi;

import java.util.function.Function;

public class Function2 {

	public static void main(String[] args) {
		
		Function<Double,Integer> fun1=(i)->{
			return i.intValue();
		};
		
		Function<Double,Double> fun2=(i)-> (i*4.0);
		
		//Function<Integer,Double> fun3=fun1.andThen(fun2);
		Function<Double,Integer> fun4=fun1.compose(fun2);
		
		System.out.println(fun4.apply(400.0));

	}

}
