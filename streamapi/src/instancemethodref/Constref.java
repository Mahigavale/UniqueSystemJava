package instancemethodref;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Constref {

	public static void main(String[] args) {
	
		BiFunction<String, String , Object> fun=Car::new;
		fun.apply("Mustang", "ford");
		
		

		Function<String , Car> fun3=Car::new;
		fun3.apply("Alto");
		
		Ternary<Integer,String, String, String,Car > ter=Car::new;
		
		 ter.Ghere(12, "Alto", "12332", "taTA");
		
	}

}


class Car
{
	
	String name;
	String company;
	
	
	public Car(String name, String company)
	{
		this.name=name;
		this.company=company;
		System.out.println("Object created:"+name);
	}
	
	public Car(String name)
	{
		 this.name=name;
		 
		 System.out.println("Object created:"+name);
	}
	
	
	
	public Car(int id, String city, String pin, String state)
	{
		System.out.println("Object created:"+id+city+pin+state);
	}
}



interface Ternary<A,B,C,D,R>
{
	
	public R Ghere(A a,B b,C c,D d);
}