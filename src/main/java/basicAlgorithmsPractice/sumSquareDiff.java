package basicAlgorithmsPractice;

import java.util.ArrayList;

public class sumSquareDiff {

	/*
	 * The sum of the squares of the first ten natural numbers is,
	 * 
	 * 1^2 + 2^2 + ... + 10^2 = 385 The square of the sum of the first ten natural
	 * numbers is,
	 * 
	 * (1 + 2 + ... + 10)^2 = 552 = 3025 Hence the difference between the sum of the
	 * squares of the first ten natural numbers and the square of the sum is 3025 −
	 * 385 = 2640.
	 * 
	 * Find the difference between the sum of the squares of the first one hundred
	 * natural numbers and the square of the sum.
	 */
	public static void main(String[] args) {
		// whatever we're doing, we are looking for a number in the end
		int answer = sumSquareDiff(100);

		System.out.println("The Answer: " + answer);

	}

	private static int sumSquareDiff(int range) {

		// all we are doing is finding the difference between two calculations (provided
		// we have a number that is greater than 0 of course)
		if (range > 0) {

			int sumSquares = sumSquares(range);
			int squareSums = squareSums(range);
			int difference = squareSums - sumSquares;
			System.out.println("\r\nHence the difference between the sum of the\r\n" + "squares of the first " + range
					+ " natural numbers and \r\nthe square of the sum is " + squareSums + " − " + sumSquares + " = "
					+ difference + ".");

			return difference;
		} else {

			System.out.println("Error, invalid number range.");
			return 0;
		}
	}

	private static int sumSquares(int range) {
		// we can do this with an array list, or recursively...I choose an arraylist.
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		// using a for loop, add in 1^2, 2^2...x^2, until we reach the range
		// (inclusively)...
		for (int i = 1; i <= range; i++) {
			int x = (int) Math.pow(i, 2);
			numbers.add(x);
		}
		// then summarize using the Collections utility.
		int sumSquares = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println("The Sum of the Squares of the first " + range + " natural numbers is " + sumSquares);
		return sumSquares;
	}

	private static int squareSums(int range) {
		// same thing. This could be done recursively, but let's use a Collection class
		// anyway.
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		// using a for loop, add in (1 + 2 + ... + x), inclusively
		for (int i = 1; i <= range; i++) {
			numbers.add(i);
		}

		// ...now summarize that collection of numbers...
		int sum = numbers.stream().mapToInt(Integer::intValue).sum();

		// ...now square that. Done!
		int squareSums = (int) Math.pow(sum, 2);
		System.out.println("The Square of the Sum of the first " + range + "natural numbers is " + squareSums);

		return squareSums;
	}

}
