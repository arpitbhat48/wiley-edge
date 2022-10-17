import java.util.*;

public class TreeTraversal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BinaryTree tree = new BinaryTree();
		System.out.println("Nodes: ");

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.right = new Node(7);

//		System.out.println(tree);
		tree.traversePreOrder(tree.root);
		System.out.println();
		tree.traverseInOrder(tree.root);
		System.out.println();
		tree.traversePostOrder(tree.root);
	}

}

class Node {
	int key;
	Node left, right;

	public Node(int item) {
		key = item;
		left = right = null;
	}
}

class BinaryTree {
	Node root;

	BinaryTree(int key) {
		root = new Node(key);
	}

	BinaryTree() {
		root = null;
	}

// Traverse Inorder
	public void traverseInOrder(Node node) {
		if (node != null) {
			traverseInOrder(node.left);
			System.out.print(" " + node.key);
			traverseInOrder(node.right);
		}
	}

// Traverse Postorder
	public void traversePostOrder(Node node) {
		if (node != null) {
			traversePostOrder(node.left);
			traversePostOrder(node.right);
			System.out.print(" " + node.key);
		}
	}

// Traverse Preorder
	public void traversePreOrder(Node node) {
		if (node != null) {
			System.out.print(" " + node.key);
			traversePreOrder(node.left);
			traversePreOrder(node.right);
		}
	}
}