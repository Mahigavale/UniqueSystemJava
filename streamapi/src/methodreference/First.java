package methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class First {
	

	public static void main(String[] args) {
		
	
//		Supplier<Integer> supplier=First::display;
//		
//		 System.out.println(supplier.get());
		
		
		Student.id=100;
		Supplier<Integer> ids=Student::displayid;
		
		Supplier<Student> students=Student::create ;
		
		Supplier<List<Student>> arr=Student::createlist ;
		
		Supplier<List<Student>> arr2=()->{
         List<Student> list=new ArrayList<Student>();
		
		list.add(new Student());
		list.add(new Student());
		list.add(new Student());
		
		return list;
		};
	
		
		System.out.println(ids.get());
		
		System.out.println(students.get());
		System.out.println("******************************** method ref*******");
		System.out.println(arr.get());
		System.out.println("*****Lambda****************");
		System.out.println(arr2.get());
		
	}
}

class Student
{
	static int id;
	String name;
	
	
	public Student()
	{
		System.out.println("Object created..");
	}
	
	public static int displayid()
	{
		return id;
	}

	
	public static Student create()
	{
		return new Student();
	}
	
	public String toString()
	{
		return "babare my reference";
	}
	
	
	public static List<Student> createlist()
	{
		List<Student> list=new ArrayList<Student>();
		
		list.add(new Student());
		list.add(new Student());
		list.add(new Student());
		
		return list;
	}
}

