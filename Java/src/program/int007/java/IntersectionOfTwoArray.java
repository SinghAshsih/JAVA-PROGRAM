package program.int007.java;

public class IntersectionOfTwoArray {
	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4, 5, 6, 9, 9, 9, 9 };
		int[] a2 = { 6, 7, 8, 9, 1, 2 };
		intersection(a1, a2);
	}

	private static void intersection(int[] a1, int[] a2) {
		// TODO Auto-generated method stub
//		int len=(a1.length+a2.length)/2;
//		int[] interSection=new int[len];
		System.out.println("Intersection of two array : ");
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a2.length; j++) {
				if (a1[i] == a2[j]) {
					System.out.print(a1[i] + "  ");
				}
			}
		}

	}

}
