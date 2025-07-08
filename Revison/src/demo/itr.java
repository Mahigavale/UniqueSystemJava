package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class itr {

	public static void main(String[] args) {

    
		List<Student_one> nums=new LinkedList<Student_one>();
		
		
		nums.add(new Student_one(1,"A"));
		nums.add(new Student_one(2,"B"));
		//.add(4);
		
		
//		for(Student_one i:nums)
//		{
//			System.out.println(i.id);
//			System.out.println(i.name);
//			System.out.println("********************");
//		}

		Iterator<Student_one> itr=nums.iterator();
		
		ListIterator<Student_one> litr=nums.listIterator();
//		
//		for(Student_one one:nums)
//		{
//			
//		}
//		while(itr.hasNext())
//		{
//			Student_one two=itr.next();
//			System.out.println(two.id);
//			System.out.println(two.name);
//		//	System.out.println(itr.next().id);
//		}
		

		while(litr.hasNext())
		{
			Student_one one=litr.next();
			//System.out.println(one.id);
			//System.out.println(litr.hasPrevious());
		}
		System.out.println();
		
		while(litr.hasPrevious())
		{
			Student_one one=litr.previous();
			System.out.println(one.id);
		}
		
		
	}

}

class Student_one
{
	int id;
	String name;
	
	public Student_one(int id, String name)
	{
		this.id=id;
		this.name=name;
	}

}