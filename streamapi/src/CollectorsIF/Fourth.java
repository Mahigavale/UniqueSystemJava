package CollectorsIF;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Fourth {

	public static void main (String args[])
	{
		
//		Map<Character,List<String>> ar=Arrays.asList("Abc","aa","cdef","adjr","bb","asdhs","aaaaa").stream()
//		.collect(Collectors.groupingBy((i)->(i.charAt(0))));
//		
//		
//		
//		System.out.println(ar);
		
		employee emp=new employee();
		
		employee emp2=new employee();
		
		emp.city="pune";
		emp.id=2;
		emp2.city="pune";
		emp2.id=1;
		
		employee emp3=new employee();
		 emp3.city="Mumabi";
		 emp3.id=3;
	Map<String,List<employee>> sd=	Arrays.asList(emp,emp2,emp3).stream().collect(Collectors.groupingBy((i)->(i.city)));
	
	System.out.println(sd);
	}
}
class employee
{
	int id;
	String city;
	
	public String toString()
	{
		return "id:"+this.id;
	}
	
}
