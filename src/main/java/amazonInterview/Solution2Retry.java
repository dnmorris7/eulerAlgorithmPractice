package amazonInterview;

import java.util.ArrayList;
import java.util.List;

public class Solution2Retry {

	public static void main(String[] args) {
		public static void main(String[] args) {
			// seems like we'll need to transform the int[] states into a tree.
			// we then have a function within the tree to update the states states.
			// after that, we return the list
			int[] arr = new int[] { 1, 0, 0, 0, 0, 1, 0, 0 };
			List<Integer> answer = new ArrayList<Integer>();
			answer = cellCompete(arr, 1);
			System.out.println(answer.toString());
		}

		public static List<Integer> cellCompete(int[] states, int days) {
			List stateList = convertToList(states);
			
			int position =0;
			
			if (position<=0) {
				
			}
			
			
			for (int i = 0; i < days; i++) {
				update(stateList);
			}
			return stateList;
		}
		
		private static void update(List stateList) {
			int current = 0;
			int prev = 0;
			int next = 1;

			if (current == 0) {
				current = i;
				next = current + 1;
			} else {
				prev = current - 1;
			}

			for (int i = 1; i < stateList.size(); i++) {
				if ((stateList.get(prev).equals(0) && stateList.get(next).equals(0))
						|| (stateList.get(prev).equals(1) && stateList.get(next).equals(1)))
					stateList.set(current, 0);
				else
					stateList.set(current, 1);
			}

		}
		
	}

}
