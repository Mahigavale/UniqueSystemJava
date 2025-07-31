package functions;

import java.util.ArrayList;
import java.util.List;

public class Third {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(123);
		list.add(111);
		list.add(100);
		list.stream().forEach((i) -> {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		});
	}

}
