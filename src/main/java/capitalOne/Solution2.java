package capitalOne;

public class Solution2 {
	static String X, Y;

	public static void main(String[] args) {
		String s = "bcdbcdbcdbcd";
		String t = "bcdbcd";

		char[] S = s.toCharArray();
		char[] T = t.toCharArray();
		char[] subber = new char[s.length()];
		System.out.println(T[0]);
		System.out.println(S[0]);
		System.out.println(S[0] == T[0]);
		subber[0] = S[0];

		System.out.println(T[1]);
		System.out.println(S[1]);
		System.out.println(S[1] == T[1]);
		subber[1] = S[1];
		System.out.println(T[2]);
		System.out.println(S[2]);
		System.out.println(S[2] == T[2]);
		subber[2] = S[2];

		for (char c : subber) {
			System.out.println(c);
		}

		// System.out.println("String S Length: "+ s.length());
		// System.out.println("String T Length: "+ t.length());

		int n, m;
		// X = "bcdbcdbcdbcd";
		// Y = "bcdbcd";
		X = "bcdbcd";
		Y = X.substring(0, X.length() - 1);
		Y = "apple";
		// Y=X.substring(0, X.length()-3);

		String[] XY = { X, Y };
		n = X.length();
		m = Y.length();

		System.out.println(lcs(n, m, 0));
		int lcsub = LCSubStrA3(X.toCharArray(), Y.toCharArray(), X.length(), Y.length());
		System.out.println("Lowest Common Substring Length: " + lcsub);
//	System.out.println(findstem(XY));
	}

	/*
	 * public static String commonDivisibleString(char[] s, char[] t) { //if(i==)
	 * 
	 * 
	 * }
	 */

	static int lcs(int i, int j, int count) {

		// we've reached the end of either string
		if (i == 0 || j == 0) {
			return count;
		}

		if (X.charAt(i - 1) == Y.charAt(j - 1)) {
			count = lcs(i - 1, j - 1, count + 1);
		}
		count = Math.max(count, Math.max(lcs(i, j - 1, 0), lcs(i - 1, j, 0)));
		return count;
	}

//Method3()- DP solution(Bottom up approach)
//time complexity - O(m*n)
//space complexity - O(m*n)
	public static int LCSubStrA3(char[] X, char[] Y, int m, int n) {
		int memo[][] = new int[m + 1][n + 1];
		int cache[][] = new int[m + 1][n + 1];
		int result = 0;

		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0) {
					memo[i][j] = 0;
				} else if (X[i - 1] == Y[j - 1]) {
					memo[i][j] = memo[i - 1][j - 1] + 1;
					result = Math.max(result, memo[i][j]);
				} else {
					memo[i][j] = 0;
				}
			}
		}
		cache = memo;
		return result;
	}

// function to find the stem (longest common  
// substring) from the string  array 
	public static String findstem(String arr[]) {
		// Determine size of the array
		int n = arr.length;

		// Take first word from array as reference
		String s = arr[0];
		int len = s.length();

		String res = "";

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j <= len; j++) {

				// generating all possible substrings
				// of our reference string arr[0] i.e s
				String stem = s.substring(i, j);
				int k = 1;
				for (k = 1; k < n; k++)

					// Check if the generated stem is
					// common to all words
					if (!arr[k].contains(stem))
						break;

				// If current substring is present in
				// all strings and its length is greater
				// than current result
				if (k == n && res.length() < stem.length())
					res = stem;
			}
		}

		return res;
	}

}
