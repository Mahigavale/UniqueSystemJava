package CollectorsIF;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Fifth {

	public static void main(String[] args) {
		
		
	Map<Object, List<String>> map=	Arrays.asList("sanika","taujal","sakshi","binod").stream()
		.map((s)->(s.toUpperCase())).collect(Collectors.groupingBy((s)->(s.charAt(0))));
	
	
	System.out.println(map);
	
	}

}
