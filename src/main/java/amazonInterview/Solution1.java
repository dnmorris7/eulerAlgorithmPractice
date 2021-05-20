package amazonInterview;

public class Solution1 {
	public static void main(String[] args) {
		// again, whatever we're doing, we are looking for a number in the end
int[] arr =new int [] {2, 4, 6, 8, 10};
int[] arr2 =new int [] {5, 15, 25, 20, 30, 40};
		int answer = generalizedGCD(5, arr2);
		System.out.println("The Answer: " + answer);

	}

	public static int generalizedGCD(int num, int[] arr)
	    {
	    //So essentially, we are creating a list of numbers based on the size of N
	    //let's create a maxDivisor of 1, and return that by default.
	    int maxDivisor=1;
	    if(num > 0){
	    //start counting at two 2.
	    //if i is fully divises the list at some point,
	    //AND its greater than the old maxDivisor...make that the new.
	        for(int i = 2; i<=num; i++){
	         if (maxDivisor(i, arr) == true && i>maxDivisor){
	             maxDivisor=i;
	         }
	            
	        }
	    }
	        return maxDivisor;
	    }

	// METHOD SIGNATURE ENDS
	// Now we just need a boolean method for maxDivisor
	public static boolean maxDivisor(int i, int[] arr){
	      
	        for (int j=0;j<arr.length; j++){
	      //if at some point we find a place in the array where we have a remainder
	      //break, the for loop, and return false.
	            if(arr[j]%i!=0)
	            break;
	            //we reached the end and there are still
	            //no remainders
	            else if(j==arr.length-1) 
	            return true;
	            
	        }
	        return false;
	    }
	
	
}
