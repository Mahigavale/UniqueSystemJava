package sync;

import java.util.ArrayList;
import java.util.List;

public class Sixth {

	public static void main(String[] args) {

		
		Numbers numbers=new Numbers();
		
		Addthread add=new Addthread(numbers);
		
		Removethread remove=new Removethread(numbers);
		
		
		add.start();
		remove.start();
		
	
	}

}

class Numbers
{
	
	int count=1;
	List<Integer> list=new ArrayList<Integer>();
	
	public synchronized void addnumber() throws InterruptedException
	{
		if(list.size()==5)
		{
			System.out.println("size cannot be greater than five,please remover remove something..waiting");
			wait();
		}
		
		list.add(count);
		System.out.println("element added:"+count +"notifying remover");
		count++;
		 notify();
	}
	
	public synchronized void removenumber() throws InterruptedException
	{
		if(list.size()==0)
		{
			System.out.println("I have nothing.. please add something....waiting for adder");
			wait();
		}
		
		System.out.println("element removed:"+list.remove(0)+"notifying adder");
		notify();
	}
}

class Addthread extends Thread
{
	Numbers numbers;
	
	public Addthread(Numbers numbers)
	{
		this.numbers=numbers;
	}
	
	public void run()
	{
		while(true) {
		try {
			numbers.addnumber();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}

class Removethread extends Thread
{
	Numbers numbers;
	
	public Removethread(Numbers numbers)
	{
		 this.numbers=numbers;
		 
		
	}
	
	public void run()
	{
		while(true) {
		try {
			numbers.removenumber();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}