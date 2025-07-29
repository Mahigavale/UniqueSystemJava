package sync;

import java.util.List;
import java.util.function.Supplier;

public class Supplierone {

	public static void main(String[] args) {
		
		Supplier<Double> sup=()->((Math.random()*10000)/10);
		
		
		System.out.println(sup.get());
		
		Supplier<String>  greet=()->("hello");
		
		System.out.println(greet.get());
		
		Sty sty=new Sty(10,"mahesh");
		Sty sty2=new Sty(11,"dada");
		
		Supplier<Integer> students=()->(sty.getId());
		
		System.out.println(students.get());

	}

}

class Sty{
	
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Sty(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}