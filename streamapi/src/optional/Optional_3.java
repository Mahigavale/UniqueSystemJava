package optional;

import java.util.Optional;

public class Optional_3 {

	public static void main(String[] args) {
		
		
		Optional<String> str=Optional.ofNullable("null12");
		
		
		str.ifPresent((t)->System.out.println(t+"HUTdkjefi"));
		
		str.ifPresentOrElse((t)->System.out.println(t+23),()->System.out.println("deafult action"));
		
		//str.fi
		
		Optional<Integer> num=Optional.ofNullable(100);
		
		
		Optional<Integer> result=num.filter((i)-> i>500 );
		
		System.out.println(result);
	}

}
