package methodreference;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Second {

	public static void main(String[] args) {
		
		Function<Integer, Double> fun=Helper2::cube;
		
	 System.out.println(fun.apply(10));
	 
	 Consumer<Integer>con=Helper2::consumer;
	 
	   con.accept(100);
	   
		
	   Predicate<Integer> pred=Helper2::check;
	   
	   System.out.println(pred.test(13));
		
	}

}

class Helper2
{
	
	
	public static double cube(int num)
	{
		return num*num*num+1.0;
	}
	
	public static void consumer(int i)
	{
		System.out.println("Printing :"+i);
	}
	
	public static boolean  check(int i)
	{
		return i>10;
	}
}