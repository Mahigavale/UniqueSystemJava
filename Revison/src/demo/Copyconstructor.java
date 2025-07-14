package demo;

public class Copyconstructor {

	public static void main(String[] args) {
		
		Company company=new Company("Asus");
		Laptop laptop=new Laptop("vivobook",89899.56,company);
		
		Laptop laptop2=new Laptop(laptop); //new Company(company)
//		System.out.println(laptop.model);
//		System.out.println(laptop2.model);
		
	 System.out.println(laptop.company.name);
	 System.out.println(laptop2.company.name);
	 
	 laptop2.company.name="Lenovo";
	 System.out.println(laptop.company.name);
	 System.out.println(laptop2.company.name);
	 
	 
	}

}

class Laptop
{
	String model;
	double price;
	Company company;
	
	
	public Laptop(String model, double price, Company company)
	{
		this.model=model;
		this.price=price;
		this.company=company;
	}
	public Laptop(Laptop laptop)
	{
		 this.price=laptop.price;  
	       this.model=laptop.model;	 //laptop2  =>laptop1.model;
	       this.company= new Company(laptop.company);
	}
}

class Company
{
	String name;
	public Company(String name)
	{
		this.name=name;
	}
	
	public Company(Company company)
	{
		 this.name=company.name;
	}
}
