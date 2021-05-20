package basicAlgorithmsPractice;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class primeFactorization {

	public static void main(String[] args) {
		long number = 600851475143L;
		
		 long largest = largestPrime(number);
		 System.out.println(largest);
		//printPrimes(number);
	}

	private static long largestPrime(long number) {
		HashSet<Long> primeFactors = factorize(number);
		primeFactors.remove(number);
		Long max = Collections.max(primeFactors);

		return max;
	}

	private static void printPrimes(long number) {
		HashSet<Long> primeFactors = factorize(number);
		primeFactors.forEach(e -> System.out.println(e + " "));
		// forEach(e -> Long.parseLong(e) + " ");

	}

	private static HashSet<Long> factorize(long number) {
		HashSet<Long> primefactors = new HashSet<Long>();
		for (long i = 2; i <= number; i++) {
			
				if (number % i == 0) {
					primefactors.add(i);
					primefactors.addAll(factorize(number / i));
					return primefactors;
				}

		}
		return primefactors;

	}
}
