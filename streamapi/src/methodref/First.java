package methodref;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class First {
	
	public static int square(int n)
	{
		System.out.println(n*n);
		return n*n;
	}
	
	public static String getname()
	{
		return "hello";
	}

	public static void main(String[] args) {
		
		Demo d=new Demo();
		Function<StringBuffer, StringBuffer> fun=StringBuffer::reverse ;
		
		
		System.out.println(fun.apply(new StringBuffer("ABC")));
		
		
		Consumer<Integer> con=First::square;
		
		con.accept(23);
		
		Supplier<String> sup=First::getname;
		System.out.println(sup.get());
		
		
	}

}
class Demo
{
	public  int square(int n)
	{
		return  n*n;
	}

}
