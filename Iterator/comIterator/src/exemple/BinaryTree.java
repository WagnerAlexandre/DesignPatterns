package exemple;

public class BinaryTree implements Tree{

    Node root;

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.getValue()) {
            current.setLeft(addRecursive(current.getLeft(), value));
        } else if (value > current.getValue()) {
            current.setRight(addRecursive(current.getRight(), value));
        } else {
            return current;
        }

        return current;
    }
    
    public void add(int value) {
        root = addRecursive(root, value);
    }

	@Override
	public InOrderIterator getInOrderIterator() {
		return new InOrderIterator(root);
	}

	@Override
	public PreOrderIterator getPreOrderIterator() {
		return new PreOrderIterator(root);
	}

	@Override
	public PostOrderIterator getPostOrderIterator() {
		return new PostOrderIterator(root);
	}
}
