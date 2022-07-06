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
	    
	    System.out.println("Com Iterator");
	    System.out.print("In Order: ");
	    for(Iterator iter = bt.getInOrderIterator(); iter.hasNext();){
	        System.out.print(iter.next().getValue() + " ");
	     } 
	  
	    System.out.print("\nPre Order: ");
	    for(Iterator iter = bt.getPreOrderIterator(); iter.hasNext();){
	        System.out.print(iter.next().getValue() + " ");
	     } 	
	  
	    System.out.print("\nPost Order: ");
	    for(Iterator iter = bt.getPostOrderIterator(); iter.hasNext();){
	        System.out.print(iter.next().getValue() + " ");
	     } 	
	}

}
