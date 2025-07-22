package multi;

import java.util.function.Predicate;

public class Third {

 	  
	static public void somecondition(int i, Predicate<Integer> pred)
	{
		  if(pred.test(i))
		  {
			  System.out.println("condition passed...!");
		  }
		
		  else {
			  System.out.println("condition failed");
		  }
		  
	}
	
	public static void main(String[] args) {
		
		
	 somecondition(100,(i)->(i>1000));
		
	
	}

}



