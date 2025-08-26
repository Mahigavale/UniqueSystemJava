package instancemethodref;

import java.util.ArrayList;
import java.util.List;

public class Arbitaryref {

	public static void main(String[] args) {
		
		Student_1 st1=new Student_1();
		
		Student_1 st2=new Student_1();
		
		st1.name="ab";
		
		st2.name="cd";
		
		
		List<String>  list=new ArrayList();
		
		list.add("st2");
		
		list.add("st1");
		
		list.stream().map(StringBuffer::new).map(StringBuffer::reverse).forEach((i)-> System.out.println(i));
	}

}

class Student_1
{
	String name;
}