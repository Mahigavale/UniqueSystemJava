package logicbuilding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Second {

	public static void main(String[] args) {
		
		List<Order> orders=Arrays.asList(new Order(1,567.89,"Watch"),
				new Order(2,5493.56,"Washing ,machine"),
				new Order(3,99999.045,"Iphone")
				, new Order(4,12123.56,"Iphone")
				);
		
		
		
		System.out.println(orders.stream().sorted().map((i)->(i)).collect(Collectors.groupingBy((i)->(i.item))));
	}

}

class Order implements Comparable<Order>
{
	int id;
	double price;
	String item;
	
	public Order(int id, double price, String item)
	{
		this.id=id;
		this.price=price;
		this.item=item;
	}

	@Override
	public int compareTo(Order o) {
		return (int)o.price-(int)this.price;
	}
	
}
