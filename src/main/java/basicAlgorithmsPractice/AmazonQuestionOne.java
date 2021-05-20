package basicAlgorithmsPractice;

import java.util.ArrayList;
//IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
import java.util.List;

//SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
//DEFINE ANY CLASS AND METHOD NEEDED
//CLASS BEGINS, THIS CLASS IS REQUIRED
public class AmazonQuestionOne {

	protected List<Cell> neighborhood;

	protected class Cell {
		int state = 1;
		int nextState;
		Cell lneighbor = null;
		Cell rneighbor = null;
	}

// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	/*
	 * public List<Integer> cellCompete(int[] states, int days) {
	 * 
	 * }
	 */

// METHOD SIGNATURE ENDS
	public void createNeighborHood(int size) {
		List<Cell> neighborhood = new ArrayList<Cell>();

		// create the neighborhood full of blank Cells
		for (int i = 0; i <= size; i++) {
			Cell temp = new Cell();
			neighborhood.add(temp);
		}

		// establish neighbor links
		for (int i = 0; i <= size; i++) {
			// if the first cell, the left neighbor's state is 0
			if (i == 0) {
				neighborhood.get(i).lneighbor.state = 0;
				neighborhood.get(i).rneighbor = neighborhood.get(i + 1);

			}
			// if the last cell, the right neighbor state is 0
			else if (i == size - 1) {
				neighborhood.get(i).rneighbor.state = 0;
				neighborhood.get(i).lneighbor = neighborhood.get(i - 1);
			}
			// else, your left neighbor is i-1, and your right neighbor is i+1
			else {
				neighborhood.get(i).lneighbor = neighborhood.get(i - 1);
				neighborhood.get(i).rneighbor = neighborhood.get(i + 1);
				setState(neighborhood.get(i));
			}

		}
	}

	// everytime I update the neighborhood, I'm going to check if
	private int[] updateNeighborHoodCompetition(ArrayList<Cell> neigh, int days) {
		int[] states = new int[days];
		for (int i = 0; i <= days; i++) {
			Cell temp = neigh.get(i);
			temp.state = temp.nextState;
			setState(temp);
		}
		for (int i = 0; i <= days; i++)
			states[i] = neigh.get(i).state;

		// System.out.println(states.toString());
		return states;
	}

	private Cell setState(Cell cell) {
		int leftState = cell.lneighbor.state;
		int rightState = cell.rneighbor.state;
		// if the neighbors on both sides are either active or inactive
		if ((leftState == 1 && rightState == 1) || (leftState == 0 && rightState == 0)) {
			cell.nextState = 0;
		} else {
			cell.nextState = 1;
		}
		return cell;
	}

	public void printNeighborhood() {
		for (Cell i : neighborhood) {
			System.out.println(neighborhood.stream().toString());
		}

	}

}