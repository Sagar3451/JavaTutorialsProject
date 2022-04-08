package collections.jv;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class TestStreams {

	public static void main(String[] args) {
		List<Integer>lst = Arrays.asList(1,3,4,34,2,34,42,56,55);
		
		double avg=lst.stream().mapToInt(e -> e).average().getAsDouble();
		
		System.out.println("Avrage of given numbers is - "+avg);
		
		

	}

}
