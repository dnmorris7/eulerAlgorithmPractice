package basicAlgorithmsPractice;

public class AmazonQuestionOneMain {


	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		populateBST(bst);
		
		bst.inorderTraversal();
		System.out.println("End.");
		
		bst.postorderTraversal();
		System.out.println("PostOrder End.");
		
		bst.preorderTraversal();
		System.out.println("PreOrder End.");
	}

	private static void populateBST(BinarySearchTree bst) {
	
		IntElement data = new IntElement();

		int i;
		for (i = 0; i <= 10; i+=2) {

			data.setInt(i);
			bst.insert(data);
		}
		
		for(i=1; i<10; i+=2) {
			data.setInt(i);
			bst.insert(data);
		}
		
	}
}
