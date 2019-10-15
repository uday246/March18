class Node {
	int data;
	Node left, right;

	public Node(int item) {
		data = item;
		left = right = null;
	}
}

public class BalancedBST {

	Node root;

	BalancedBST() {
		root = null;
	}

	Node sortedArrayToBalancedBST(int arr[], int start, int end) {

		if (start > end) {
			return null;
		}

		// make middle element as root
		int mid = (start + end) / 2;
		Node node = new Node(arr[mid]);

		// construct left sub tree
		node.left = sortedArrayToBalancedBST(arr, start, mid - 1);

		// construct right sub tree
		node.right = sortedArrayToBalancedBST(arr, mid + 1, end);

		return node;
	}

	void preOrder(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public static void main(String[] args) {
		BalancedBST tree = new BalancedBST();
		int arr[] = { 2, 5, 7, 8, 10, 12, 1, 18, 19 };
		Node root = tree.sortedArrayToBalancedBST(arr, 0, arr.length - 1);
		System.out.println("Full tree : Preorder");
		tree.preOrder(root);

	}
}