package videoStore;

 

public class BinarySearchTree extends BinaryTree {

	// search
	public boolean search(DataElement searchItem) {

		BinaryTreeNode current;
		boolean found = false;

		if (root == null)
			System.out.println("Cannot search an empty tree.");
		else {
			current = root;
			while (current != null && !found) {
				if (current.info.equals(searchItem))
					found = true;
				else if (current.info.compareTo(searchItem) > 0)
					current = current.llink;
				else
					current = current.rlink;
			} // end while
		} // end else
		return found;
	}

	// insertion
	public void insert(DataElement insertItem) {
		BinaryTreeNode current; // references current node
		BinaryTreeNode parentCurrent = null; // references variable behind current node; will bind the current node to
												// its
		// parent at the end of the insertion check.
		BinaryTreeNode newNode; // references node to insert

		// 1-First Create the new node with our data element
		newNode = new BinaryTreeNode();
		newNode.info = insertItem.getCopy();
		newNode.llink = null;
		newNode.rlink = null;

		// Case 1, there is no tree.
		if (root == null)
			root = newNode;
		else {
			current = root;
			while (current != null) {
				parentCurrent = current;
				if (current.info.equals(insertItem)) {
					System.out.println("The Insert Item is already in the list -- duplicates unallowed.");
					return;
				} else if (current.info.compareTo(insertItem) > 0)
					current = current.llink;
				else
					current = current.rlink;
			}
			if (parentCurrent.info.compareTo(insertItem) >= 0)
				parentCurrent.llink = newNode;
			else
				parentCurrent.rlink = newNode;

		}

	}

}
