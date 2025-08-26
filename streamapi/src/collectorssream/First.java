package collectorssream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class First {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Mahesh","Gavale","Maharashtra","nflfnlfnfklflkfrkf");

		
//	List<String> filtered=	names.stream().filter(s->s.length()>10).collect(Collectors.toList());
//	
//	System.out.println(filtered);
	
	
	int sum=Stream.of(10,10,10,10).collect(new customif());
	
	System.out.println(sum);
		
	}

}

class customif implements Collector<Integer,Integer,Integer>
{

	@Override
	public Supplier<Integer> supplier() {
		
		Supplier<Integer> sup=()->(10);
		
		return sup;
	}

	@Override
	public BiConsumer<Integer, Integer> accumulator() {
		
		
		BiConsumer<Integer, Integer> bi=(i,j)->{
			
			 i+=i+j+10;
		};
		
		return bi;
	}

	@Override
	public BinaryOperator<Integer> combiner() {
		
		
		BinaryOperator<Integer> bii=(i,j)->(i+j);
		
		return bii;
	}

	@Override
	public Function<Integer, Integer> finisher() {
		
		Function<Integer, Integer> fun=(i)->(i);
		
		return fun;
	}

	@Override
	public Set<Characteristics> characteristics() {
		
		return Collections.EMPTY_SET;
	}
	
}
