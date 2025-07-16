package sync;

public class Third {

	public static void main(String[] args) throws InterruptedException {
		
//		Distance distance=new Distance();
//		
//		distance.increase();
//		distance.increase();
//		distance.increase();
//	
//		distance.printkm();
		
		
	
		Distance  distance =new Distance();
		//km=>100;
		
		Distance distance2=new Distance();
		
		Thread_1 one=new Thread_1(distance);
		
		Thread_1 two=new Thread_1(distance);
		
		Thread_1 three=new Thread_1(distance);
		
		one.start();
		two.start();
		three.start();
		two.join();
		one.join();
		
		
		
		System.out.println(distance.kilometers);
		//System.out.println(distance2.kilometers);
		
	}

}

class Distance
{
	int kilometers=100;
	
	public  synchronized void increase()
	{
		System.out.println(Thread.currentThread().getName()+"acquiring lock...");
		kilometers++;
		System.out.println(Thread.currentThread().getName()+"releasing lock...");
	}
	
	public void printkm()
	{
		System.out.println(kilometers);
	}
	
}

class Thread_1 extends Thread
{   
	
	
	
	Distance  distance;

	public Thread_1(Distance distance)
	{
		this.distance=distance;
	}
	
	
	public void run()
	{
		
		for(int i=0;i<5;i++)
		{
		    distance.increase();

		}
	}
}