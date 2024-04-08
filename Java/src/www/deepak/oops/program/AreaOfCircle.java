package www.deepak.oops.program;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		System.out.println("Enter the radius of circle  ");
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double areaOfCircle = Math.PI * (r * r);
		System.out.println(areaOfCircle);
	}
}
