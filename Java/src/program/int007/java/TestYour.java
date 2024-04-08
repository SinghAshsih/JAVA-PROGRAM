package program.int007.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class TestYour {
	// public ,abstract ,final ,strictfp ,default,
	static int id;
	String name; // public , private , protected ,default ,final , static ,trnisent ,volatile

	public TestYour(String s) {
		this.name = s;
	}

	public void m1() { // public , protected , final ,strictfp ,static ,abstract ,synchronized ,
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		// public ,abstract , final , srtictfp ,default ,native
		TestYour t = new TestYour("Deepak");
		System.out.println(t.name);
	}
}

class Inner {
	// public ,abstract ,final ,strictfp ,default,
	// static , private ,protected ,

}

class Stt {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3, 4, 5, 6, 8, 9, 45, 76, 99);
		int array[] = { 1, 2, 3, 4, 5 };
		IntStream it = Arrays.stream(array);
		it.map(e -> e + 10).filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));

	}
}