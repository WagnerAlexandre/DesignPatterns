package exemple;

public interface Tree {
	public InOrderIterator getInOrderIterator();
	
	public PreOrderIterator getPreOrderIterator();
	
	public PostOrderIterator getPostOrderIterator();
}
