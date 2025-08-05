package functions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Seventh {

	public static void main(String[] args) {
		
		List<Product> list=new ArrayList<Product>();
		
		try {
		for(int i=0;i<4587934;i++)
		{
			list.add(new Product(i,"A"+i,i+1.0+7.57));
		}
		}
		catch(Error e)
		{
			System.out.println(e.getMessage());
		}
	
		
		
//		for(Product p:list )
//		{
//			System.out.println(p.price+" :"+p.id+" :"+p.name);
//		}
		
		long v=list.stream().count();
		//System.out.println(v/2);
		
		//list.stream().limit(20001).skip(20000).forEach((i)->System.out.println(i.id));
		//System.out.println(list.get(20000).id);
		
		
		
		 list.stream().sorted(new pricecomparator()).limit(1).
		 forEach((i)->{
		 System.out.println(i.id+" "+ i.name+" "+i.price);	
		 //4587941.57
		
		}
		);
		
	}

}


class Product
{
	int id;
	String name;
	double price;
	
	
	public Product(int id, String name, double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}

class pricecomparator implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		
		int i1=(int)o1.price;
		int i2=(int)o2.price;
		return i2-i1;
	}
	
}