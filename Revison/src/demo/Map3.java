package demo;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Map3 {

	public static void main(String[] args) {
	
		Map<Superviser,Integer> tcs=new TreeMap(new namecomparator());
		
		
		Superviser first=new Superviser(1,"ABCjrfnrkf",4567);
		
		Superviser second=new Superviser(2,"DEF",1234);

		
		tcs.put(first, 2);
		tcs.put(second, 1);
		
		System.out.println(tcs);
		
		
		
		
		

	}

}

class Superviser implements Comparable<Superviser> {
	
	int id;
	String name;
	long salary;
	
	public Superviser(int id, String name, long salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	@Override
	public int compareTo(Superviser o) {
		
		if(this.salary>o.salary)
		{
			return 1;
		}
		if(this.salary<o.salary)
		{
			return -1;
		}
		return 0;
	}
	
	public String toString()
	{
		return " "+this.salary+" "+this.name +" "+this.id;
	}
}


class namecomparator implements Comparator<Superviser>
{

	@Override
	public int compare(Superviser o1, Superviser o2) {
		
		return o2.name.length()-o1.name.length();
		
	}
	
}