package basicAlgorithmsPractice;

import java.util.Stack;

public class fibonacciEvenSum {

	public static void main(String[] args) {
		// System.out.println(fib(8));
		int numberTerms=50;
		int[] fibs = new int[numberTerms+1];
		//System.out.println(fibs.length);

		Stack<Integer> fibsStack = new Stack<Integer>();

		/*
		 * fibs[0]=0; fibs[1]=1; fibs[2]=2;
		 * 
		 * fibs[3]=3;
		 */

		fibs = fibsum(numberTerms, fibs);
		fibsStack = fibsumStack(numberTerms, fibs);
		//System.out.print("Even Terms: ");
		fibsStack.stream().forEach(e -> System.out.print(e + " "));
		
		int sum = fibsStack.stream().mapToInt(Integer::intValue).sum();
		System.out.println("\n Summation of Even Numbers: " + sum);

		System.out.println();
		// System.out.println(fibsum(8, fibs));
		//System.out.print("Fibonnanci Sequence: ");
		for (int n = 0; n < fibs.length; n++) {
			System.out.print(fibs[n] + " ");

		}

	}

	static int fib(int n) {
		if (n <= 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}

	}

	// we want all even terms to be considered in the final calculation. So we are
	// filtering out all odd terms.
	// in this case, we can just do the fibonnacci, then apply a set formula for all
	// the even terms, then sum that set.
	static int[] fibsum(int n, int[] memo) {
		Stack<Integer> evenTerms = new Stack<Integer>();
		int[] fibarray = new int[memo.length];

		if (n <= 0) {
			fibarray[n] = 0;
		} else if (n == 1) {
			fibarray[n] = 1;
		} else {
			// if fib(n-1) is even, and fib(
			for (int i = 2; i <= n; i++) {
				fibarray[i] = fib(i - 1) + fib(i - 2);

			}
		}
		return fibarray;

	}

	static Stack<Integer> fibsumStack(int n, int[] memo) {
		Stack<Integer> evenTerms = new Stack<Integer>();
		int[] fibarray = new int[memo.length];

		if (n <= 0) {
			fibarray[n] = 0;
		} else if (n == 1) {
			fibarray[n] = 1;
		} else {
		
			for (int i = 2; i <= n; i++) {
				fibarray[i] = fib(i - 1) + fib(i - 2);

				// if fib(n-1) is even, add to stack to compile later
				if ( fibarray[i] <4000000 && fibarray[i] % 2 == 0) {
					evenTerms.add(fibarray[i]);

				}
			}
			/*
			 * if(fib(n-1)%2==0 && fib(n-2)%2==0) { evenTerms.add(memo[n]); }
			 */
		}
		// evenTerms.forEach(e -> System.out.println("Even Terms: " + e + " "));
		return evenTerms;
	}

	/*
	 * static int[] generateFibSequence(int n, int[] memo) { int[] mem = new int[n +
	 * 1]; if (n <= 0) { return mem[n] = 0; } else if (n == 1) { return mem[n] = 1;
	 * } else { // if fib(n-1) is even, and fib( memo[n] = fib(n - 1) + fib(n - 2);
	 * }
	 * 
	 * return mem;
	 * 
	 * }
	 */

}
