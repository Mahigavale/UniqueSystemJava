package sync;

public class Fourth {

	public static void main(String[] args) throws InterruptedException {
	

		Runs runs=new Runs();
		Runs run2=new Runs();
		
		PlayerThread first=new PlayerThread(runs);
		
		PlayerThread second=new PlayerThread(run2);
		
		SecondThreadable third=new SecondThreadable(run2);
		
		first.start();
		second.start();
		third.start();
		second.join();
		first.join();
		third.join();
		
	System.out.println(runs.getruns());
	System.out.println("second shared instance between diffenrent thread classes:"+run2.getruns());
	System.out.println("two threads on async block:"+run2.asynchruns());
	
	}

}


class Runs
{
	int run=1500;  
	
	int run2=2000;
	
	
	public  void addruns()
	{
		//synchronized(Runs.class) {
			
		synchronized(this) {
		//System.out.println(Thread.currentThread().getName()+"locking");
		run++;  //1501
		//System.out.println(Thread.currentThread().getName()+"releasing");
		}
		
		run2++;
		
		
	}
	
	public int getruns()
	{
		 return this.run;
	}
	public int asynchruns()
	{
		return this.run2;
	}
}


class PlayerThread extends Thread
{
	Runs runs;
	
	public PlayerThread(Runs runs)
	{
		this.runs=runs;
	}
	
	public void run()
	{
		for(int i=0;i<500;i++)
		{
			runs.addruns();
		}
	}
	
	
}

class SecondThreadable extends Thread
{
Runs runs;
	
	public SecondThreadable(Runs runs)
	{
		this.runs=runs;
	}
	
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			runs.addruns();
			
		}
	}
}