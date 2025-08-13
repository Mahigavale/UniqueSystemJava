package optional;

import java.util.Optional;

public class Optional_one {

	public static void main(String[] args) throws Exception {
		
		
		Student student=new Student();
		student=null;
		
		Optional<Student> ops=Optional.ofNullable(student);
		
		
		ops.orElseThrow(()-> new Exception("HELLO SIR"));
		
		ops.ifPresentOrElse((o)->System.out.println(o), ()->System.out.println("handle it"));
		
	
		
		Optional<String> op=Optional.of("hiii");
	 String demo=op.orElseGet(()-> "hello");
		
		System.out.println(demo);
		
	}
}
class Student
{
	String name;
	
	
	public String getname()
	{
		return name;
	}
}