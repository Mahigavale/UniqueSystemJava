package functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Mapdemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();

		list.add(123);
		list.add(111);
		list.add(100);
		
		//Function<Integer, Double> function=(i)->(i*2.0);
		
		list.stream().map((i)->(i*2.0)).forEach((i)->System.out.println(i));
	
		
		
		List<String> names=new ArrayList<String>();
		names.add("latur");
		names.add("Jalna");
		names.add("PuNe");
		names.stream().map((i)->(new StringBuffer(i.toUpperCase()).reverse())).forEach((i)->System.out.println(i));

}
}