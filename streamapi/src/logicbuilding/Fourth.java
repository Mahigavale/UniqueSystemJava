package logicbuilding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fourth {

	public static void main(String[] args) {
		
		//[8,4,5,3,2,1,6,9]
		
		int[] arr= {13,12,18,19,16,17,20};
		
		Arrays.sort(arr);
		
		 List<Integer> nums=new ArrayList<Integer>();
		 
		 List<Integer> missing=new ArrayList<Integer>();
		 
		 for(int i:arr)
		 {
			 nums.add(i);
		 }
		
		
              int num=arr[0];
              
              for(int i=0;i<arr.length;i++)
              {
            	  num++;
            	  if(nums.contains(num))
            	  {
            		  continue;
            	  }
            	  else
            	  {
            		 missing.add(num);
            	  }
              }
              System.out.println(missing);
	}

}
