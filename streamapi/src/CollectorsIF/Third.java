package CollectorsIF;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Third {

	public static void main(String[] args) {
		
		
		
	Map<Integer,StringBuffer>m=Arrays.asList("welcome","to","Pune").stream()
	    .map(StringBuffer::new)
		.collect(Collectors.toMap(StringBuffer::length,StringBuffer::reverse));
	
	System.out.println(m.getClass());
	
	
	Map<Integer,StringBuffer> tm=new TreeMap<Integer, StringBuffer>(m);
	
	
	
	System.out.println(tm);
		
	}
}
