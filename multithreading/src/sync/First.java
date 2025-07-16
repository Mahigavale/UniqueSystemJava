package sync;

public class First {

	public static void main(String[] args) throws InterruptedException {
		
		
		Threadable thread=new Threadable();
		
		Threadable2 thread2=new Threadable2();
		Thread threadone=new Thread(thread);
		
		Thread threadtwo=new Thread(thread2);
		
		threadone.start();
		//threadone.join();
		threadtwo.start();
		//threadtwo.join();
		
		System.out.println("main executed....");
	}

}

class Threadable implements Runnable
{

	@Override
	public void run() {
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("custom thread executed......");
		
	}
	
}

class Threadable2 implements Runnable
{

	@Override
	public void run() {
		
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("custom thread executed......second");
		
	}
	
}