class Node {
	int data;
	Node left, right;

	public Node(int item) {
		data = item;
		left = right = null;
	}
}

public class BST {

	Node root;

	BST() {
		root = null;
	}

	public int mysteryRec(Node current) {
		if (current == null)
			return 0;
		int left = mysteryRec(current.left);
		int right = mysteryRec(current.right);
		int temp = left + right + current.data;
		if (temp > 15)
			System.out.println(current.data);
		return temp;

	}

	Node delete(Node root, int data) {
		/* If the root is null than tree is empty */
		if (root == null)
			return root;

		// travels till the end
		if (data < root.data) {
			root.left = delete(root.left, data);
		} else if (data > root.data) {
			root.right = delete(root.right, data);
		}

		else {
			// node with only one child or no child
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;
		}
		return root;
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

	Node insert(Node root, int data) {

		// If the root is null than tree is empty, new node will become root
		if (root == null) {
			root = new Node(data);
			return root;
		}

		// if data is < root go left
		if (data < root.data)
			root.left = insert(root.left, data);
		// if data > root go right
		else if (data > root.data)
			root.right = insert(root.right, data);

		return root;
	}

	void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			inorder(root.right);
			System.out.print(root.data + " ");
		}
	}

	public static void main(String[] args) {
		BST tree = new BST();
		tree.root = tree.insert(tree.root, 50);
		tree.root = tree.insert(tree.root, 25);
		tree.root = tree.insert(tree.root, 12);
		tree.root = tree.insert(tree.root, 75);
		tree.root = tree.insert(tree.root, 45);
		tree.root = tree.insert(tree.root, 48);
		tree.root = tree.insert(tree.root, 60);
		tree.root = tree.insert(tree.root, 55);
		tree.root = tree.insert(tree.root, 85);
		tree.root = tree.insert(tree.root, 5);
		tree.root = tree.insert(tree.root, 100);
		tree.root = tree.insert(tree.root, 35);
		tree.root = tree.insert(tree.root, 47);
		tree.root = tree.insert(tree.root, 70);
		tree.root = tree.insert(tree.root, 58);
		tree.root = tree.insert(tree.root, 30);
		tree.root = tree.insert(tree.root, 38);
		tree.root = tree.insert(tree.root, 65);
		tree.root = tree.insert(tree.root, 49);
		tree.root = tree.insert(tree.root, 80);
			
		tree.inorder(tree.root);
		/*
		 * System.out.println("Full tree : "); tree.inorder(tree.root);
		 * System.out.println(); tree.delete(tree.root,22);
		 * System.out.println("After removing 22: "); tree.inorder(tree.root);
		 * System.out.println(); System.out.println("After removing 35: ");
		 * tree.delete(tree.root,35); tree.inorder(tree.root);
		 * System.out.println(); System.out.println("After removing 44: ");
		 * tree.delete(tree.root,44); tree.inorder(tree.root);
		 * System.out.println();
		 */
	}
}