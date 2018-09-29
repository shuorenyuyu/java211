/* 	CS211(A) Winter 2018 Assignment EC01
 	Team: Tan Fuzhuo, Zhou Yang 
 	This object work on Exercise 017 on page 1068, Exercise 020 on page 1069 and the IntTree class on page 1035. 
 	Exercise 017: Write a method combineWith that could be added to the IntTree class. The method accepts another binary tree of integers as a parameter and combines the two trees 
 	into a new third tree which is returned. The new tree's structure should be a union of the structures of the two original trees. It should have a node in any location 
 	where there was a node in either of the original trees (or both). The nodes of the new tree should store an integer indicating which of the original trees had a node 
 	at that position (1 if just the first tree had the node, 2 if just the second tree had the node, 3 if both trees had the node).
 	Exercise 020: Write a method makePerfect that could be added to the IntTree class. The method should add nodes until the binary tree is a "perfect" tree. A perfect binary tree is one
 	where all leaves are at the same level. Another way of thinking of it is that you are adding dummy nodes to the tree until every path from the root to a leaf is the same
 	length. A perfect tree's shape is exactly triangular and every branch node has exactly two children. Each node you add to the tree should store the value 0. */
public class IntTree {
	private IntTreeNode overallRoot;

	public IntTree() {
		overallRoot = null;
	}

	public IntTree(int max) {
		if (max <= 0) {
			throw new IllegalArgumentException("max: " + max);
		}
		overallRoot = buildTree(1, max);
	}

	private IntTreeNode buildTree(int n, int max) {
		if (n > max) {
			return null;
		} else {
			return new IntTreeNode(n, buildTree(2 * n, max), buildTree(2 * n + 1, max));
		}
	}

	public void add(int value) {
		overallRoot = add(overallRoot, value);
	}

	private IntTreeNode add(IntTreeNode root, int value) {
		if (root == null) {
			root = new IntTreeNode(value);
		} else if (value <= root.data) {
			root.left = add(root.left, value);
		} else {
			root.right = add(root.right, value);
		}
		return root;
	}

	public void printPreorder() {
		System.out.print("preorder:");
		printPreorder(overallRoot);
		System.out.println();
	}

	private void printPreorder(IntTreeNode root) {
		if (root != null) {
			System.out.print(" " + root.data);
			printPreorder(root.left);
			printPreorder(root.right);
		}
	}

	public void printInorder() {
		System.out.print("Inorder:");
		printInorder(overallRoot);
		System.out.println();
	}

	private void printInorder(IntTreeNode root) {
		if (root != null) {
			printInorder(root.left);
			System.out.print(" " + root.data);
			printInorder(root.right);
		}
	}

	public void printPostorder() {
		System.out.print("postorder:");
		printPostorder(overallRoot);
		System.out.println();
	}

	private void printPostorder(IntTreeNode root) {
		if (root != null) {
			printPostorder(root.left);
			printPostorder(root.right);
			System.out.print(" " + root.data);
		}
	}

	public void printSideways() {
		printSideways(overallRoot, 0);
	}

	private void printSideways(IntTreeNode root, int level) {
		if (root != null) {
			printSideways(root.right, level + 1);
			for (int i = 0; i < level; i++) {
				System.out.print("    ");
			}
			System.out.println(root.data);
			printSideways(root.left, level + 1);
		}
	}

	class IntTreeNode {
		public int data;
		public IntTreeNode left;
		public IntTreeNode right;

		public IntTreeNode(int data) {
			this(data, null, null);
		}

		public IntTreeNode(int data, IntTreeNode left, IntTreeNode right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	public IntTree combineWith(IntTree t2) {
		IntTree t3 = new IntTree();
		t3.overallRoot = combineWith(overallRoot, t2.overallRoot);
		return t3;
	}

	private IntTreeNode combineWith(IntTreeNode n1, IntTreeNode n2) {
		if (n1 == null && n2 == null)
			return null;

		IntTreeNode n3;

		if (n1 == null) {
			n3 = new IntTreeNode(2);
			n3.left = combineWith(null, n2.left);
			n3.right = combineWith(null, n2.right);
		} else if (n2 == null) {
			n3 = new IntTreeNode(1);
			n3.left = combineWith(n1.left, null);
			n3.right = combineWith(n1.right, null);
		} else {
			n3 = new IntTreeNode(3);
			n3.left = combineWith(n1.left, n2.left);
			n3.right = combineWith(n1.right, n2.right);
		}

		return n3;
	}

	public IntTree makePerfect(IntTree btree, int height) {
		overallRoot = makePerfect(overallRoot, height());
		return btree;
	}

	public IntTreeNode makePerfect(IntTreeNode root, int height) {
		if (root == null) {
			root = new IntTreeNode(0);
		}
		if (height == 0) {
			return null;
		} else {
			root.left = makePerfect(root.left, height - 1);
			root.right = makePerfect(root.right, height - 1);
			return root;
		}
	}

	public int height() {
		return height(overallRoot);
	}

	private int height(IntTreeNode root) {
		if (root == null) {
			return 0;
		} else {
			return 1 + Math.max(height(root.left), height(root.right));
		}
	}
}