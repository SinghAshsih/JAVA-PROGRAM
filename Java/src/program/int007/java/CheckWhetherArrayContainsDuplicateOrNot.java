package program.int007.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckWhetherArrayContainsDuplicateOrNot {
	public static void main(String[] args) {
		String[] str = new String[] { "Ashish", "Aman", "Ajay", "Avifal", "saral", "Ajay" };
		List<String> list = Arrays.asList(str);
		Set<String> set = new HashSet<>(list);
		if (list.size() != set.size()) {
			System.out.println("This string contains dublictate");
		} else {
			System.out.println("No dublicate element found ");
		}

	}
}
