package sync;

public class volatiledemo {

	  volatile static boolean flag=false;
	
	 
	public static void main(String[] args) throws InterruptedException {
		
		Thread thread=new Thread() {
			
			public void run()
			{
				try {
					Thread.sleep(10);
					flag=true;
					System.out.println("set flag to the true..");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
         
		Thread thread2=new Thread()
				{
			  public void run()
			  
			  {
				 while(true) {
				  if(!flag)
				  {
					  while(!flag) {
						  
					  }
					  System.out.println("waiting for the flag to become the true");
					  
				  }
				  else
				  {
					  System.out.println("flag set to true..executing...");
					  break;
				  }
				 }
			  
			}};
				
				thread.start();
				thread2.start();
				
				thread.join();
				thread2.join();
	}

}
