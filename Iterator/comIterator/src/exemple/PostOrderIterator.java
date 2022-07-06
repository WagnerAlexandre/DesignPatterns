package exemple;

import java.util.ArrayList;

public class PostOrderIterator implements Iterator{
	private int index;
	private ArrayList<Node> nodes = new ArrayList<Node>();
	
    public PostOrderIterator(Node node) {
    	this.index = 0;
    	traversePostOrder(node);
	}

    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.getLeft());
            traversePostOrder(node.getRight());
            nodes.add(node);
        }
    }
	
	@Override
	public boolean hasNext() {
		if (index < nodes.size()) {
			return true;
		}
		return false;
	}

	@Override
	public Node next() {
		if (this.hasNext()) {
			return nodes.get(index++);
		}
		return null;
	}
}
