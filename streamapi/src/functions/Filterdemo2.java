package functions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Filterdemo2 {

	public static void main(String[] args) {
		List<EmployeeIt> list=new ArrayList<EmployeeIt>();
		
		list.add(new EmployeeIt(1,"AAAC",3455.67));
		list.add(new EmployeeIt(2,"AAAB",5676.78));
		list.add(new EmployeeIt(3,"Gabriel",1000.0));
		list.add(new EmployeeIt(4,"AAAAAAAAA",5843.67));
		list.add(new EmployeeIt(5,"bbbbbbbbbbbb",6940.45));
		
		
		
		
		
		
		
		
		list.stream()
		.filter((emp)->(emp.getsalary()>3.0))
//		.map((emp)->(new StringBuffer(emp.getname()).reverse()).toString().toUpperCase())
         .sorted(new Saalarycomparator())
		.forEach((emp)->System.out.println(emp.getsalary()));
		
		
		
	}
}

class EmployeeIt  implements Comparable<EmployeeIt>
{
	int id;
	String name;
	double salary;
	
	public EmployeeIt(int id, String name, double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	
	
	public int getid()
	{
		return this.id;
	}
	
	public String getname()
	{
		return this.name;
	}
	
	public double getsalary()
	{
		return this.salary;
	}



	@Override
	public int compareTo(EmployeeIt o) {
		return o.getname().length()-this.getname().length();
	}
}


class Saalarycomparator implements Comparator<EmployeeIt>
{

	@Override
	public int compare(EmployeeIt o1, EmployeeIt o2) {
		
		
		int sal1=(int)o1.getsalary();
	    int sal2=(int )o2.getsalary();			
		
		return (sal2-sal1);
	}
	
}