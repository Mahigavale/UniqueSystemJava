package functions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employeemanager {

	public static void main(String[] args) {
		
     
		List<Employee_> logic=new ArrayList<Employee_>();
		
		logic.add(new Employee_(1,"Suraj",123455.78,"HR"));
		logic.add(new Employee_(2,"Manav",123.78,"HR"));
		logic.add(new Employee_(3,"PD",1278,"IT"));
		logic.add(new Employee_(4,"Abhishek",1234551.78,"HR"));
		logic.add(new Employee_(15,"Mukund",123455.78,"IT"));
		//logic.stream().distinct().forEach((i)->System.out.println(i));
		
		
		logic.stream().sorted(new Salarycomparator())
		.distinct()
		.forEach((i)->System.out.println(i));
	}

}

class Employee_
{
	
	int id;
	String name;
	double salary;
	String dept;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Employee_(int id, String name, double salary, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee_ [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	public boolean equals(Object o)
	{
		
		Employee_ emp=(Employee_)o;
		
//		System.out.println("*****************");
//		System.out.println(this.getDept());
//		System.out.println(emp.getDept());
//		System.out.println("*******************");
		if (this.getDept().equals(emp.getDept()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public int hashCode()
	{
		return 1;
	}
	
	
	
	
}

class Salarycomparator implements Comparator<Employee_>
{

	@Override
	public int compare(Employee_ o1, Employee_ o2) {
		// TODO Auto-generated method stub
		return (int)o2.getSalary()- (int)o1.getSalary();
	}
	
}