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
        if (this.isEmpty())
            return 0;
        else {
            int leftHeight = this.left.height();
            int rightHeight = this.right.height();
            
            return 1 + Math.max(leftHeight, rightHeight);
        }

    }

    public void add(T item) {
        if (this.isEmpty()) {
            this.root = item;
            this.left = new BST<T>(); // empty tree
            this.right = new BST<T>(); // empty tree
        } else {
            int outcome = item.compareTo(this.root);
            if (outcome < 0)  // item < root
                this.left.add(item); // place the item in the left tree
            else // item > root
                this.right.add(item); // place the item in the right tree        
        }        
    }

    public T min() {
        if (this.isEmpty())
            throw new TreeException("Tree is empty.");

        if (this.left.isEmpty())
            return this.root;
        else 
            return this.left.min();
/* 
        BST<T> tree = this;
        while (!tree.left.isEmpty()) {
            tree = tree.left;
        }
        return tree.root;
*/
    }
   
    public T max() {
        if (this.isEmpty())
            throw new TreeException("Tree is empty.");

        if (this.right.isEmpty())
            return this.root;
        else 
            return this.right.max();
    }

    private void removeRoot() {
        // case 1: leaf
        if (this.left.isEmpty() && this.right.isEmpty()) {
            //this.removeAll();
            this.root = null;
            this.left = null;
            this.right =null;
             // case 2: one child
        } else if (this.left.isEmpty()) {  // promote the right child
            this.root = this.right.root;
            this.left = this.right.left;
            this.right = this.right.right;

        } else if (this.right.isEmpty()) { // promote the left child
            this.root = this.left.root;
            this.left = this.left.left;
            this.right = this.left.right;
        } else { // Case 3: two children
            T replacement = this.right.min();
            this.root = replacement;
            this.right.remove(replacement);
        }

    }
    public void remove(T item) {
        if (this.isEmpty())
            throw new TreeException("Element is not in tree.");

        // Step 1: find the item
        int outcome = item.compareTo(this.root);
        if (outcome < 0)  // item < root
            this.left.remove(item);
        else if (outcome > 0) // item > root
            this.right.remove(item);
        else       // item == root
            this.removeRoot(); // Step 2)

        
    }

    public String preOrder() {
        String s = "";
        if (!this.isEmpty()) {
            s += " " + this.root + " ";
            s += this.left.preOrder();
            s += this.right.preOrder();
        }
        return s;
    }

    public String inOrder() {
        String s = "";
        if (!this.isEmpty()) {     
            s += this.left.inOrder();
            s += " " + this.root + " ";
            s += this.right.inOrder();
        }
        return s;
    }

    public String postOrder() {
        String s = "";
        if (!this.isEmpty()) {     
            s += this.left.postOrder();
            s += this.right.postOrder();
            s += " " + this.root + " ";     
        }
        return s;
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
