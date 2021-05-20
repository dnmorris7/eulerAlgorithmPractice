package basicAlgorithmsPractice;

import java.util.HashMap;
import java.util.Map;

public class count7 {

	public static void main(String[] args) {
		System.out.println(count7(767));

	}

	
	public static int count7(int n) {
		// Map<Integer, Integer> occurances= new HashMap<Integer, Integer>();
		int occurances=0;
		  //again, if n/10 == 0, we've reached the last digit.
		   //digit
		  if(n/10==0 && n%10==7){
		    return 1;
		  }
		  else if(n/10==0)
			  return 0;
		  else {
			  if(n%10==7){
			  occurances = 1+	  count7(n/10);
		  }
		
		  
		    //if n%10 == 7, add that to our occurances
		    
		    
		  return occurances;
		 
		  }
		  }
}

