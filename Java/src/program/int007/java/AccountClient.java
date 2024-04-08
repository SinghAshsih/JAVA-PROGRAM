package program.int007.java;

import java.util.HashMap;
import java.util.Map;

@FunctionalInterface
interface Function {
	public void add(int a, int b);
}

public class AccountClient {

	public static void main(String[] args) {
		Account a1 = new Account(1, "Ashish");
		Account a2 = new Account(1, "Ashish");
		Account a3 = new Account(1, "Ashish");

		HashMap<Account, String> map = new HashMap<Account, String>();
		map.put(a1, "Student-1");
		map.put(a2, "Studnet-2");
		map.put(a3, "Student-3");
		for (Map.Entry<Account, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}

		System.out.println(map.get(a1));
	}
}
