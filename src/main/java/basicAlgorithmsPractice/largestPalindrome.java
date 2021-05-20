package basicAlgorithmsPractice;

import org.apache.commons.lang3.ArrayUtils;

public class largestPalindrome {
	public static void main(String[] args) {
		//String palinForwards = Integer.toString(100);
	//	System.out.println(palinForwards.toCharArray());
		char[] p=palinForwards.toCharArray();
	//	System.out.println(p);
		ArrayUtils.reverse(p);
		//System.out.println(p);
		//p=ArrayUtils.reverse(palinForwards.toCharArray());
		String palinBackwards=p.toString();
		
		int answer = findLargest3DigitPalidrome();
		System.out.println(answer);
	}

	static boolean isPalindrome(int p) throws NumberFormatException {

		String palinForwards = Integer.toString(p);
		char[] p=ArrayUtils.reverse(palinForwards.toCharArray());
		String palinBackwards=p.toString();
		
		System.out.println(s);
		boolean check = false;
		return palinForwards==ArrayUtils.reverse(str);
		/*
		 * // Pointers pointing to the beginning // and the end of the string int i = 0,
		 * j = s.length() - 1;
		 * 
		 * // While there are characters to compare while (i < j) {
		 * 
		 * // If there is a mismatch if (str.charAt(i) != str.charAt(j)) return false;
		 * 
		 * // Increment first pointer and // decrement the other i++; j--; }
		 * 
		 * // Given string is a palindrome return true;
		 */
		/*
		 * if (s.length() == 0 || s.length() == 1) check= true; else if (s.charAt(0) ==
		 * s.charAt(s.length() - 1)) return isPalindrome(Integer.parseInt(s.substring(1,
		 * s.length() - 2)));
		 * 
		 * return check;
		 */
	}

	static int findLargest3DigitPalidrome() {

		// take the product of x1 and x2
		int largestFound = 0;

		try {
			for (int x1 = 999; x1 > 100; x1--) {
				for (int x2 = x1; x2 > 100; x2--) {
					int product = x2 * x1;
					if (isPalindrome(product) && product > largestFound) {
						largestFound = x1 * x2;
					}

				}

			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

		return largestFound;
	}
}
