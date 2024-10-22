public class BST<T extends Comparable<T>> {
    private T root;
    private BST<T> left; // left subtree
    private BST<T> right; // right subtree
  
    // construct an empty tree
    public BST() {
        this.root = null;
        this.left = null;
        this.right = null;
    }

    // construct a singleton tree (just has a root)
    public BST(T rootItem) {
        this.root = rootItem;
        this.left = new BST<T>(); // empty subtree
        this.right = new BST<T>(); // empty subtree
    }

    public boolean isEmpty() {
        return (this.root == null);
    }

    public void removeAll() {
        this.root = null; 
        this.right = null;
        this.left = null;
    }

    // return the number of elements in the tree
    public int size() {
        if (this.isEmpty())
            return 0;
        else // compute the size of the tree 
            return 1 + this.left.size() + this.right.size();
        
    }

    // find the height of the tree
    public int height() {

        
    }


   
    public String toString() {
        StringBuilder buffer = new StringBuilder(50);
        if (!this.isEmpty())
            buildTreeString(buffer, "", "");
        return buffer.toString();
    }
    
    private void buildTreeString(StringBuilder buffer, String prefix, String childrenPrefix) {
        buffer.append(prefix);
        buffer.append(this.root.toString());
        buffer.append('\n');
        if (!this.left.isEmpty()) 
            if (!this.right.isEmpty())
                left.buildTreeString(buffer, childrenPrefix + "├── ", childrenPrefix + "│   ");
            else
                left.buildTreeString(buffer, childrenPrefix + "└── ", childrenPrefix + "    ");
        
        if (!this.right.isEmpty())
            right.buildTreeString(buffer, childrenPrefix + "└── ", childrenPrefix + "    ");
    }


}
