package Collection;

import java.util.ArrayList;
import java.util.List;

public class class1 {
	public static void main(String[] args) {
		
		
		List<Integer> rank = new ArrayList<>();
		
		rank.add(1);
		rank.add(5);
		rank.add(15);
		rank.add(25);
		rank.add(30);
		rank.add(45);
		rank.add(55);
		
		System.out.println(rank);
		
		rank.remove(2);
		
		System.out.println(rank.size());
		
		System.out.println(rank.get(5));
		
		System.out.println(rank.set(1, 3));
		
		System.out.println(rank.add(65));
		
		System.out.println(rank);
		
		System.out.println(rank.isEmpty());
		
		
		
	}

}
