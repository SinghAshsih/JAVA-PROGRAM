package program.int007.java;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicateElementAnArray {
	public static void main(String[] args) {
		String[] str = { "Ashish", "Aman", "Abhay", "Prince", "Isha", "Deeksha", "Ashish", "Aman" };
		Set<String> set = new LinkedHashSet<>();
		for (int i = 0; i < str.length; i++) {
			if (!set.contains(str[i])) {
				set.add(str[i]);
			} else {
				System.out.println("Duplicate element " + str[i]);
			}
		}
	}
}
