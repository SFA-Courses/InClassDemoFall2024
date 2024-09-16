public class Node<E> {

    private E item; // list item in this node
    private Node<E> nextNode; // node with the next item

    public Node(E nodeItem) {
        this.item = nodeItem;
        this.nextNode = null;
    }

    public E getItem() {
        return this.item;
    }

    public Node<E> getNext() {
        return this.nextNode;
    }

    public void setNext(Node<E> nextNode) {
        this.nextNode = nextNode;
    }
    
    @Override
    public String toString() {
        if (this.nextNode == null)
            return "(" + this.item.toString() + ", null)";
        else {
            String restOfList = this.nextNode.toString();
            return "(" + this.item.toString() + ", " + restOfList + ")";
        }
    }
}
