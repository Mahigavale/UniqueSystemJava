package functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Fifth {
	
//	static  public StringBuffer change(char[] c)
//	{
//		for(int i=0;i<c.length;i++)
//		{
//			if(c[i]=='e')
//			{
//			  c[i]='E';	
//			}
//			else if(c[i]=='o')
//			{
//				c[i]='O';
//			}
//			else if(c[i]=='E')
//			{
//				 c[i]='e';
//			}
//			
//		}
//		StringBuffer buffer=new StringBuffer();
//		
//		for(char ch:c)
//		{
//			buffer.append(ch);
//		}
//		return buffer;
//	}

	public static void main(String[] args) {

		
		
		Function<StringBuffer,StringBuffer> fun=(ch)->{
			
			StringBuffer str=new StringBuffer(ch);
			
			char[] c=str.toString().toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='e')
			{
			  c[i]='E';	
			}
			else if(c[i]=='o')
			{
				c[i]='O';
			}
			else if(c[i]=='E')
			{
				 c[i]='e';
			}
			
		}
		StringBuffer buffer=new StringBuffer();
		
		for(char cha:c)
		{
			buffer.append(cha);
		}
		return buffer;
	};
	
	
	
	 //System.out.println(fun.apply(new StringBuffer("WElcome")));
	 
	 List<StringBuffer> list=new ArrayList<StringBuffer>();
	 
	 list.add(new StringBuffer("welcome"));
	 list.add(new StringBuffer("hii...eegfonde"));
	 
	 list.stream().map(fun).forEach((i)->{System.out.println(i);});
	 
	
	}
	
	

	}

