package logicbuilding;

public class Fifth {

	public static void main(String[] args) {
		
		
		int[][] arr=new int[3][3];
		int count =1;
		
		for(int i=0;i<arr.length;i++)
		{
			
		for(int j=0;j<arr[i].length;j++)
		{
			if(i==j)
			{
				arr[i][j]=4;
			}
			else {
			arr[i][j]=count;
			count++;
			}
		}
		}
		for(int i=0;i<arr.length;i++)
		{
			
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
		}

		
		int num=arr[0][0];
		boolean flag=true;
		for(int i=0;i<arr.length;i++)
		{
			
		for(int j=0;j<arr[i].length;j++)
		{
			if(i==j)
			{
				if(num==arr[i][j])
				{
				
					
				}
				else
				{ 
					flag=false;
					
				}
			}
			
		}
		
		}
		if( flag != true)
		{
			System.out.println("Not");
		}
		else
		{
			System.out.println("Diagonal");
		}
		
	}

}
