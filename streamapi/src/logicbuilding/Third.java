package logicbuilding;

public class Third {

	public static void main(String[] args) {
		
		String str="beautyepupcu";
		
		          //ebatuy
		         //ebatuyepupuc
		          //012345
		
		
		StringBuffer swar=new StringBuffer();
		
		StringBuffer vyanjane=new StringBuffer();
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == 'a' || str.charAt(i) == 'u' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o')
			{
				swar.append(str.charAt(i));
			}
			else
		{
				vyanjane.append(str.charAt(i));
			}
		}
		
		System.out.println(swar);
		System.out.println(vyanjane);
		
		StringBuilder str4=new StringBuilder();
		
		 for(int i=0;i<6;i++) {
		str4.append(swar.charAt(i));
		str4.append(vyanjane.charAt(i));
		 }
		System.out.println(str4);
		}
	}

