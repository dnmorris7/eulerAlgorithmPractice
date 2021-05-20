package amazonInterview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution2 {

	class DoubleLinkedList {
		protected Node first;
		protected Node last;

		class Node {
			int state;
			Node prev;
			Node next;

			public void setState(int i) {
				state = i;
			}

			public void insert(Node node) {
				Node current;
				Node trailCurrent = null;
				Node newNode; // variable to create a node

				newNode = new Node();
				newNode.state = node.getState();

				newNode.prev = null;
				newNode.next = null;
				// must be first node in the list
				if (first == null) {
					first = newNode;
					last = newNode;
				} else {

				}

			}

			private int getState() {
				// TODO Auto-generated method stub
				return this.state;
			}

			public void update() {
				if (this.prev.state == 1 && this.next.state == 1) {
					this.state = 0;
				}
			}

		}
	}

	public static void main(String[] args) {
		// seems like we'll need to transform the int[] states into a tree.
		// we then have a function within the tree to update the states states.
		// after that, we return the list
		int[] arr = new int[] { 1, 0, 0, 0, 0, 1, 0, 0 };
		List<Integer> answer = new ArrayList<Integer>();
		answer = cellCompete(arr, 3);
		System.out.println(answer.toString());
	}

	public static List<Integer> cellCompete(int[] states, int days) {
		List stateList = convertToList(states);

		for (int i = 0; i < days; i++) {
			update(stateList, i);
		}
		return stateList;
	}

	// if List
	private static void update(List stateList, int position) {
		int current = 0;
		int prev = 0;
		int next = 1;
//for the first number, previous is 0
		if (position == 0) {
			current = position;
			prev = 0;
			next = current + 1;
			if ((stateList.get(prev).equals(0) && stateList.get(next).equals(0))
					|| (stateList.get(prev).equals(1) && stateList.get(next).equals(1)))
				stateList.set(current, 0);

			else
				stateList.set(current, 1);
		}

		// for the last number, next is 0
		else if (position == stateList.size() - 1) {
			current = position;
			prev = position - 1;
			next = 0;
			if ((stateList.get(prev).equals(0) && stateList.get(next).equals(0))
					|| (stateList.get(prev).equals(1) && stateList.get(next).equals(1)))
				stateList.set(current, 0);

			else
				stateList.set(current, 1);
		} else {
		current=position;
			prev = current - 1;
			next= current +1;
		

		
			if ((stateList.get(prev).equals(0) && stateList.get(next).equals(0))
					|| (stateList.get(prev).equals(1) && stateList.get(next).equals(1)))
				stateList.set(current, 0);

			else
				stateList.set(current, 1);
		
		}
	}
//if previousPosition and nextPosition return 1...

	private static ArrayList convertToList(int[] states) {
		List<Integer> convertedList = new ArrayList<Integer>();

		for (int i = 0; i < states.length - 1; i++) {

			convertedList.add(states[i]);
		}
		return (ArrayList) convertedList;
	}

}
