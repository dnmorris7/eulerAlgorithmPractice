package capitalOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Solution {

	public static void main(String[] args) {
		int answer = (7 + 2 - 1) / 2;
		System.out.println("The Answer: " + answer);
		List<Integer> num = new ArrayList<Integer>();
		num.add(10);
		num.add(20);
		num.add(20);
		num.add(7);

		System.out.println(Arrays.toString(num.toArray()));

		// System.out.println("Max Element: "+num.stream().max(Integer::compare).get());
		for (int i = 0; i < 2; i++) {
			int max = num.stream().max(Integer::compare).get();
			int maxPosition = num.indexOf(max);

			System.out.println("Max Element: " + max + "\nAt Position: " + maxPosition);

			//List<Integer> givenList = Arrays.asList(1, 2, 3);
		//	Random rand = new Random();
			//int randomElement = givenList.get(rand.nextInt(num.size()));
			// System.out.println("RandomElement: "+randomElement);

			// int position = randomElement-1;
			// System.out.println(position);
			int toOperate = num.get(maxPosition);
			int operated = (toOperate + 2 - 1) / 2;

			num.remove(maxPosition);
			num.add(maxPosition, operated);
		}
		System.out.println(Arrays.toString(num.toArray()));
		int minSum = num.stream().mapToInt(Integer::intValue).sum();
		System.out.println(minSum);
int sum2 = num.stream().reduce(0, (x1, x2)->x1+x2);
		System.out.println(sum2);
	}

}
