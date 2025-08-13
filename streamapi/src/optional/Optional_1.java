package optional;

import java.util.Optional;

public class Optional_1 {

	public static void main(String[] args) {
		
//		String name=null;
//		
//		Optional<String> nameop=Optional.empty();
//				
//				//Optional.ofNullable(name);
//		//System.out.println(nameop.get());
//		
//		System.out.println(nameop);
//	
		
		
		
		Optional<String> name=Optional.ofNullable(null);
		
		/**
		 * 3 ways to initialize an Optional:
		 * Optional.of()=> RequiresNOtnull
		 * Optional.ofNullable()=>
		 * OPtional.empty()=> empty optional.
		 * 
		 */
		
		
		//System.out.println(name.get());
		
		//System.out.println(name.isPresent());
//		System.out.println(name.isEmpty());
		
	Optional<String> str=name.or(()->Optional.of("DEFAULT"));
	
	System.out.println(str.get());
		
	}

}
