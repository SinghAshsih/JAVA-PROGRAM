package program.int007.java;

public class Utility {

	public static void intersectionArray() {
		// How to find intersection of two arrays in java?
		int[] num1 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] num2 = { 0, 4, 5, 6, 9, 8 };
		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num2.length; j++) {
				
				if (num1[i] == num2[j]) {
					System.out.println(num1[i]);
				}
			}
		}
	}
public static void uniqueCharacter() {
	String input ="My name is ashish";
	boolean result=false;
	char[] letter=input.toCharArray();
	for(int i=0;i<letter.length;i++) {
		if(letter[i]==' ') {
			continue;
		}
		for(int j=0;j<input.length();j++) {
			
		}
		
}}
	public static void main(String[] args) {
		Utility.intersectionArray();
	}
}
