package methodref;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Second {

	public static void main(String[] args) {
		
		
		List<String> names=Arrays.asList("abck","lmlmdl","dkfd");
		Function<String, String> fun=One::getname;
		
		names.stream().map(fun).forEach(System.out::println);
		//System.out.println();
		
		
		
		//Supplier<One> ont=One::new;
		//Function<String, One> on2=One::new;
		BiFunction<String, String, One> on3=One::new;
		
		One on=on3.apply("dada","vada");
		
		System.out.println(on);
		
		
		//One on=ont.get();
		
		
	}

}


class One
{
	
	
	public One(String abc,String def)
	{
	System.out.println("Object created here..."+abc+def);	
	}
	public static String getname(String str)
	{
		return str.toUpperCase();
	}
	
	
}
