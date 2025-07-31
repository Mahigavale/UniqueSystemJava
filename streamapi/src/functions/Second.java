package functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Second {

	public static void main(String[] args) {
		
List<Employee1> list=new ArrayList<Employee1>();
		
		list.add(new Employee1(1,"ABC","A@gmail.com",4546.8));
		list.add(new Employee1(2,"DEF","D@gmail.com",4546.8));
		list.add(new Employee1(3,"GHI","G@gmail.com",4546.8));
		
		List<Employee1> list2=new ArrayList<Employee1>();

		list2.add(new Employee1(4,"ABC","A@gmail.com",4546.8));
		list2.add(new Employee1(5,"DEF","D@gmail.com",4546.8));
		list2.add(new Employee1(6,"GHI","G@gmail.com",4546.8));
		
		List<List<Employee1>> two=new ArrayList<List<Employee1>>();
		
		two.add(list);
		two.add(list2);
		
		Consumer<Employee1> cons=(i)->{
		
			
				System.out.println(i.id*2);
				System.out.println(i.name+"from consumer");
				System.out.println(i.email+":000My email");
				System.out.println(i.salary-100.0);
				System.out.println("**********************************");
			
		};

		
		//cons.accept(list);
		
		list.stream().forEach(cons);
	}

}
class Employee1
{
	int id;
	String name;
	String email;
	double salary;
	
	public Employee1(int id,String name, String email, double salary)
	{
		this.id=id;
		this.name=name;
		this.email=email;
		this.salary=salary;
		
	}
}