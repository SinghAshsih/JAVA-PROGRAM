package com.program.ashish;

import java.util.ArrayList;
import java.util.List;

public class Utility07 {

	public static boolean isAutomorphic(int num) {
		int temp = num;
		int digitCount = 0;
		while (temp > 0) {
			temp /= 10;
			digitCount++;
		}
		double square = Math.pow(num, 2);
		int lastDigti = 10;
		for (int i = 1; i < digitCount; i++) {
			lastDigti *= 10;
		}
		int auto = (int) (square % lastDigti);
		if (num == auto) {
			return true;
		} else {
			return false;
		}

	}

//------------------------------------------------------------------------
	public static int factorial(int num) {
		// TODO Auto-generated method stub
		if (num == 0) {
			return 1;
		}

		return num * factorial(num - 1);
	}
	// ---------------------------------------------------------------------

	public static int reverse(int num) {
		// TODO Auto-generated method stub
		int reverse = 0;
		while (num > 0) {
			int rem = num % 10;
			reverse = reverse * 10 + rem;
			num /= 10;
		}
		return reverse;
	}

	// ----------------------------------------------------------------------
	public static boolean isPeterson(int num) {
		// TODO Auto-generated method stub

		int temp = num;
		int sum = 0;
		while (temp > 0) {
			int digit = temp % 10;
			sum = sum + Utility07.factorial(digit);
			temp /= 10;
		}
		if (sum == num) {
			return true;

		} else {
			return false;
		}
	}

	/////////////////////////////////////////////////
	public static void sunnyNunmer(int num) {
		int sunnyNumber = num + 1;
		int d = (int) Math.sqrt(sunnyNumber);
		int square = (int) Math.pow(d, 2);
		if (square == sunnyNumber) {
			System.out.println("It is sunny number ->  true");
		} else {
			System.out.println("It is sunny number ->   false");
		}
	}

//-----------------------------------------------------------------------
	public static void techNumber(int num) {
		int digitCount = 0;
		int temp = num;
		while (temp > 0) {
			temp /= 10;
			digitCount++;
		}

		if (digitCount % 2 == 0) {
			int firstHalf = (int) (num % Math.pow(10, digitCount / 2));
			int secondHalf = (int) (num / Math.pow(10, digitCount / 2));
			int sum = firstHalf + secondHalf;
			if (sum * sum == num) {
				System.out.println("TechNumber");
			} else {
				System.out.println("NotTechNumber");
			}

		} else {
			System.out.println("The given number is not tech number or it can not be split it into two parts");
		}
	}

	public static void facitatingNumber(int num) {
		// TODO Auto-generated method stub
		int productWith2 = num * 2;
		int productWith3 = num * 3;
		String result = "" + num + productWith2 + productWith3;
		int count = 0;
		if (result.length() >= 9) {
			for (int i = 0; i < result.length(); i++) {
				char ch = result.charAt(i);
				if (ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8'
						|| ch == '9') {
					count++;
				}
			}
			if (count == 9) {
				System.out.println("Facinating Number");
			} else {
				System.out.println("Not Facinating Number");
			}

		} else {
			System.out.println("NotFacinatingNumber");
		}
	}

	public static void kethNumber(int num) {
		// TODO Auto-generated method stub
		int digitCount = 0;
		int temp = num;
		int temp2 = num;
		while (temp > 0) {
			temp /= 10;
			digitCount++;
		}
		int[] keth = new int[digitCount];
		for (int i = keth.length - 1; i >= 0; i--) {
			keth[i] = temp2 % 10;
			temp2 /= 10;
		}
		int sum = 0;
		int temp3 = 0;
		int var1 = keth[keth.length - 2];
		int var2 = keth[keth.length - 1];
		for (int i = 0; i < keth.length; i++) {
			temp3 = temp3 + keth[i];
		}
		// 7, 4, 2, 13, 19, 34, 66, 119, 219, 404, 742
		int temp4 = temp3;
		while (sum < num) {
			sum = var1 + var2 + temp3;
			var1 = var2;
			var2 = temp3;
			temp3 = sum;

		}
		System.out.println(temp3);
		if (sum == num) {
			System.out.println("Keth Numbers ");
		} else {
			System.out.println("Not Keth Numbers ");
		}
	}

//------------------------------------------------------------------------------------
	public static int sumOfDigits(int num) {
		// TODO Auto-generated method stub
		int sum = 0;
		while (num > 0) {
			int lastDigit = num % 10;
			sum = sum + lastDigit;
			num /= 10;
		}
		return sum;

	}

//-------------------------------------------------------------------------------------
	public static void neonNumber(int num) {
		// TODO Auto-generated method stub
		int square = (int) Math.pow(num, 2);
		int sum = Utility07.sumOfDigits(square);
		if (sum == num) {
			System.out.println("Neon Number");
		} else {
			System.out.println("Not neon number");
		}
	}

	public static int productOfDigits(int num) {
		// TODO Auto-generated method stub
		int product = 1;
		while (num > 0) {
			int lastDigit = num % 10;
			product = product * lastDigit;
			num /= 10;
		}
		return product;
	}

	public static void spyNumber(int num) {
		// TODO Auto-generated method stub
		int sum = Utility07.sumOfDigits(num);
		int product = Utility07.productOfDigits(num);
		if (sum == product) {
			System.out.println("SPY NUMBER");
		} else {
			System.out.println("NOT SPY NUMBER");
		}
	}

//------------------------------------------------------------------------------------------------
	public static boolean isPrimeNumber(int num) {
		// TODO Auto-generated method stub
		boolean flag = false;
		if (num == 1) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = true;
			}
		}
		if (!flag) {
			return true;
		} else {
			return false;
		}

	}

//------------------------------------------------------------------------------
	public static void emirpNumber(int num) {
		// TODO Auto-generated method stub
		boolean isPrimeCheck = Utility07.isPrimeNumber(num);
		int reverse = Utility07.reverse(num);
		boolean isPrimeCheckReverse = Utility07.isPrimeNumber(reverse);
		if (isPrimeCheck && isPrimeCheckReverse == true) {
			System.out.println("EmirpNumber");
		} else {
			System.out.println("Not EmripNumber");
		}

	}

	public static void nthPrimeNumber(int position) {
		// TODO Auto-generated method stub
		int primeNumber = 2;
		if (position == 1) {
			System.out.println("Prime number is " + primeNumber);
		}
		int count = 1;

		while (count < position) {
			primeNumber++;
			if (Utility07.isPrimeNumber(primeNumber)) {
				count++;
			}
			if (count == position) {
				System.out.println("Prime number is " + primeNumber);
			}

		}

	}

	public static void nthPrimeNumber2(int position) {
		// TODO Auto-generated method stub
		int count = 0;
		// int counter = 0;
		int max = Integer.MAX_VALUE;
		for (int i = 1; i < max; i++) {
			boolean result = Utility07.isPrimeNumber(i);
			if (result == true) {
				count++;
			}
			if (count == position) {
				System.out.println("Prime number is " + i);
				System.exit(0);
			}
		}

	}

	public static void SumOfNumbers(int limit) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i <= limit; i++) {
			sum = sum + i;
		}
		System.out.println("Sum Of natural numbers is " + sum);

	}

	public static void odd(int limit) {
		// TODO Auto-generated method stub
		System.out.println("Odd numbers are as follows");
		for (int i = 1; i <= limit; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}

	}

	public static void even(int limit) {
		// TODO Auto-generated method stub
		System.out.println("Even numbers are as follows");
		for (int i = 1; i <= limit; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}

		}

	}

	public static void isPerfectSquare(int num) {
		// TODO Auto-generated method stub
		int temp = (int) Math.sqrt(num);
		int square = temp * temp;
		if (num == square) {
			System.out.println("Yes it is perfect square numbre");
		} else {
			System.out.println("No it is not perfect square number");
		}

	}

	public static void positiveNumberCheck(int n) {
		// TODO Auto-generated method stub
		if (n < 0) {
			System.out.println("Negative number");
		} else if (n == 0) {
			System.out.println("Neither positive nor negative");
		} else {
			System.out.println("Positive number");
		}

	}

	public static void checkSmallest(int num1, int num2, int num3) {
		// TODO Auto-generated method stub
		int temp = (num1 < num2) ? num1 : num2;
		int result = num3 < temp ? num3 : temp;
		System.out.println("Smallest number is " + result);

	}

	public static void sqrt(int num) {
		// TODO Auto-generated method stub

		double temp;
		double squreRoot = num / 2;
		do {
			temp = squreRoot;
			squreRoot = (temp + (num / temp)) / 2;
		} while ((temp - squreRoot) != 0);
		System.out.println("Square root of a number is " + squreRoot);

	}

	public static int hcf(int[] num) {
		// TODO Auto-generated method stub
		System.out.println();
		int hcf = num[0];
		for (int i = 1; i < num.length; i++) {
			hcf = findHCF(hcf, num[i]);
		}
		return hcf;
	}

	private static int findHCF(int num1, int num2) {
		// TODO Auto-generated method
		while (num2 > 0) {
			int temp = num2;
			num2 = num1 % num2;
			num1 = temp;
		}

		return num1;
	}

	public static void dislpayAlternativePrimeNumber(int limit) {
		// TODO Auto-generated method stub
		System.out.println("The alternative prime number are as follows : ");
		byte alternative = 0;
		for (int i = 1; i <= limit; i++) {
			boolean result = Utility07.isPrimeNumber(i);
			if (result == true && alternative % 2 == 0) {
				System.out.print(i + " ");
			}
			if (result == true) {
				alternative++;
			}

		}

	}

	public static void isKrishnamurthyNumber(int num) {
		// TODO Auto-generated method stub
		int sum = 0;
		int temp = num;
		while (temp > 0) {
			int last = temp % 10;
			int fac = Utility07.factorial(last);
			sum = sum + fac;
			temp /= 10;
		}
		if (sum == num) {
			System.out.println("Yes , it is krishnamurthy number ");
		} else {
			System.out.println("No , it is not krishnamurthy number ");
		}

	}

	public static void isBouncyNumber(int num) {
		// TODO Auto-generated method stub
		boolean result1 = isIncresing(num);
		boolean result2 = isDecreasing(num);
		if (result1 == false && result2 == false) {
			System.out.println("Bouncy number");
		} else {
			System.out.println("Not bouncy number ");
		}

	}

	private static boolean isIncresing(int num) {
		// TODO Auto-generated method stub
		boolean flag = false;
		String temp = Integer.toString(num);
		for (int i = 0; i < temp.length() - 1; i++) {
			char ch = temp.charAt(i);
			if (ch < temp.charAt(i + 1)) {
				flag = true;
			} else {
				flag = false;
				break;
			}
		}
		return flag;

	}

	private static boolean isDecreasing(int num) {
		// TODO Auto-generated method stub
		boolean flag = false;
		String temp = Integer.toString(num);
		for (int i = 0; i < temp.length() - 1; i++) {
			char ch = temp.charAt(i);
			if (ch >= temp.charAt(i + 1)) {
				flag = true;
			} else {
				flag = false;
				break;
			}
		}
		return flag;

	}

	public static void IsJokeNumber(int num) {
		// TODO Auto-generated method stub
		int sumOfDigits = Utility07.sumOfDigits(num);
		List<Integer> list = Utility07.factors(num);
		int sumOfFactors = 0;
		for (int i : list) {
			int temp = Utility07.sumOfDigits(i);
			sumOfFactors = sumOfFactors + temp;
		}
		if (sumOfDigits == sumOfFactors) {
			System.out.println("Its a joke number");
		} else {
			System.out.println("Not a joke number");
		}

	}

	public static List<Integer> factors(int num) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		int temp = num;
		for (int i = 2; i <= num;) {
			if (temp % i == 0) {
				list.add(i);
				temp /= i;
			} else {
				i++;
			}
		}
		return list;
	}

	public static void isStrontioNumber(int num) {
		// TODO Auto-generated method stub
		int result = num * 2;
		int lastThreeDigit = (result % 1000) / 10;
		int tens = lastThreeDigit % 10;
		int hundredth = lastThreeDigit / 10;
		if (tens == hundredth) {
			System.out.println("It is strontio number ");
		} else {
			System.out.println("No it is not strontio number ");
		}

	}

	public static void isXylemAndPhloem(int num) {
		// TODO Auto-generated method stub
		num = Math.abs(num);
		int temp = num;
		int extreme_sum = 0, mean_sum = 0;

		while (temp != 0) {
			if (temp == num || temp < 10) {
				extreme_sum = extreme_sum + temp % 10;
			} else {
				mean_sum = mean_sum + temp % 10;

			}
			temp = temp / 10;
		}
		System.out.println("The sum of extreme digits: " + extreme_sum);
		System.out.println("The sum of mean digits: " + mean_sum);
		if (extreme_sum == mean_sum) {
			System.out.println("Xylem Number ");
		} else {
			System.out.println("Pholem Number");
		}

	}

	public static void isMysteryNumber(int num) {
		// TODO Auto-generated method stub
		int n = 0, i;
		int sum = 0;
		for (i = 1; i <= num / 2; i++) {
			n = Utility07.reverse(i);
			sum = i + n;
			if (sum == num) {
				break;
			}
		}
		if (sum == num) {
			System.out.println(i + " " + n);
			System.out.println("Mystery Number");
		} else {
			System.out.println("Not Mystery Number");
		}

	}

	public static void swapUsingBitwise(int a, int b) {
		// TODO Auto-generated method stub
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After swapping ");
		System.out.println(a + " " + b);

	}

	public static void isEvilNumber(int num) {
		// TODO Auto-generated method stub
		int count = 0;
		while (num > 0) {
			int rem = num % 2;
			if (rem == 1) {
				count++;
			}
			num /= 2;
		}
		if (count % 2 == 0) {
			System.out.println("Evil Number ");
		} else {
			System.out.println("Odious number ");
		}
	}

	public static void checkISBN(long num) {
		// TODO Auto-generated method stub
		byte count = 1;
		int sum = 0;
		while (num > 0) {
			int rem = (int) (num % 10);
			sum = sum + rem * count;
			count++;
			num /= 10;
		}
		System.out.println(sum);
		if (sum % 11 == 0) {
			System.out.println("ISBN");
		} else {
			System.out.println("Not ISBN");
		}
	}

	public static void isDuckNumber(int num) {
		// TODO Auto-generated method stub
		boolean flag = false;
		while (num > 0) {
			int last = num % 10;
			if (last == 0) {
				flag = true;
				break;
			}
			num /= 10;
		}
		if (flag == true) {
			System.out.println("Duck Number ");
		} else {
			System.out.println("Not Duck Number ");
		}

	}

	public static void isBuzz(int num) {
		// TODO Auto-generated method stub
		int last = num % 10;
		if (num % 7 == 0 || last == 7) {
			System.out.println("Buzz Number ");
		} else {
			System.out.println("Not Buzz Number");
		}

	}

	public static void isSphenicNumber(int num) {
		// TODO Auto-generated method stub
		List<Integer> listOfFactors = factorss(num);
		System.out.println("Number of factors are as follows : ");
		System.out.print(listOfFactors.toString() + " ");

	}

	private static List<Integer> factorss(int num) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				list.add(i);
			}
		}
		return list;
	}
}
