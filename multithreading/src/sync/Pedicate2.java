package sync;

import java.util.function.Predicate;

public class Pedicate2 {

	public static void main(String[] args) {
		Cars cars = new Cars(1, "Audi", 999);

//		Predicate<Cars> isexpensive = new Predicate<Cars>() {
//
//			@Override
//			public boolean test(Cars car) {
//
//				if (car.price > 1000) {
//					return true;
//				}
//				return false;
//			}
//
//		};
		
		Predicate<Cars> isexpensive=(ca)->{
			if(ca.price>1000)
				return true;
			else
				return false;
		};
		
     System.out.println(isexpensive.test(cars));
	}
}

//class isexpensive implements Predicate<Cars>

class Cars {
	int id;
	String name;
	double price;

	public Cars(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}