package sync;

import java.util.function.Predicate;

public class Predicate3 {
	

	public static void main(String[] args) {
		
		
		Predicate<Integer> pred1=(i)->(i>10);
		
		Predicate<Integer> pred2=(i)->(i<100);
		

                        System.out.println(pred1.and(pred2).test(500));
                        System.out.println(pred1.or(pred2).test(500));
                        System.out.println(pred1.or(pred2).negate().test(500));
	}

}
