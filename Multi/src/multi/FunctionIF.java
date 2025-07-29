package multi;

import java.util.Objects;
import java.util.function.Function;

public class FunctionIF {

	public static void main(String[] args) {
		
// convertodouble db=new convertodouble();
// 
// System.out.println(db.apply(20));
 
// Function<Integer,Double> fun=(i)->(i*2.0);
// 
// Function<Double,Double> fun2=(i)->(i+1);
// 
// 
//  Function<Integer,Double> fun3= fun2.compose(fun);
//    
//   System.out.println(fun3.apply(100));
//   
//   Function<Integer,Double> fun4=fun.andThen(fun2);
//   System.out.println(fun4.apply(100));
//  
		
		
		Function<Integer,Double> fun=(i)->
		{
			System.out.println("first one");
			return i*1.0;
		};
		
		//System.out.println(fun.apply(100));
		
		Function<Double,Double> fun2=(i)->
		{
			 System.out.println("second one");
			 return i*2.0;
		};
		//System.out.println(fun2.apply(100));
              
          
		        Function<Integer,Double> fun3=fun2.compose(fun);
		        
		        System.out.println(fun3.apply(100));
    
   
 
         
 
 
 
 
// fun.apply(100);
// System.out.println(100+100+fun.apply(100)+"100");

	}

}
//class convertodouble implements Function<Integer,Double>
//{
//
//	@Override
//	public Double apply(Integer t) {
//		// TODO Auto-generated method stub
//		return t*2.0;
//	}
//	
//}
