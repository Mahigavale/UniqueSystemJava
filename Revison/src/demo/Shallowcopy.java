package demo;

public class Shallowcopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Author author= new Author("James");
        Book book1=new Book(1,"Alchemist",author);
 
        Book book2=  (Book) book1.clone();//
 
   
        book2.id=2;
        book2.name="Ikigai";
       book2.author.authorname="Anderson";
  System.out.println(book2.id+" "+book2.name+" "+book2.author.authorname);
  System.out.println(book1.id+" "+book1.name+" "+book1.author.authorname);
 
	}
}


class Book implements Cloneable{
	
	 int id;
	 String name;
	Author author;
	
	 
	 public Book(int id, String name, Author author)
	 {
		 this.id=id;
		 this.name=name;
		 this.author=author;
		
		
	 }
	 protected Object clone() throws CloneNotSupportedException
	 {
		Book book= (Book)super.clone(); //new Book(id, name,new Author());
		book.author= (Author)this.author.clone();
		
		return book;
	 }
}

class Author implements Cloneable
{
	String authorname;
	
	public Author(String authorname)
	{
		this.authorname=authorname;
	}
	
	protected Object clone() throws CloneNotSupportedException
	{
		System.out.println("author clone called ");
		return super.clone(); //new Author("Anderson"));
	}
}