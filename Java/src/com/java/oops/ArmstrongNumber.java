package com.java.oops;

public class ArmstrongNumber {
	private int num;

	public ArmstrongNumber(int num) {
		this.num = num;
	}

	public boolean isArmstrong() {
		boolean flag = false;
		int temp = num;
		int arm = 0;
		while (temp > 0) {
			int digit = temp % 10;
			arm = (int) (Math.pow(digit, 3) + arm);
			temp /= 10;
		}
		if (arm == num) {
			flag = true;
		}
		return flag;

	}

}
