package demo;

import java.util.HashMap;
import java.util.Map;

public class Map2 {

	public static void main(String[] args) {
		
     Map<Leader,Integer> mh=new HashMap<Leader, Integer>();
     
   
     mh.put(new Leader(1,"ABC"), 1);
     mh.put(new Leader(1,"ABC"), 2);
     
     
     System.out.println(mh.containsKey(new Leader(1,"ABC")));
    // System.out.println(mh);
	}

}


class Leader
{
	int id;
	String  name;
	
	public Leader(int id, String name)
	
	{
		this.id=id;
		this.name=name;
	}
	
	public String toString()
	{
		return this.id+","+this.name;
	}
	
	public int hashCode()
	
	{
		return  this.id;
	}
	
	
//	public boolean equals(Object o)
//	{
//		
//		if(this==o)
//		{
//			return true;
//		}
//		
//		Leader lead=(Leader) o;
//		if( lead.id==this.id && lead.name.equals(this.name))
//		{
//			return true;
//		}
//		return false;
//	}
}