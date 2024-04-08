package com.program.ashish.numbers.programme;

import java.util.Scanner;

public class ATM_Machine {
	public static void main(String[] args) {
		int balance = 1000, withdraw, deposite;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println();
			System.out.println("Automated Teller Machine");
			System.out.println("Choose 1 for Withdraw");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 for Check Balance");
			System.out.println("Choose 4 for EXIT");
			System.out.print("Choose the operation you want to perform:");

			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the money to withdraw");
				withdraw = sc.nextInt();
				if (balance >= withdraw) {
					// remove the withdrawl amount from the total balance
					balance = balance - withdraw;
					System.out.println("Please collect your money");
				} else {
					// show custom error message
					System.out.println("Insufficient Balance");
				}
				System.out.println("");
				break;
			case 2:
				System.out.println("Enter the money to deposited");
				deposite = sc.nextInt();
				balance = balance + deposite;
				System.out.println("Your Money has been successfully depsited");
				System.out.println("");
				break;

			case 3:
				System.out.println("Balance : " + balance);
				System.out.println("");
				break;
			case 4:
				System.out.println("Thank you visit again");
				System.exit(0);
				
			}
		}

	}
}
