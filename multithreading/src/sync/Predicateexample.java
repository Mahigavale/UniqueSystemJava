package sync;

import java.util.function.Predicate;

public class Predicateexample {

	public static void main(String[] args) {

		Predicate<Integer> iseven = (i) -> (i % 2 == 0); // true

		Predicate<Integer> isprime = new Predicate<Integer>() {

			public boolean test(Integer i) {
				boolean flag = true;
				for (int j = 2; j <= (i / 2); j++) {
					if (i % j == 0) {
						flag = false;
						break;
					}

				}
				if (flag) {
					return true;
				} else {
					return false;
				}
			}

		};

		// new Predicate<Integer>(){
//			
//			public boolean test(Integer i)
//			{
//				if(i%2==0)
//				{
//					return true;
//				}
//				return false;
//			}
//		};

		System.out.println(iseven.test(11));
		System.out.println(isprime.test(24));
	}

}
