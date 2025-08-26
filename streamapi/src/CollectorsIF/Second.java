package CollectorsIF;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Second {

	public static void main(String[] args) {
		
		
	 Set<Integer> l=	Arrays.asList("employeeee","1111111111111111", "horse","camel","elephan").stream()
		.map(String::length)
		.collect(Collectors.toSet());
	 System.out.println(l);

	 
	}

}
