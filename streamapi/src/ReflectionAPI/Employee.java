package ReflectionAPI;

public class Employee {

	//3 fields
	
	int id;
	String name;
	
	private double salary;
	
	
	public Employee()
	{
		
	}
	
	private Employee(int i)
	{
		
	}
	
	
	protected Employee(StringBuffer j, int k, int l)
	{
		
	}
	
	Employee(double o)
	{
		
	}
	
	
	public void display()
	{
		System.out.println("hiii from employee...");
	}
	
	private void securemethod(int j, int k)
	{
		System.out.println("this is from the secure method.."+(j+k));
	}
	
	final void finaldemo()
	{
		System.out.println("final method");
	}
	
	 void defualtdemo()
	 {
		 System.out.println("this is the defualt method");
	 }
}
