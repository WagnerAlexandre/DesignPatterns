package exemple;

import java.util.ArrayList;

public class InOrderIterator implements Iterator{
	private int index;
	private ArrayList<Node> nodes = new ArrayList<Node>();
	
    public InOrderIterator(Node node) {
    	this.index = 0;
    	traverseInOrder(node);
	}

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.getLeft());
            nodes.add(node);
            traverseInOrder(node.getRight());
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
