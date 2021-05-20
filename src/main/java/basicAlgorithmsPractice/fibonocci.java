package basicAlgorithmsPractice;

public class fibonocci {

	public static void main(String[] args) {
		System.out.println(fib(8));
		int[]fibs = new int[20];
		
		System.out.println(fibmemo(8, fibs));

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

	static int fibmemo(int n, int[] memo) {
		if (n <= 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			memo[n] = fib(n - 1) + fib(n - 2);
		}
		System.out.println("Sequence: ");
		for(int i=0; i<memo.length; i++) {
			System.out.println(" "+memo[i]+" ");
		}
		return memo[n];
	}
}
