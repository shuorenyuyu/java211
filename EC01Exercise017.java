/* 	CS211(A) Winter 2018 Assignment EC01
 	Team: Tan Fuzhuo, Zhou Yang 
 	Client class for IntTree. */
public class EC01Exercise017 {
	public static void main(String[] args) {
		IntTree btree1 = new IntTree(5);
		IntTree btree2 = new IntTree(6);
		btree1.printInorder();
		btree2.printInorder();
		IntTree newTree = btree1.combineWith(btree2);
		newTree.printInorder();
		newTree.printSideways();
	}
}