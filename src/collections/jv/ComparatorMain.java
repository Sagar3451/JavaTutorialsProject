package collections.jv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorMain {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(234);
		al.add(437);
		al.add(156);
		al.add(389);
		al.add(761);
		al.add(570);
		
		Comparator<Integer> ci= new ComparatorImple();
		
		Collections.sort(al, ci);
		
		al.forEach(System.out::println);

	}

}
