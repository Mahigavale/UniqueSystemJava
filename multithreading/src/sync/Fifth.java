package sync;

public class Fifth {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("**********CLASS LEVEL***********");
		
		Gold gold=new Gold();
		Gold gold2=new Gold();
		Gold gold3=new Gold();
		Gold gold4=new Gold();
		Gold gold5=new Gold();
		Gold gold6=new Gold();
		
		
		Goldthread thread=new Goldthread(gold);
		Goldthread thread2=new Goldthread(gold2);
		Goldthread thread3=new Goldthread(gold3);
		Goldthread thread4=new Goldthread(gold4);
		Goldthread thread5=new Goldthread(gold5);
		Goldthread thread6=new Goldthread(gold6);
		
		
		
		thread.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		
		 thread2.join();
		 thread.join();
		thread3.join();
		thread4.join();
		thread5.join();
		thread6.join();
		
		System.out.println(gold.getprice());
		System.out.println(gold6.getprice());
		System.out.println(gold==gold2);
		System.out.println(gold.price==gold2.price);

	}
}


class Gold
{
	static int price=100;
	
	public static  synchronized void increase()
	{
		price++;
	}
	
	public int getprice()
	{
		
		return this.price;
	}
}

class Goldthread extends Thread
{
	Gold gold;
	
	public Goldthread(Gold gold)
	{
		this.gold=gold;
	}
	
	public void run()
	{
		for(int i=0;i<100;i++) {
		gold.increase();
		}
	}
}