package sync;

public class Two {
	public static void main(String[] args) throws InterruptedException {
		
		Counter counter=new Counter();
	
		
		Threadone one=new Threadone(counter);
		Threadone two=new Threadone(counter);
		
		one.start();
		two.start();
		one.join();
		two.join();
		
		
		counter.getcount();
		
		
	}
	
}

class Counter
{
	int count=1;
	
	public  void increment()
	{
		count++;
	}
	
	public void getcount()
	{
		System.out.println(this.count);
	}
}


class Threadone extends Thread
{
	Counter count;
	
	public Threadone(Counter count2)
	{
		this.count=count2;
	}
	
	
	public void run()
	{
		
		for(int i=0;i<500;i++) {
			
		count.increment();
		}
	}
	
}