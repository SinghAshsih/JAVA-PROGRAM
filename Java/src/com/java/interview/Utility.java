package com.java.interview;

import java.util.Arrays;
import java.util.Random;

public class Utility {
	static int vowelsCount = 0;
	static int consonantCount = 0;

	// Division
	public static int division(int a, int b) throws ArithmeticException {
		int division = a / b;
		return division;
	}

	// GreaterNumber
	public static void greaterNumber(int num1, int num2) {
		if (num1 > num2) {
			System.out.println("The Greater Number Is :->  " + num1);
		} else if (num1 == num2) {
			System.out.println("Numbers are equal");
		} else {
			System.out.println("The Greater Number Is :->  " + num2);
		}
	}

	// Message
	public static void message(String message) {
		System.out.println(message);
	}

	// Paliandrome
	public static void paliandrome(String input) {
		String reverse = "";
		for (int i = 0; i < input.length(); i++) {
			reverse = input.charAt(i) + reverse;
		}

		if (input.equalsIgnoreCase(reverse)) {
			System.out.println("This is paliandrome");
		} else {
			System.out.println("This is not in paliandrome");
		}
	}

	// Positive&Negative
	public static void positiveAndNegative(int num) {
		if (num > 0) {
			System.out.println("It Is Positive Number");
		} else if (num == 0) {
			System.out.println("It is Zero");
		} else {
			System.out.println("It Is Negative Number");
		}
	}

	// ReverseString
	public static String reverseString(String input) {
		String reverse = "";
		for (int i = 0; i < input.length(); i++) {
			reverse = input.charAt(i) + reverse;
		}
		return reverse;
	}

	// SimpleInterest
	public static void simpleInterest(double p, double r, double t) {
		double si = (p * r * t) / 100;
		System.out.println("Simple Interest Is :  " + si);
	}

	// Factorial
	// 5*4*3*2*1 !
	public static void factorial(int num) {
		int factorial = 1;
		for (int i = num; i >= 1; i--) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of " + num + " is " + factorial);

	}
//  The fabonacci series is :  
	// 0 1 1 2 3 5

	public static void fabonacciSeries(int num1) {
		int sum = 0;
		int a = 0;
		int b = 1;

		System.out.println("The fabonacci series is : ");
		System.out.print(a + " " + b + " ");
		// System.out.print(b); //
		for (int i = 2; i <= num1; i++) {
			sum = a + b;
			System.out.print(sum + " ");
			a = b;
			b = sum;

		}

	}

	// ExponentNumbers

	public static void exponentnumber(int num, int power) {
		double exponent = Math.pow(num, power);
		System.out.println(num + "^" + power + "  is " + exponent);

	}

	// Compound Interest
	public static void compountInterest(double principal, double rate, double time) {
		double temp = (1 + rate / 100);
		double amount = principal * Math.pow(temp, time);
		System.out.println("The amount is  " + amount);
		double ci = amount - principal;
		System.out.println("The compound interest is  " + ci);

	}

	// Sum of digits of a number

	public static int sumOfDigits(int num) {
		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			sum += digit;
			num /= 10;
		}
		return sum;
	}

	// Reverse Number

	public static int reverse(int num) {
		int reverse = 0;
		while (num > 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num /= 10;
		}
		return reverse;

	}

	// Paliandrome Number

	public static void paliandromeNumber(int num) {
		int reverse = Utility.reverse(num);
		if (reverse == num) {
			System.out.println("This is paliandrome number");
		} else {
			System.out.println("This is not paliandrome number");
		}

	}

	// prime number check

	public static void checkPrimeNumber(int num) {
		int count = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0)
				count++;
		}
		if (count == 2) {
			System.out.println("This is prime number ");
		} else {
			System.out.println("This is not prime number ");
		}

	}

	// All possible prime numbers
	public static void allPossiblePrimeNumber(int num) {
		int i, j;
		int count = 0;
		for (i = 2; i <= num; i++) {
			count = 0;
			for (j = 1; j <= i; j++) {
				if (i % j == 0)
					count++;
			}
			if (count == 2) {
				System.out.print(i + " ");
			}
		}

	}

	// Check armstrong number

	public static void checkArmstrongNumber(int num) {
		int temp = num;
		double sum = 0;
		while (temp > 0) {
			int digit = temp % 10;
			sum = sum + Math.pow(digit, 3);
			temp /= 10;
		}
		if (sum == num) {
			System.out.println("Yes this is armstrong number");
		} else {
			System.out.println("No this is not armstrong number ");
		}

	}

	// Possible armstrong numbers of a given numbers

	public static void possibleArmstrongNumber(int num) {
		System.out.println("The possible armstrong number are as follows :");
		for (int i = 1; i <= num; i++) {
			int temp = i;
			double sum = 0;
			while (temp > 0) {
				int digit = temp % 10;
				sum = sum + Math.pow(digit, 3);
				temp /= 10;
			}
			if (sum == i) {
				System.out.print(i + " ");
			}
		}

	}

	// Greatest common division (HCF)

	public static void greatestCommonDivision(int num1, int num2) {

		int temp = 0;
		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				temp = i;
			}
		}
		System.out.println("HCF of " + num1 + " and " + num2 + " is  " + temp);

	}

	// check leap year
	public static void checkLeapYear(int year) {
		if (year % 100 == 0) {
			if (year % 400 == 0) {
				System.out.println("This is leap year");
			} else {
				System.out.println("Not a leap year ");
			}
		} else {
			if (year % 4 == 0) {
				System.out.println("This is leap year");
			} else {
				System.out.println("Not a leap year");
			}
		}

	}

	// Random Number Genersator
	public static void randomNumber() {
		Random random = new Random();
		int random1 = random.nextInt();
		System.out.println("Random number1 :  " + random1);
		double random2 = random.nextDouble();
		System.out.println("Random Number2 :  " + random2);

	}

	// Perfect number program
	public static void perfectNumber(int num) {
		int perfect = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				perfect = perfect + i;
			}
		}
		if (perfect == num) {
			System.out.println(num + " is a perfect number .");
		} else {
			System.out.println(num + " not a perfect number .");
		}
	}

	// Strong Number
	// 1, 2, 145, and 40585
	public static void strongNumber(int num) {
		int sum = 0;
		int temp = num;
		int factorial = 1;
		while (temp > 0) {
			int digit = temp % 10;
			factorial = 1;
			for (int i = digit; i >= 1; i--) {
				factorial = factorial * i;
			}
			sum = sum + factorial;
			temp /= 10;
		}
		if (num == sum) {
			System.out.println(num + " is a strong number ");
		} else {
			System.out.println(num + " not a strong number ");
		}

	}

	// Happy number
	public static void happyNumber(int num) {
		int sum = 0;
		int temp = num;
		while (num > 0) {
			int digit = num % 10;
			sum = (int) (sum + Math.pow(digit, 2));
			num /= 10;
		}
		int try1 = Utility.sumOfDigits(sum);
		int try2 = Utility.sumOfDigits(try1);
		if (try2 == 1) {
			System.out.println(temp + " is a happy number .");
		} else {
			System.out.println(temp + " is not a happy number .");
		}
	}

	// Neon Number Program
	public static void neonNumber(int num) {
		int square = (int) Math.pow(num, 2);
		int sum = Utility.sumOfDigits(square);
		if (sum == num) {
			System.out.println(num + " is a neon number .");
		} else {
			System.out.println(num + " is not a neon number .");
		}
	}

	// Matrix Multiplication
	public static void matrixMultiplication(int[][] matrix1, int[][] matrix2) {
		int[][] product = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				product[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					product[i][j] = matrix1[i][k] * matrix2[k][j];
				}
				System.out.print(product[i][j] + " ");
			}
			System.out.println("  ");
		}

	}

	// Count vowels & consonant
	public static void count(String input) {
		int vowelsCount = 0;
		int consonantCount = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == ' ') {
				continue;
			} else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelsCount++;
			} else {
				consonantCount++;
			}
		}
		System.out.println("No. of vowels is " + vowelsCount);
		System.out.println("No. of conosant is " + consonantCount);

	}

	// count part 2

	public static void countBySwitch(String input) {

		// char v;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == ' ')
				continue;
			vowelsConsonatCounter(ch);
		}
		System.out.println("No. of vowels is " + vowelsCount);
		System.out.println("No. of conosant is " + consonantCount);

	}

	private static void vowelsConsonatCounter(char ch) {
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			vowelsCount++;
			break;
		default:
			consonantCount++;

		}

	}

	// Linear Search program

	public static int linearSearch(int[] arr, int n, int x) {
		for (int i = 0; i < n; i++) {
			if (arr[i] == x)
				return i;

		}
		return -1;
	}

	// Largest Element in an array
	public static void largestElementArray(int[] num) {
		// Approach 1
		// 12, 45, 76, 56, 98, 96, 43, 35, 1, 5, 6, 9
		int largest = 0;
		for (int i : num) {
			if (i > largest) {
				largest = i;
			}
		}
		System.out.println("Largest element in an array is " + largest);
		// Approach 2

		Arrays.sort(num);
		System.out.println("Largest element in an array is " + num[num.length - 1]);

	}

	// Matrix addition
	public static void matrixAddition(int[][] arr1, int[][] arr2) {
		int[][] sum = new int[2][3];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				sum[i][j] = arr1[i][j] + arr2[i][j];
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}

	}

	// Bubble Sort
	public static void bubbleSort(int[] arr) {
		System.out.println("Before sorting");
		for (int temp : arr) {
			System.out.print(temp + " ");
		}

		System.out.println("\n" + "After sorting");
		int n = arr.length;
		int local = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				if (arr[j - 1] > arr[j]) {
					local = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = local;
				}
			}
		}
		for (int n1 : arr) {
			System.out.print(n1 + "  ");
		}

	}

	// Star Pattern
	public static void pattern(int input) {

	}

	// LCM lowest common multiple
	public static void lcm(int a, int b) {
		int local = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0 && b % i == 0) {
				local = i;
			}
		}
		int lcm = (a * b) / local;
		System.out.println("LCM of two numbers is " + lcm);

	}
}
