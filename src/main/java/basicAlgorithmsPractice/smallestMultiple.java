package basicAlgorithmsPractice;

public class smallestMultiple {

	/*
	 * 2520 is the smallest number that can be divided by each of the numbers from 1
	 * to 10 without any remainder.
	 * 
	 * What is the smallest positive number that is evenly divisible by all of the
	 * numbers from 1 to 20?
	 */
	public static void main(String[] args) {
//whatever we're doing, we are looking for a number in the end
		int answer = smallestDivisible(20);

		System.out.println("The Answer For Range 20: " + answer);
	}

	// if 2520 is the smallest that can be divisible from
	private static int smallestDivisible(int range) {

		// We'll just go up from 2520, testing if the number is TRUE for
		// fullDivisibility, then return that.
		int testNum = 2520;
		while (!fullyDivisible(testNum, range)) {
			testNum++;
		}
		System.out.println("Smallest multiple of all numbers without remainder in ranges (1 - " + range + ")");
		return testNum;
	}

	// here is our for loop
	private static boolean fullyDivisible(int testNum, int range) {

		if (range == 0) {
			return true;
		} else {
			// if our test number is divisible by the range (starting with say twenty, then
			// nineteen, then eighteen...until we reach 0...
			// if at any point
			if (testNum % range == 0) {
				return fullyDivisible(testNum, range - 1);
			}

		}
		// else return false
		return false;
	}
	
	
	
}
