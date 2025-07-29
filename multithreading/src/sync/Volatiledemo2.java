package sync;

public class Volatiledemo2 {

	public static void main(String[] args) {

		Are are=new Are();
		
		Are are2=new Are();
		
		are.id=23;
		are2.id=23;
		
		
		
		System.out.println(are.arr()==are2.arr());
		
		System.out.println(are2.str==are2.str);
	}

}

class Are
{
	int id;
	String str=new String("ABC");
	
	public String arr()
	{
		String str=new String("AB");
		
		return str;
	}
	

}