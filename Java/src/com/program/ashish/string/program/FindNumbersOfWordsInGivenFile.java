package com.program.ashish.string.program;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FindNumbersOfWordsInGivenFile {
	public static void main(String[] args) {
		int charCount = 0;
		int wordCount = 0;
		int linesCount = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the file name ");

		String fileName = sc.next();
		BufferedReader br;
		// C:\Users\ashis\eclipse-workspace\microservices\Java\src\Hello.txt
		try {
			br = new BufferedReader(new FileReader(fileName));
			String currentLine = br.readLine();
			while (currentLine != null) {
				linesCount++;
				String[] words = currentLine.split(" ");
				wordCount = wordCount + words.length;
				for (String word : words) {
					charCount = charCount + word.length();
				}
				currentLine = br.readLine();
			}
			System.out.println("Total lines :" + linesCount);
			System.out.println("Total words : " + wordCount);
			System.out.println("Total character count : " + charCount);
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
