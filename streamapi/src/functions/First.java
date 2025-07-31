package functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class First {

	public static void main(String[] args) {
		
		
		List<Employee> list=new ArrayList<Employee>();
		
		list.add(new Employee(1,"ABC","A@gmail.com",4546.8));
		list.add(new Employee(2,"DEF","D@gmail.com",4546.8));
		list.add(new Employee(3,"GHI","G@gmail.com",4546.8));
		
		
		
		Consumer<List<Employee>> cons=(list1)->{
			for(Employee i:list1)
			{
				System.out.println(i.id*2);
				System.out.println(i.name+"from consumer");
				System.out.println(i.email+":000My email");
				System.out.println(i.salary-100.0);
				System.out.println("**********************************");
			}
		};

		
		cons.accept(list);
}
}
class Employee
{
	int id;
	String name;
	String email;
	double salary;
	
	public Employee(int id,String name, String email, double salary)
	{
		this.id=id;
		this.name=name;
		this.email=email;
		this.salary=salary;
		
	}
}