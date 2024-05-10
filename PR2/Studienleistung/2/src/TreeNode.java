import graphvisualizer.*;


public class TreeNode implements VisualizableOneKeyNode { // Node of a binary tree
	Element elem; // all kinds of Element can be stored in tree
	TreeNode left;
	TreeNode right;
	
	public TreeNode (Element i) {
		elem = i;
		left = right = null;
		}
	
	public TreeNode getLeft () {
		return left;
		}
	
	public TreeNode getRight () {
		return right;
		}
	
	public Element getElement () {
		return elem;
		}
	
	public void setLeft (TreeNode n) {
		left = n;
		}
	
	public void setRight (TreeNode n) {
		right = n;
		}
	
	public void setElement (Element e) {
		elem = e; 
		}
	
// tbd
	
	
// Methoden, die f�r die Visualisierung des Baums ben�tigt werden
	
	/**
	 * @return children of this node
	 */
	public VisualizableNode[] getChildren() {
		
		return new VisualizableNode[] {left, right};
	}

	@Override
	public Object getKey() {
		return elem.getKey();
	}
	

	/**
	 * @return the keys of this node.
	 */
	public Object[] getKeys() {
		return new Object[] {elem.getKey()};
	};

	
}