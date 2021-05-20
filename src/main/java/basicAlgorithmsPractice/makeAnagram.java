package basicAlgorithmsPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class makeAnagram {
public static int NUMBER_LETTERS=26;
	// Complete the makeAnagram function below.
	static int makeAnagram(String a, String b) {
int[] charCount1=getCharCounts(a);
int[]charCount2=getCharCounts(b);
return getDelta(charCount1, charCount2);

	}

	private static int getDelta(int[] count1, int[] count2) {
		// TODO Auto-generated method stub
		if (count1.length!=count2.length) {
			return -1; //arrays must be same length
		}
		int delta = 0;
		for(int i = 0; i< count1.length; i++) {
			int difference = Math.abs(count1[i]-count2[i]);
			delta +=difference;
		}
		return delta;
			
	}

	private static int[] getCharCounts(String S) {
		int[] charCounts = new int[NUMBER_LETTERS];
		for(int i=0; i<S.length();i++) {
			char c = S.charAt(i);
			//returns the ASCII value of the letter
			int offset = (int)'a';
			int code = c-offset;
			charCounts[code]++;
		}
		
		return charCounts;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		long startTime = System.nanoTime();
		BufferedReader bufferedReader = new BufferedReader(
				new FileReader("C:\\Users\\David\\Desktop\\DevOps2019\\2019\\Spring\\basicAlgorithmPractice\\src\\test\\resources\\input\\input00.txt"));
		BufferedWriter bufferedWriter = new BufferedWriter(
				new FileWriter("C:\\Users\\David\\Desktop\\DevOps2019\\2019\\Spring\\basicAlgorithmPractice\\src\\test\\resources\\output\\input00.txt"));

		String a = scanner.nextLine();

		String b = scanner.nextLine();

		int res = makeAnagram(a, b);

		bufferedWriter.write(String.valueOf(res));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
		long endTime = System.nanoTime();

		long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
		System.out.println("Runtime:" +duration);
	}
}
