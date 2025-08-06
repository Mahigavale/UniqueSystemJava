package functions;

import java.util.ArrayList;
import java.util.List;

public class Peekmethod {

	public static void main(String[] args) {
		
		
		List<Integer> list= new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(50);
		
		
		list.stream().
		filter((i)->(i>10)).
		peek((i)->System.out.println("after filter:"+i)).
		map((i)->(i*2.0)).
		peek((i)->System.out.println("after map:"+i)).
		forEach((i)->System.out.println("for each:"+i));

	}

}
