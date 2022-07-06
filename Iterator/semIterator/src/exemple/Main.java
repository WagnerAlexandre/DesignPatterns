package exemple;

public class Main {

	public static void main(String[] args) {
	    BinaryTree bt = new BinaryTree();

	    bt.add(6);
	    bt.add(4);
	    bt.add(8);
	    bt.add(3);
	    bt.add(5);
	    bt.add(7);
	    bt.add(9);

	    System.out.println("Sem Iterator");

	    System.out.print("In Order: ");
	    bt.traverseInOrder(bt.getRoot());

	    System.out.print("\nPre Order: ");
	    bt.traversePreOrder(bt.getRoot());

	    System.out.print("\nPost Order: ");
	    bt.traversePostOrder(bt.getRoot());
	}

}
