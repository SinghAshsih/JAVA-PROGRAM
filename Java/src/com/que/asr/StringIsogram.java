package com.que.asr;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringIsogram {
//  input codedecode
//	output false
	// if true it is isogram
	private boolean check(String input) {
		boolean flag = true;
		char[] ch = input.toCharArray();
		Set<Character> chs = new HashSet<>();
		for (Character c : ch) {
			if (chs.contains(c)) {
				flag = false;
			} else {
				chs.add(c);
			}
		}

		return flag;
	}

	private boolean check2(String input) {
		boolean flag = true;
		char ch, chh;
		for (int i = 0; i < input.length(); i++) {
			ch = input.charAt(i);
			if (ch == ' ')
				continue;
			for (int j = i + 1; j < input.length() - 1; j++) {
				chh = input.charAt(j);
				if (ch == chh) {
					flag = false;
					break;
				}
			}
		}

		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input ");
		try {
			String input = sc.nextLine();
			StringIsogram sg = new StringIsogram();
			boolean result = sg.check2(input);
			System.out.println(result);
		} finally {
			sc.close();
			System.out.println("------------------------");
		}
	}
}
