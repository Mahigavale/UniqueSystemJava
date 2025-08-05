package functions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Sixth {

	public static void main(String[] args) {
	
		
		
		
		
		//map,filter,sorted,limit,skip
		//foreach,count,
		
		//max,min=> Only comparator.
		
		
	List<Student> list= new  ArrayList<Student>();
	
	list.add(new Student(1,"Aasfd"));
	list.add(new Student(2,"Bdjefheifdj"));
	list.add(new Student(10,"ccc"));
	
	list.add(new Student(30,"Ketaki"));
	list.add(new Student(40,"shakal"));
	list.add(new Student(86,"djbfjednkede"));
	
	 //System.out.println(list.stream().max(new Idcomp()));
	 
	 //System.out.println(list.stream().min(new Idcomp()));
	
	//list.stream().limit(2).forEach((i)->System.out.println(i.id));
	//System.out.println("********************************");
	
	//list.stream().skip(4).forEach((i)->System.out.println(i.id));
	
	
	     list.stream().sorted()
	     .limit(2)
	     .skip(1)
	     .map((student)->new StringBuffer(student.name).toString().toUpperCase())
	     .forEach((i)->System.out.println(i));
	   

	}
}

class Student implements Comparable<Student>
{
	int id;
	String name;
	
	public Student(int id, String name)
	{
		this.id=id;
		this.name=name;
	}

	@Override
	public int compareTo(Student o) {
		return o.id-this.id;
	}
	
	
	public int getid()
	{
		return this.id;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}

//class Idcomp implements Comparator<Student>
//{
//
//	@Override
//	public int compare(Student o1, Student o2) {
//		
//		return  (o1.name.length()-o2.name.length());
//	}
//	
//}