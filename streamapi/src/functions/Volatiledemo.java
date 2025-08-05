package functions;

public class Volatiledemo {

	public static void main(String[] args) {
		
		Counter counter=new Counter();
		
		Threadwrite write=new Threadwrite(counter);
		Threadread read=new Threadread(counter);
		
		
		write.start();
		read.start();

	}

}


class Counter
{
	volatile int count=1;
	
	
	public void increase()
	{
		count++;
	}
	
	public int getcount()
	{
		return this.count;
	}
}

class Threadwrite extends Thread
{
	
	Counter counter;
	public Threadwrite(Counter count)
	{
		
		this.counter=count;
	}
	
	public void run()
	{
		try {
			Thread.sleep(1500);
			System.out.println("I have started to increament the value....");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<1000;i++)
			
		{
			counter.increase();
		}
	}
	
}

class Threadread extends Thread
{
	
	Counter counter;
	public Threadread(Counter count)
	{
		this.counter=count;
	}
	
	
	public void run()
	{
		
		System.out.println("I am waiting for the condition to be true..");
		while(true) {
		
		
		if(counter.getcount()>200)
				{
			 System.out.println("Condition passed...");
			 break;
				}
		}
	}
}