package videoStore;

import java.util.Stack;



public class BinaryTree {
	protected BinaryTreeNode root;

	protected class BinaryTreeNode {
		DataElement info;
		BinaryTreeNode llink;
		BinaryTreeNode rlink;
	}

	public BinaryTree() {
		root = null;
	}

//copy constructor
	public BinaryTree(BinaryTree otherTree) {
		if (otherTree.root == null)
			root = null;
		else
			root = copy(otherTree.root);
	}

	public boolean isEmpty() {
		return (root == null);
	}

	
	
	
	//traversals
	public void inorderTraversal() {
		inorder(root);
	}

	public void preorderTraversal() {
		preorder(root);
	}

	public void postorderTraversal() {
		postorder(root);
	}

	public void nonRecursiveInTraversal()
	{
		Stack stack = new Stack();
		BinaryTreeNode current;
		current=root;
	
		while(current!=null || stack.empty()){
			if (current!=null)
			{
				stack.push(current);
				current=current.llink;
			}else {}
		}
	}

	public int treeHeight() {
		return height(root);
	}

	private int height(BinaryTreeNode p) {
		if (p == null)
			return 0;
		else
			return 1 + max(height(p.llink), height(p.rlink));
	}

	private int max(int x, int y) {
		if (x >= y)
			return x;
		else
			return y;
	}

	public int treeNodeCount() {
		return nodeCount(root);
	}

	private int nodeCount(BinaryTreeNode p) {
		int count = 0;
		if (p == null)
			return count;
		else
			return 1 + nodeCount(p.llink) + nodeCount(p.rlink);

	}

	private BinaryTreeNode copy(BinaryTreeNode otherTreeRoot) {
		BinaryTreeNode temp;

		if (otherTreeRoot == null) {
			temp = null;
		} else {
			temp = new BinaryTreeNode();
			temp.info = otherTreeRoot.info.getCopy();
			temp.llink = copy(otherTreeRoot.llink);
			temp.rlink = copy(otherTreeRoot.rlink);
		}
		return temp;
	}

	public void copyTree(BinaryTree otherTree) {
		if (this != otherTree) {
			root = null;
			if (otherTree.root != null)// otherTree is nonempty
				root = copy(otherTree.root);

		}
	}

	public void destroyTree() {
		root = null;

	}

	/*
	 * public int treeLeavesCount() { leavesCount(root); }
	 * 
	 * private void leavesCount(BinaryTreeNode root2) { if (p.llink == null and
	 * p.rlink == null)
	 * 
	 * }
	 */

	private void inorder(BinaryTreeNode p) {
		if (p != null) {
			inorder(p.llink);
			System.out.println(p.info.toString() + " ");
			inorder(p.rlink);

		}
		else {
		//	System.out.println("Error");
		}
	}

	private void preorder(BinaryTreeNode p) {
		if (p != null) {
			System.out.println(p.info + " ");
			preorder(p.llink);
			preorder(p.rlink);
		}
	}

	private void postorder(BinaryTreeNode p) {
		if (p != null) {
			postorder(p.llink);
			postorder(p.rlink);
			System.out.println(p.info + " ");

		}

	}

}
