package demo;

public class Copying2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Director dir=new Director("Rajkumar Hirani");
		Film film=new Film("100cr","Diljale","1999/12/11",dir);
		
		Film film2=(Film)film.clone();
		
		//System.out.println(film.name);
		film2.name="Dilwale";
		System.out.println("Film one:"+film.name);
		System.out.println("film2 name:"+film2.name);
		
		System.out.println("first director:"+film.director.directorname);
		//System.out.println(film2);
		
		film2.director.directorname="Yashraj chopra";
		System.out.println("second director:"+ film2.director.directorname);
		System.out.println("first director:"+film.director.directorname);

	}

}

class Film implements Cloneable
{
	String collection;
	String name;
	String releasedate;
	Director director;
	
	public Film(String collection, String name, String releasedate, Director director)
	{
		this.collection=collection;
		this.name=name;
		this.releasedate=releasedate;
		this.director=director;
	}
	
	protected Object clone() throws CloneNotSupportedException
	{
		Film film=(Film) super.clone();
		film.director= (Director)this.director.clone();
		return film;
	}
	
}

class Director implements Cloneable{
	String directorname;
	
	public Director(String directorname)
	{
		this.directorname=directorname;
	}
	
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

}
