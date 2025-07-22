package multi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumerimpl {

	public static void main(String[] args) {

		 List<String> list= new ArrayList<String>();
		 
		 list.add("MumBai");
		 list.add("laTUR");
		 list.add("puNE");
		 Consumerextends cee=new Consumerextends();
		cee.accept(list);
		

	}
}

class Consumerextends implements Consumer<List<String>> {

	@Override
	public void accept(List<String> t) {

		for (String i : t)
		{
			System.out.println(i.toUpperCase());
		}
	}

}






//List<String> list= new ArrayList<String>();
//
//list.add("MumBai");
//list.add("laTUR");
//list.add("puNE");
//Consumer<List<String>> cee =(variable)->{
//	for(String str:variable)
//	{
//		System.out.println(str.toUpperCase());
//	}
//};
//cee.accept(list);