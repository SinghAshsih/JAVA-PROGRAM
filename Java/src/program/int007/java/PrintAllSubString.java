package program.int007.java;

public class PrintAllSubString {
public static void main(String[] args) {
	String input="amansingh";
	printSubString(input);
}

private static void printSubString(String input) {
	// TODO Auto-generated method stub
	for(int i=0;i<input.length();i++) {
		for(int j=i+1;j<=input.length();j++) {
			System.out.println(input.substring(i, j));
		}
	}
	
}
}
