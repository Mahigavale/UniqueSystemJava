package multi;

import java.util.function.Consumer;

public class Consumer2 {

	public static void main(String[] args) {

       
		Consumer<Integer> con1=(i)->{ System.out.println(i*2);};
		Consumer<Integer> con2=(i)->{ System.out.println(i*4);};
		

		 con1.andThen(con2).accept(40);
}

}