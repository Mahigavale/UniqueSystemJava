package multi;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Second {

	public static void main(String[] args)  {
		
		one One=new one("First");
		
		one Two=new one("Second");
		
		one Three=new one("Third");
		
		one Fourth=new one("Fourth");
		
		one Fifth=new one("fifth");
		
		
		
		
		Fifth.setPriority(10);
		
		
		
		
		ExecutorService pool=Executors.newFixedThreadPool(5);
		
		
		pool.execute(Three);
		pool.execute(One);
		pool.execute(Two);
		pool.execute(Fourth);
		pool.execute(Fifth);
		
		pool.shutdown();
		
	}

}

class one extends Thread
{
	String name;
	
	public one(String name)
	{
		this.name=name;
	}
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(650);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println(name+" :fnished!");
	}
}