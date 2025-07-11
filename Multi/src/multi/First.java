package multi;

public class First {

	public static void main(String[] args) throws Exception {
		
		
		Thread first=new Firstthread(); //active=>runnable
		
		Thread second=new Secondthread();
		
		Thread three= new Thirdthread();
		
		
		three.setPriority(10);
		
		
		first.start();
		second.start();
		three.start();
		
		
		
		
		
		
	
		
		
		
		
	}

}


class Firstthread extends Thread{
	
	@Override
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("thread one"+i);
			System.out.println();
			try {
				Thread.sleep(650);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

class Secondthread extends Thread{
	
	
	public void run()
	{
		for(int i=100;i<110;i++)
		{
			System.out.println("thread two"+i);
			System.out.println();
			
			try {
				Thread.sleep(650);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Thirdthread extends Thread
{
	
	
	public void run()
	{
		
		for(int i=1000;i<1010;i++)
		{
			System.out.println( "thread three"+i);
			try {
				Thread.sleep(650);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println();
		}
	}
}
