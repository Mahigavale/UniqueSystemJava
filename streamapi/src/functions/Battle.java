package functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Battle {

	public static void main(String[] args) {
		

		
		List<Integer> list=new ArrayList<Integer>();
		
		
		list.add(12);
		list.add(11);
		list.add(15);
		list.add(17);
		list.add(19);
		
		 //System.out.println(list.stream().reduce(0,(i,j)->(i+j)));
		
		list.stream()
		.filter((i)->(i>10))
		.peek((i)->System.out.println(i*2))
		.forEach((j)->{
			System.out.println("foreach");
			System.out.println(j);
		});
		
	}

}

