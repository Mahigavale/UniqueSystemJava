package logicbuilding;

public class Ibmquestion {

	public static void main(String[] args) {
	
       Count count=new Count();
       System.out.println("Number of days required:"+count.countdays(4,2,2));
		
	}

}


class Count
{
	  public int countdays(int a, int b, int late)
	  {
		  
		  int alexq=a;
		  int peterq=b;
		  int johnq=a-b;
		  
		  int days=0;
		  if(peterq>=johnq)
		  {
			  return -1;
		  }
		  
		  
		   int sum_peter= late*b;
		   int john_sum=0;
		   int take_over=0;
		   
		   while(john_sum<=sum_peter)
		   {
			   john_sum=johnq+john_sum;
			   sum_peter=sum_peter+b;
			   take_over++;
		   }
		  
		   System.out.println("on the take overing day:Peter:"+sum_peter);
		   System.out.println("_______________________:John"+john_sum);
		  
		  return take_over;
	  }
}