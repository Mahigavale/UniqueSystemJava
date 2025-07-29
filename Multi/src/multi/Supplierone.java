package multi;

import java.util.function.Supplier;

public class Supplierone {

	public static void main(String[] args) {
		
		
		Supplier<String> sup=()->(":10");
		
		Supplier<Double> random=()->(Math.random());
		
		int otp=(int)(random.get()*10000);
		if(otp<=999)
		{
			 otp=(int)(random.get()*10000);
		}
		System.out.println(otp);
	}

}
