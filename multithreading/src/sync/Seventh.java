package sync;

import java.util.ArrayList;
import java.util.List;

public class Seventh {

	public static void main(String[] args) {
		
		Students student=new Students();

		
		addservice addthread=new addservice(student);
		removeservice removethread=new removeservice(student);
		
		addthread.start();
		removethread.start();
	}

}

class Students
{
	int roll_number=1;
	
	
	List<Integer>rollnumbers=new ArrayList();
	
	public synchronized void addstudent() throws InterruptedException
	{
		if(rollnumbers.size()==5)
		{
			System.out.println("SOS********SOS******SIZE 5... ENTERING WAITING STAGE");
			wait();
		}
		
		rollnumbers.add(roll_number);
		System.out.println("element added:"+roll_number+" notifying remover.....");
		roll_number++;
		notify();
	}
	
	public synchronized void removestudent() throws InterruptedException
	{
		if(rollnumbers.size()==0)
		{
			System.out.println("SOS************Help me .... reaching 0...entering waiting stage");
			wait();
		}
		
		System.out.println("removing element:"+rollnumbers.remove(0)+" notifying adder.....");
		notify();
		
	}
}

class addservice extends Thread
{
	
	Students student;

	public addservice(Students student)
	{
	  this.student=student;	
	}
	
	
	public void run()
	{
		while(true)
		{
		try {
			student.addstudent();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
}

class removeservice extends Thread
{
	Students student;
	
	public removeservice(Students student)
	{
		this.student=student;
	}
	
	public void run()
	{
		while(true)
		{
		try {
			Thread.sleep(1500);
			student.removestudent();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
