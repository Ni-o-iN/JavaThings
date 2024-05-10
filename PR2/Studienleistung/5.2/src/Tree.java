public interface Tree<A> extends Iterable<Object> { // only int values stored in tree

    public boolean insert(A val); // inserts val in tree.

    boolean insertFromFile(String filename); // inserts objects from file in tree
    // returns true if at least one element on file is really inserted

    boolean saveToFile(String filename); // stores objects from tree in file

    boolean contains(A val); // checks if value is in tree

    int size(); // computes number of values in tree

    int height(); // computes height of tree

    Element getMax(); // returns biggest value of tree

    Element getMin(); // returns smallest value of tree

    boolean remove(A val); // removes value from tree

    boolean isEmpty(); // checks if tree is empty

    void clear(); // removes all elements from tree

    Tree<A> addAll(Tree<A> otherTree); // inserts all values from
                                    // otherTree in tree

    void printInorder(); // prints tree in inorder

    void printPostorder(); // prints tree in postorder

    void printPreorder(); // prints tree in preorder

    void printLevelorder(); // prints tree in levelorder

    Tree<A> clone(); // creates a deep copy of tree

    boolean equals(Object other); // tests for structurally equivalence
                                    // element by element

    boolean equal(Tree<A> otherTree); // equivalence
                                    // with regards to content

    Tree<A> createTree(); // creates a new Tree

    void visualize(); // visualizes tree
}