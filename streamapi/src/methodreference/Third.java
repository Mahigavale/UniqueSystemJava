package methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Third {

	public static void main(String[] args) {
		Car car=new Car();
		
		car.id=1;
		car.name="Mustang";
		
		Car car2=new Car();
		car2.id=100;
		car2.name="ferrari";
		
		Car car3=new Car();
		car3.id=111;
		car3.name="ford";
		
		Car car4=new  Car();
		car4.id=400;
		car4.name="Chervolet"
;		
		List<Car> cars=new ArrayList<Car>();
		
		cars.add(car2);
		cars.add(car);
		cars.add(car3);
		cars.add(car4);
		
		
		
		cars.stream().filter(car::check).map(car::upper).forEach((i)->System.out.println(i));
//		
//		Consumer<Integer> pr=car::checkid;
//		
//		pr.accept(100);
//		
//		Function<String, String> str=car::upper;
//		
//		 System.out.println(str.apply("abc"));
//		 
//		 
		
		
	}
}


class Car
{
//{
   int id;
   String name;
	
	public   void  checkid(Car car)
	{
		
		System.out.println("id:"+car.name);
		
	}
	
	public  String upper(Car car)
	{  
		return car.name.toUpperCase();
	}
	
	public boolean check(Car car)
	{
		
		return car.id>10;
	}
 
}