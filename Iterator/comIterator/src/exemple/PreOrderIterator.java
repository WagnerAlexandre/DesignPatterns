package exemple;

import java.util.ArrayList;

public class PreOrderIterator implements Iterator{
	private int index;
	private ArrayList<Node> nodes = new ArrayList<Node>();
	
    public PreOrderIterator(Node node) {
    	this.index = 0;
    	traversePreOrder(node);
	}

    public void traversePreOrder(Node node) {
        if (node != null) {
            nodes.add(node);
            traversePreOrder(node.getLeft());
            traversePreOrder(node.getRight());
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
