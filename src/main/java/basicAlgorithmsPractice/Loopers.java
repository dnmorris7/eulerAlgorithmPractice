package basicAlgorithmsPractice;

public class Loopers {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6 };

		// for loop
		/*
		 * for (int i = 0; i <= array.length - 1; i++) System.out.print(array[i] + " ");
		 */
		// enhanced for loop
		
		//int x =0;
		int num =0;
		 for (int x : array) 
			 System.out.print(x + " ");
		 
	}

}
