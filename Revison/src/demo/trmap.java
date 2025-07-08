package demo;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class trmap {

	public static void main(String[] args) {
		
		
	 Map<Employee,String> map=new TreeMap<Employee, String>(//new Comparator<Employee>() {

		//@Override
		//public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
		//	return 0;
		//}
	//}););
			 );
	
	 
	 
	 map.put(new Employee(1,"A",5678.67,"A@gmail"), null);
	 map.put(new Employee(2,"B",5678.67,"A@gmail"), "not null");
	
	 System.out.println(map.size());

	 
	 System.out.println(map);
	}

}


class Employee implements Comparable<Employee>
{
	 int id;
	 String name;
	 double salary;
	 String email;
	 
	 public Employee(int id, String name,double salary, String email)
	 {
		 this.id=id;
		 this.name=name;
		 this.salary=salary;
		 this.email=email;
	 }

	@Override
	public int compareTo(Employee o) {
		return this.id-o.id;
	}
	
	public int hashCode()
	{
		return 100;
	}
	
	public boolean equals(Object o)
	{
		if(this==o)
		{
			return true;
		}
		
		Employee e=(Employee)o;
		if(this.id==e.id)
		{
			return true;
		}
		return false;
	}
}
