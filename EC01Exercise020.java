/* 	CS211(A) Winter 2018 Assignment EC01
 	Team: Tan Fuzhuo, Zhou Yang 
 	Client class for IntTree. */
public class EC01Exercise020 {
	public static void main(String[] args) {
		IntTree btree = new IntTree(5);
		int height = 3;
		IntTree newTree = btree.makePerfect(btree, height);
		newTree.printSideways();
	}
}
