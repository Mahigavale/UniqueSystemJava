package demo;

public class First {

	public static void main(String[] args) {
	
		
		int[] numbers=new int[4];
		
		        numbers[0]=23;
				numbers[1]=67;
				numbers[2]=41;
				numbers[3]=13;
				
				
				int num=0;
				int num2=0;
				
				for(int i=0;i<numbers.length;i++)
				{
					 if (numbers[i] > num) {
			                // Update second largest before updating the largest
			                num2 = num;
			                num = numbers[i];
				}
				}
				System.out.println(num2);
}
}
