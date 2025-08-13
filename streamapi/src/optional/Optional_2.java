package optional;

import java.util.Optional;

public class Optional_2 {

	public static void main(String[] args)  {
		
		
		
		Optional<String> str=Optional.ofNullable(null);
		
		
		System.out.println(str.or(()->Optional.of("TREE")).get());
		
    	 System.out.println( str.orElse("CDE")); //returns a String
		 
		 System.out.println(str.orElseGet(()->"HELLO")); //Through Supplier.
		  
		//   System.out.println(str.orElseThrow());
		 
		 try {
		 str.orElseThrow(()->new Exception("Null value"));
		 }
		 catch(Exception e)
		 {
			 System.out.println(e.getMessage());
		 }
		 
		 
		 
	}

}
