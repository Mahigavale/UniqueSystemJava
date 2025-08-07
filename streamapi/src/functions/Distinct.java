package functions;

import java.util.ArrayList;
import java.util.List;

public class Distinct {

	public static void main(String[] args) {
		
		
//		List<Integer> list=new ArrayList<Integer>();
//		
//		
//		list.add(123);
//		list.add(345);
//		list.add(345);
//		list.add(111);
//		list.add(345);
//		
//		list.stream().distinct().forEach((i)->System.out.println(i));

		
		List<Book> book=new ArrayList<Book>();
		
		Book b1=new Book(1,"Parnter","V.P, Kale");
		Book b2=new Book(2,"Yayati","V.S.Khandekar");
        Book b3=new Book(3,"Shyamchi AAI", "Sane Guruji");
        Book b4=new Book(4,"Wings of fire","Dr.APJ kalam");
	
        Book b5=new Book(3,"Shyamchi AAI $$$$", "Sane Guruji$$$");
        Book b6=new Book(4,"Wings of fire","Dr.APJ kalam");
        
        System.out.println(b3.equals(b5));
        System.out.println(b4.equals(b6));
        System.out.println(b1.equals(b2));
        
		book.add(new Book(1,"Parnter","V.P, Kale"));
		book.add(new Book(2,"Yayati","V.S.Khandekar"));
		book.add(new Book(3,"Shyamchi AAI", "Sane Guruji"));
		book.add(new Book(4,"Wings of fire","Dr.APJ kalam"));
		book.add(new Book(3,"Shyamchi AAI", "Sane Guruji"));
		book.add(new Book(4,"Wings of fire","Dr.APJ kalam"));
        
//        book.add(b1);
//        book.add(b2);
//        book.add(b3);
//        book.add(b4);
//        book.add(b5);
//        book.add(b6);
		
		
		book.stream().distinct()
		.forEach((i)->System.out.println(i));
	}

}

class Book
{
	
	int id;
	String name;
	String author;
	
	public Book(int id, String name, String author)
	{
		this.id=id;
		this.name=name;
		this.author=author;
	}
	
	
	public boolean equals(Object o)
	{
		
//		Book b2=(Book)o;
//		
//		 if((this.name).equals(b2.name))
//		 {
//			 return true;
//		 }
//		
//		 return false;
		
		Book b2=(Book)o;
		
//		System.out.println(this.id);
//		System.out.println(b2.id);
		if(this.id==b2.id && this.name.equals(b2.name))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int hashCode()
	{
		return this.id;
	}
	
	
	public String toString()
	{
		return "ID: "+this.id+" Name:"+this.name+" Author:"+this.author;
	}
}