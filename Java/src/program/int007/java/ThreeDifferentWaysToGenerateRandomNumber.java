package program.int007.java;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ThreeDifferentWaysToGenerateRandomNumber {
// Math.random();
	// ThreadLocalRandomClass
	// java.util.random.class
	public static void main(String[] args) {
		System.out.println(Math.random());
		System.out.println(ThreadLocalRandom.current().nextDouble());
		System.out.println();
		System.out.println(ThreadLocalRandom.current().nextInt());
		Random r = new Random();
		int x = r.nextInt();
		System.out.println(x);

	}
}
