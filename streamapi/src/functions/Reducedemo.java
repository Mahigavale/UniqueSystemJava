package functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Reducedemo {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(100);
		list.add(20);
		list.add(40);
		list.add(60);
		
		//int k=list.stream().reduce();
		
//		//BinaryOperator=>Bifunction=> R apply(i1,i2)
		BinaryOperator<Integer> bin=(i,j)->(i+j);
//		
//		System.out.println(bin.apply(123, 345));
//		
//		Function<Integer,Integer> fun=(i)->(i*2);
//	
//		
//		Function<Integer, Integer> fun3=Function.identity();
		
		
		BiFunction<Integer, Integer, Double> bi=(i,j)->(i+j+2.0);
		//System.out.println(bi.apply(10, 10));
	
		
		
		
		try {
	//		BinaryOperator<Integer> bin=(i,j)->(j/i);
		int i=list.stream().reduce(220,bin);//100+10 =>110+20=>130+40=>170+60
	System.out.println(i);
//		}

		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
	//	List<Double> 
		
		
//		
//		BiFunction<Integer, Integer, Double> bi=(i,j)->(i+j+2.0);
//		System.out.println(bi.apply(10, 10));
//	
		
	}

}
