package multi;

public class Volatiledemo {

	public static void main(String[] args) throws InterruptedException {
		
		count count=new count();
		
		Threadone one =new Threadone(count);
		Threadtwo two=new Threadtwo(count);
		
		one.start();
		two.start();
		
		one.join();
		two.join();

	}

}


class count
{
	 volatile int count=0;  
	
	public void increase()
	
	{
		count++;
	}
	
	public int getcount()
	{
		return this.count;
	}
}

class Threadone extends Thread
{
	count count;
	
	public Threadone(count count)
	{
		 this.count=count;
	}
	public void run()
	{
		try {
			Thread.sleep(1500);
			System.out.println("increasing the value....");
			for(int i=0;i<1500;i++)
			{
				count.increase();
			}
			System.out.println("increased value:"+count.getcount());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Threadtwo extends Thread
{
	count count;
	public Threadtwo(count count)
	{
		this.count=count;
	}
	
	public void run()
	{
		System.out.println("waiting to clear the conditon....");
		while(true)
		{
		if(count.getcount()>500)
		{
			System.out.println(" condition excecuted...");
			break;
		}
		}
	}
}