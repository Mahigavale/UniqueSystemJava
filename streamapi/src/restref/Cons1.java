package restref;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Cons1 {

	public static void main(String[] args) {
	
		
		City city=new City(1,"pune");
		
		City city2=new City(2,"Mumbai");
		
		
		List<City> list=new ArrayList<City>();
		
		list.add(city);
		list.add(city2);
		
		
//    BiFunction<Integer, String, City> bi=City::new;
//		
//	
//    
//   System.out.println( bi.apply(10, "ABC"));
		
		
		list.stream().map((i)->(i.name)).map(String::toUpperCase).forEach(System.out::println);
	}
}


class City
{
	int id;
	String name;
	public City(int id,String name)
	{
		this.id=id;
		this.name=name;
		System.out.println("ID"+id);
	    System.out.println("Name:"+name);
	}
	
	public String getname()
	{
		return this.getname();
	}
	
	public String toString()
	{
		
		return this.name;
	}
}
