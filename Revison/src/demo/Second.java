package demo;

public class Second {

	public static void main(String[] args) {
	 	
		Student first=new Student();
		
		first.id=101;
	
		Student second=new Student();
		second.id=100;
		
		  System.out.println(first.hashCode());
          System.out.println(second.hashCode());		
		
          
          System.out.println(first.equals(second));
	}

}


class Student
{
	
	int id;
	
	
	
	public int hashCode()
	{
		return 150;
	}
	
	public boolean equals(Object obj)
	{
		if(this==obj)
		{
			return true;
		}
		
		Student st=(Student)obj;
		if(this.id==st.id)
		{
			return true;
		}
		
		return false;
		
	}
	
}