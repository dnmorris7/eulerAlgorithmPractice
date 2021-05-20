package basicAlgorithmsPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class primeList {
	/*
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
	 * that the 6th prime is 13.
	 * 
	 * What is the 10 001st prime number?
	 */
	public static void main(String[] args) {
		// again, whatever we're doing, we are looking for a number in the end
		int answer = nthPrime(10001);
		System.out.println("The Answer: " + answer);

	}

	private static int nthPrime(int range) {
//looks like we want to create a list of primeNumbers up to the range of i...
		List<Integer> primes = new ArrayList<Integer>();

		System.out.println(primes.size());
		primes = createPrimes(range);

		int nthPrime = primes.get(range - 1);
		return nthPrime;
	}

	private static ArrayList<Integer> createPrimes(int range) {
		List<Integer> primeList = new ArrayList<Integer>();

		// there are various ways to create a list of prime numbers.
		/*
		 * To review some things on primes... 0. A number is a primes if all numbers up
		 * to themselves return not 0 can only be divisible (ie. number % i ==0) by 1
		 * and themselves. So we can skip the number 1. 1. Primes must be positive.
		 * 2.The first prime number is 2. 3. Primes outside of two can never be even
		 * (lest they be divisible by 2). If the above conditions are true, add it to
		 * our list.
		 */

		// we are returning

		if (range == 1) {
			primeList.add(2);

		}
		// start the list with two then...for each number after three...
		else if (range >= 2) {
			primeList.add(2);
		}
		// start with the number 3, then jump up by two each time within the for loop
		for (int i = 3; i <= range * 15; i += 2) {
			// if we find a prime number, add it in
			if (isPrime(i)==true) {
				System.out.println("Adding " +i +" to the list. ");
				primeList.add(i);
			}
		}

		return (ArrayList<Integer>) primeList;
	}

	private static boolean isPrime(int num) {
		System.out.println(num);
		boolean isPrime = true;
		for (int i = 2; i < num; i++) {
			// if we find a number that is divisible, return false
			if (num % i == 0) {
				isPrime = false;
				System.out.println("No. "+ num+" is not Prime.");
				return isPrime;
			}
		}
		return isPrime;
	}

}
