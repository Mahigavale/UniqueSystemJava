package collectorssream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Third {

	public static void main(String[] args) {
		
	
		List<String> names=Arrays.asList("mahesh","ashok","asjsjda","fcnd","as","as","ds");
		
	Map<Character,Long> rs=names.stream().collect(Collectors.groupingBy((s)->(s.charAt(0)),Collectors.counting()));
	
	System.out.println(rs);
	}

}
