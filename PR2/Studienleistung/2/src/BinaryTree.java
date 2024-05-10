//package pr2.uebung02;
//
//import graphvisualizer.TreeVisualizer;
//import java.util.Scanner;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class BinaryTree implements Tree {
//
//	private TreeNode root = null;
//
//	@Override
//	public void visualize() {// visualizes tree
//		TreeVisualizer tv = new TreeVisualizer();
//		tv.draw(root);
//	}
//
//	@SuppressWarnings("unchecked")
//	@Override
//	public boolean insert(Element val) { 
//		TreeNode parent = null;
//		TreeNode child = root;
//		while (child != null) {  // at least 1 node in tree
//			parent = child;
//
//			if(val.compareTo(child.getElement()) == 0) {
//				return false;  // element already in tree, i is not inserted
//			} else if(val.compareTo(child.getElement()) < 0) {
//				child = child.getLeft();  // insert in left tree
//			} else {
//				child = child.getRight();  // insert in right tree
//			}
//		}
//		
//		if(parent == null) {  // empty tree -> insert first node
//			root = new TreeNode(val);
//		} else if(val.compareTo(parent.getElement()) < 0) {
//			parent.setLeft(new TreeNode(val));  // insert left from parent
//		} else {
//			parent.setRight(new TreeNode(val));  // insert right from parent
//		}
//		return true;
//	}
//
//	@Override
//	public boolean insertFromFile(String filename) {  // inserts objects from file in tree
//		try {
//			Scanner scan = new Scanner(new File(filename));
//			int val;
//			while (scan.hasNext()) {
//				val = scan.nextInt();
//				if (!this.insert(new IntElement(val)))
//					return false;
//			}
//		} catch (FileNotFoundException e) {
//			return false;
//		}
//		return true;	// returns true if at least one element on file is really inserted
//	}
//
//	@Override
//	public boolean saveToFile(String filename) {  // stores objects from tree in file
//		try {
//			File newFile = new File(filename);
//			FileWriter writer = new FileWriter(newFile);
//			saveToFileRec(root, writer);
//			writer.close();
//		} catch (IOException e) {
//			return false;
//		}
//		return true;
//	}
//	
//	public void saveToFileRec(TreeNode a, FileWriter fileWriter) {
//		if (a != null) {
//			try {
//				fileWriter.write(a.getElement().toString()); // Write the current element in the file
//			} catch (IOException e) {
//				return;
//			}
//			saveToFileRec(a.getLeft(), fileWriter); // move left
//			saveToFileRec(a.getRight(), fileWriter); // move right
//		}
//	}
//
//	@Override
//	public boolean contains(Element val) {  // checks if val is in tree
//		TreeNode b = root;
//		while (b != null) {  // tree is not empty 
//			if (b.getElement().compareTo(val) < 0)
//				b = b.getRight();
//			else if (b.getElement().compareTo(val) > 0)
//				b = b.getLeft();
//			else
//				return true;
//		}
//		return false;
//	}
//
//	@Override
//	public int size() {  // computes number of values in tree
//		return getSize(root);
//	}
//	
//	public int getSize(TreeNode c) {
//		if (c == null)  //tree is empty
//			return 0;
//		return 1 + getSize(c.getLeft()) + getSize(c.getRight());
//	}
//
//	@Override
//	public int height() {  // computes height of tree
//		return getheight(root);
//	}
//	
//	public int getheight(TreeNode d) {
//		if (d == null)
//			return 0;
//		else {
//			/* compute height of each subtree */
//			int leftheight = getheight(d.getLeft());
//			int rightheight = getheight(d.getRight());
//
//			/* use the larger one */
//			if (leftheight > rightheight)
//				return (leftheight + 1);
//			else
//				return (rightheight + 1);
//		}
//	}
//
//	@Override
//	public Element getMax() {  // returns biggest value of tree
//		TreeNode e = root;
//		while(e != null) {
//			if(e.getRight() != null) {
//				e = e.getRight();
//			} else	
//				return e.getElement();
//			}
//		return null;
//	}
//
//	@Override
//	public Element getMin() {  // returns smallest value of tree
//		TreeNode f = root;
//		while(f != null) {
//			if(f.getLeft() != null) {
//				f = f.getLeft();
//			} else	
//				return f.getElement();
//			}
//		return null;
//	}
//	
//	@Override
//	public boolean remove(Element val) {  // removes val from tree
//		return getremove(val, root);
//	}
//	
//	public Treenode getremove(Element val, TreeNode g) {
//		g = root;
//		if( g == null) {
//			return true;
//		} else if(g.getElement().compareTo(val) < 0) {
//			g = g.getRight();
//		} else if(g.getElement().compareTo(val) > 0) {
//			g = g.getLeft();
//		} else {
//			if(g.getLeft() == null && g.getRight() == null) { //case 1 no child
//				g = null;
//				return true;
//			} else if(g.getLeft() == null) { //case 2 one child
//				g = g.getRight();
//				g = null;
//				return true;
//			} else if(g.getRight() == null) {
//				g = g.getLeft();
//				g = null;
//				return true;
//			} else { // case 3 two children 
//				if (root.getLeft() != null && root.getRight() != null) { 
//					TreeNode minNodeForRight = minValue(g.getRight());
//					root.setElement(minNodeForRight.getElement());
//					root.setRight(getremove(root.getRight(), minNodeForRight.getElement()));
//				}
//				}
//		}
//		return false;
//	}
//	
//	public TreeNode minValue(TreeNode n) {
//		TreeNode minV = n;
//		while (n.getLeft() != null) {
//			minV = n.getLeft();
//			n = n.getLeft();
//		}
//		return minV;
//	}
//	
//	@Override
//	public boolean isEmpty() {  // checks if tree is empty
//		return root == null;
//	}
//
//	@Override
//	public void clear() {  // removes all elements from tree
//		if(root != null) {
//			root = null;
//		}
//	}
//
//	@Override
//	public Tree addAll(Tree otherTree) {  // inserts all values from otherTree in tree
//		return addAll(this, ((BinaryTree) otherTree).root);
//	}
//	
//	public Tree addAll(Tree tree, TreeNode otherRoot) {
//		if (otherRoot != null) {// tree not empty
//			tree.insert(otherRoot.getElement());
//			addAll(tree, otherRoot.getLeft());
//			addAll(tree, otherRoot.getRight());
//		}
//		return tree;
//	}
//
//	@Override
//	public void printInorder() {  // prints tree in inorder
//		printInorder(root);
//	} 
//	
//	public void printInorder(TreeNode h) {
//		if (h != null) {	// tree not empty
//			printInorder(h.getLeft());
//			System.out.print(h.getKey() + " ");
//			printInorder(h.getRight());
//		}else 
//			return;
//	} 
//
//	@Override
//	public void printPostorder() {  // prints tree in postorder
//		printPostorder(root);
//	} 
//	
//	public void printPostorder(TreeNode i) {
//		if (i != null) {	// tree not empty
//			printPostorder (i.getLeft());
//			printPostorder (i.getRight());
//			System.out.print(i.getElement());
//		} else 
//			return;
//	}
//
//	@Override
//	public void printPreorder() {  // prints tree in preorder
//        printPreorder(root);
//    }
//
//    private void printPreorder(TreeNode j) {
//        if (j != null) {	// tree not empty
//            System.out.print(j.getKey() + " ");
//            printPreorder(j.getLeft());
//            printPreorder(j.getRight());
//        }
//    }
//
//	@Override
//	public void printLevelorder() {  // prints tree in levelorder
//		int k = height();
//		for (int i = 1; i <= k; i++)
//			printLevelorder(root, i);
//	}
//	
//	public void printLevelorder(TreeNode l, int level) {
//		if (l == null)  // all elements in level 0
//			return;
//		if (level == 1)  // all elements in level 1
//			System.out.print(l.getKey() + " ");
//		else if (level > 1) {  // all elements above level 1
//			printLevelorder(l.getLeft(), level - 1);
//			printLevelorder(l.getRight(), level - 1);
//		}
//	}
//
//	@Override
//	public Tree clone() {  // creates a deep copy of tree
//		BinaryTree copy = new BinaryTree();
//		copy.root = new TreeNode(this.root.getElement());
//		cloneTree(this.root, copy.root);
//		return copy;
//	}
//	
//	void cloneTree(TreeNode root, TreeNode newRoot) {
//		if (root == null) {
//			return;
//		}
//		if (root.getLeft() != null) {
//			newRoot.setLeft(new TreeNode(root.getLeft().getElement()));
//			cloneTree(root.getLeft(), newRoot.getLeft());
//		}
//		if (root.getRight() != null) {
//			newRoot.setRight(new TreeNode(root.getRight().getElement()));
//			cloneTree(root.getRight(), newRoot.getRight());
//		}
//	}
//
//	@Override
//	public boolean equal(Tree otherTree) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public Tree createTree() {
//		return new BinaryTree(); // creates a new Tree
//	}
//
//}