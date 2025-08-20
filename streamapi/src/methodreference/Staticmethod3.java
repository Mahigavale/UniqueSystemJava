package methodreference;

public class Staticmethod3 {

	 public static String validatenumber(String number)
	 {
		 
		 if( number.length()==10)
		 {
			 return "please enter:";
		 }
		 return "chukicha number";
	 }
	public static void main(String[] args) {
		
		
		Validator<String,String> validate=Staticmethod3::validatenumber;
		
		System.out.println(validate.validate("123456789"));
	}
}

@FunctionalInterface
interface Validator<T,R> 
{
	public R  validate(T t);
}