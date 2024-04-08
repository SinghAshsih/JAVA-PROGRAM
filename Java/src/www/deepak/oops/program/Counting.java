package www.deepak.oops.program;

import java.util.Scanner;

public class Counting {
	public static void main(String[] args) {
		int n;
		Scanner r = new Scanner(System.in);
		System.out.println("Enter the input");
		n = r.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print(i);
			if (i < 10) {
				System.out.print('\t' + ",");
			}
		}

	}
}
