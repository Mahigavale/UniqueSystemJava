package CollectorsIF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class Seventh {

	public static void main(String[] args) {
		
		
		//"abc","def","ghi","jkl"
		//["ABC","DEF","GHI","JKL"];
		//ABCDEFGHIJKL :SB
		
		
		
		List<String> upper=Arrays.asList("abc","def","ghi","jkl")
		.stream()
		.collect(new namestolist());
		System.out.println(upper);
	}
}

class namestolist  implements Collector<String, List<String>, List<String>>
{

	@Override
	public Supplier<List<String>> supplier() {
		
		return ArrayList::new;
		
	}
	

	@Override
	public BiConsumer<List<String>, String> accumulator() {
		
		BiConsumer<List<String>, String> bi=(list,str)->{list.add(new StringBuilder(str).reverse().toString().toUpperCase());};
		
		return bi;
	}

	@Override
	public BinaryOperator<List<String>> combiner() {
		
		BinaryOperator<List<String>> bin=(list1,list2)->
		{
			list1.addAll(list2);
			return list1;
		};
				
				
		return bin;
	}

	@Override
	public Function<List<String>, List<String>> finisher() {
		Function<List<String>, List<String>> fun=(list)->(list);
		
		return fun;
	}

	@Override
	public Set<Characteristics> characteristics() {
		return Collections.EMPTY_SET;
	}
	
}