package sync;

public class Volatiledemo3 {
	 
	public static void main(String[] args) throws InterruptedException {
		
		
		Demo3 demo2=new Demo3();
		
		Thread34 t34=new Thread34(demo2);
		
		Thread35 t35=new Thread35(demo2);
		
		t34.start();
		t35.start();
		
		
		t34.join();
		t35.join();
		
			    	
			    		
	}
}
 
class Demo3
{
	  int num=10;
	
	public void increase()
	{
		num++;
	}
	
	public int  getint()
	{
		return num;
	}

}

class Thread34 extends Thread
{
	Demo3 demo;
	public Thread34( Demo3 demo) {
		this.demo=demo;
	}
	public void run()
	{
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<300;i++) {
		demo.increase();
		}
	}
}

class Thread35 extends Thread
{
	Demo3 demo;
	
	public Thread35(Demo3 demo)
	{
		this.demo=demo;
	}
	
	
	public void run()
	{
		while(true)	
		{
			System.out.println("condition started....");
			while(demo.getint()<250)
			{
				// System.out.println("the condition is not yet fullfilled....");
			}
			if(demo.getint()<250)
			{
				
				System.out.println("waiting for the condition to get executed.....");
			}
			
			else
			{
				System.out.println("the condition is passed.... the code executed...");
				break;
			}
	    }
	}
}