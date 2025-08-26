package instancemethodref;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class instance2 {

	public static void main(String[] args) {
		
		Book book=new Book(1,"AB",99.0);
		
		Book_validator validate=new Book_validator(book);
		
		List<Book> list=book.createlist();
		
		
		list.stream().filter(validate::filterByPrice).forEach((i)->System.out.println(i));

	}

}

class Book
{
	
	int id;
	String name;
	double price;
	
	public Book(int id, String name, double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		
	}
	
	public List<Book> createlist()
	{     
		
		int id=this.id;
		String name=this.name;
		 Double price=this.price;
		Book book=new Book(this.id,this.name,this.price);
		
		Book book1=new Book(id+1,name+"a",price+1.0);
		
		Book book2=new Book(id+2,name+"b",price+2.0);
		
		Book book3=new Book(id+3,name+"c",price+3.0);
		
		List<Book> list=new ArrayList<Book>();
		list.add(book);
		list.add(book1);
		list.add(book3);
		list.add(book2);
		
		return list;
	}
	
	public  Optional<String> getname()
	{
		return Optional.ofNullable(this.name);
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}

class Book_validator
{
	Book book;
	
	
	public Book_validator(Book book)
	{
		this.book=book;
	}
	
	
	public boolean filterByPrice(Book book)
	{
		if(book.price>100.0)
		{
		  return true;	
		}
		
		return false;
	}
	
}