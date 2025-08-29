package CollectorsIF;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class Sixth {

	public static void main(String[] args) {
		//abc,cde,efg,ijk,lmn=>String
		//abccdeefgijklmn=>String
		
	String str=	Arrays.asList("abc","cde","efg","ijk","lmn").stream().collect(new nameappender());

	System.out.println(str);
	}

}

class nameappender implements Collector<String, StringBuilder, String>{


	public Supplier<StringBuilder> supplier() {
	
		
		
		//also , StringBuilder::new;
		  Supplier<StringBuilder> sup=()->(new StringBuilder());
		  
		  return sup;
	}

	@Override
	public BiConsumer<StringBuilder, String> accumulator() {
		
		//appended the each element into the separate StringBuilder
		BiConsumer<StringBuilder, String> bi=(sb,s)->{
			sb.append(s);
		};
		
		return  bi;
	} 

	@Override
	public BinaryOperator<StringBuilder> combiner() {
	
		// combined the multiple String Builders into the single StringBuilder.
		BinaryOperator<StringBuilder> sbr=(sb1,sb2)->(sb1.append(sb2));
		
		return sbr;
	}

	@Override
	public Function<StringBuilder, String> finisher() {
		//Converted the the String Builder to the String to match with <T,A,R>
		//T=>String
		//A=> Stringbuilder=>Modifiable
		//R=>String=>ResultType.
		Function<StringBuilder, String> fun=(sb)->(sb.toString().toUpperCase());
		
		return fun;
	}

	@Override
	public Set<Characteristics> characteristics() {
		
		return Collections.EMPTY_SET;
	}
}