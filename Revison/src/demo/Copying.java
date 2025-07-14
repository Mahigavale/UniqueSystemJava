package demo;

public class Copying {

	public static void main(String[] args) throws CloneNotSupportedException {
		
   
	//	Book book=new Book(1,"Alchemist");
		
//		Book book2=(Book)book.clone(); //new Book(1,"Alchemist");  //shallow copy
//		//System.out.println(book==book2);
//		System.out.println(book2.id);
//		System.out.println(book2.name);
//		System.out.println("****************************");
//		System.out.println(book.id);
//        System.out.println(book.name);	
//        
//        book2.id=2;
//        System.out.println("****************************");
//        System.out.println(book.id+" "+book.name);
//        System.out.println(book2.id+" "+book2.name);
//        
//        
		
	}




//class Book  implements Cloneable
//{
//	int id; //instance variables
//	String name;
//	
//	public Book(int id, String name) //constructor.
//	{
//		this.id=id;
//		this.name=name;
//	}
	
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}