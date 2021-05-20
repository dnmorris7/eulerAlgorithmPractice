package basicAlgorithmsPractice;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/
public class sumMultiples {

	public static void main(String[] args) {

		int[] numbers = new int[1000];

		for (int i = 1; i < numbers.length; i++) {
			numbers[i] = i;

		}

		ArrayList<Integer> multiThree = new <Integer>ArrayList();
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 3 == 0 || numbers[i] % 5 == 0)
				multiThree.add(numbers[i]);
			// System.out.println("M3:" + multiThree.toString());
			sum = multiThree.stream().reduce(0, (a, b) -> a + b);

		}
		System.out.println("Total M3&5: " + sum);
		// Arrays.stream(numbers).forEach(num -> System.out.println(num));
//		multiThree.forEach(num -> System.out.println(num));

	}

}
