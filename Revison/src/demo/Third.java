package demo;

import java.util.HashSet;
import java.util.Set;

public class Third {

	public static void main(String[] args) {
		

		
		Player first=new Player();
		first.id= 1;
		first.name= "Sachin";
		first.city="Pune";
		
	
		Player second=new Player();
		second.id=1;
		second.name="Sachin";
		second.city="Durban";
		
		Player third=new Player();
		third.id=3;
		third.name="Cook";
		third.city="Brisbane";
		
		
		Set<Player> set=new HashSet<Player>();
		
		set.add(first);
		set.add(second);
		set.add(third);
		
		
		
	//	System.out.println(set);
		
		System.out.println(set);
		//System.out.println(set2);
	
	
//	for(Player p:set)
//	{
//		System.out.println(p.name);
//		System.out.println(p.city);
//	
//		System.out.println("***************");
//	}

}
}

class Player
{
	int id;
	String name;
	String city;
	
	
	public int hashCode()
	{
		return 100+this.id;
	}
	
	public boolean equals(Object o)
	{
		
		if(this==o)
		{
			return true;
		}
		
		Player pl=(Player)o;
		if(this.id==pl.id && this.name.equals(pl.name) )
		{
			return true;
		}
		return false;
	}
	
}
