package LambdaExpressionExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparator_Java8 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
		Collections.sort(names, (String a, String b) -> {
		    return a.compareTo(b);
		});
		
		System.out.println(names);
		names = Arrays.asList("peter", "anna", "mike", "xenia");
		Collections.sort(names, (a,b)-> a.compareTo(b));
		System.out.println(names);
	}

}
