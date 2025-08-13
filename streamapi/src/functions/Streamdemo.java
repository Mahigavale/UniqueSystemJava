package functions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Streamdemo {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		
		
		list.add(1);
		list.add(120);
		list.add(345);
		list.add(320);
		list.add(123);
		
//		Optional<Integer> op=(list.stream().max((i1,i2)->i1-i2));
//		
//		op.ifPresentOrElse((i)-> System.out.println(i), null);
		
		
		System.out.println(list.stream().reduce((a,b)->(a+b)).get());
		//BinaryOperator<T>
	}

}
