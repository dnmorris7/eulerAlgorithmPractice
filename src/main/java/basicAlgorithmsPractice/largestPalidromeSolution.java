package basicAlgorithmsPractice;

import org.apache.commons.lang3.ArrayUtils;

public class largestPalidromeSolution {

	public static void main(String[] args) {
		int answer = findLargest3DigitPalidrome();
		/*
		 * String a = "ABC"; String b = "ABC"; System.out.println(a == b);
		 */
		System.out.println(isPalindrome(20202));
		System.out.println(answer);
	}

	static boolean isPalindrome(int p) {
		boolean check = false;

		String palinForwards = Integer.toString(p);
		// System.out.println(palinForwards);
		char[] palForwards = palinForwards.toCharArray();
		char[] palBackwards = palForwards.clone();
		ArrayUtils.reverse(palBackwards);
		// System.out.println("Forwards: "+String.valueOf(palForwards));
		// System.out.println("Backwards: "+String.valueOf(palBackwards));
		String p1 = String.valueOf(palForwards);
		String p2 = String.valueOf(palBackwards);
		// String palinBackwards = palProcess.toString();
		// System.out.println(palinBackwards);
		if (Integer.parseUnsignedInt(p1) == Integer.parseUnsignedInt(p2))
			check = true;
		return check;
	}

	static int findLargest3DigitPalidrome() {

		// take the product of x1 and x2
		int largestFound = 0;
		int product = 0;

		for (int x1 = 999; x1 > 100; x1--) {
			for (int x2 = x1; x2 > 100; x2--) {
				product = x2 * x1;
				// System.out.println(product);
				if (isPalindrome(product) && product > largestFound) {
					System.out.println("Found Palindrome " + "(" + x1 + " x " + x2 + ") =" + product);
					largestFound = x1 * x2;
				}

			}

		}
		return largestFound;
		// if it isn't, subtract x2 by 1

		// do it again until x2 = 100

		// then subtract x1 by 1

		// if it is, you found the largest palindrome

		/*
		 * while (isPalindrome(product) == false && x2 > 100) { product = x1 * x2; x2--;
		 * 
		 * if (isPalindrome(product) == true && x1 > 100 && x2 > 100) return product;
		 * else findLargest3DigitPalidrome(x1 - 1);
		 * 
		 * System.out.
		 * println("The Largest 3 Digit Palidrome is formed from multiplying " + x1 +
		 * " x " + x2);
		 * 
		 * }
		 */

	}
}
