package instancemethodref;

import java.util.ArrayList;
import java.util.List;

public class instance1 {

	public static void main(String[] args) {
		
		
		Student student=new Student(1,"ABC","abc@gmail.com",33);
		
		List<Student> list=student.createlist();
		
		
		filter_student fil=new filter_student(student);
		list.stream().filter(fil::filter_stud).forEach((i)->System.out.println(i.name));;
		
		
	}
}



class Student
{
	int id;
	String name;
	String email;
    double marks;
    
    public Student(int id, String name, String email,double marks)
    {
    	this.id=id;
    	this.name=name;
    	this.email=email;
    	this.marks=marks;
    }
    
    public List<Student> createlist()
    {
    	List<Student> list=new ArrayList<Student>();
    	
    	list.add(this);
    	list.add(new Student(this.id+1,this.name+"a",this.email+"a",this.marks+1));
    	list.add(new Student(this.id+2,this.name+"b",this.email+"b",this.marks+2));
    	list.add(new Student(this.id+3,this.name+"c",this.email+"c",this.marks+3));
    	
    	
    	return list;
    }
}
class filter_student
{
	
	Student student;
	
	
	public filter_student(Student student)
	{
		this.student=student;
	}
	
	
	public boolean filter_stud(Student student)
	{
		
		if(student.marks>35)
			
		{
			return true;
		}
		
		return false;
	}
}