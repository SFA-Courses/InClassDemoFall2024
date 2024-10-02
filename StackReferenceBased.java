public class StackReferenceBased<E> implements StackADT<E> {
    private Node<E> top;

    public StackReferenceBased() {
        this.top = null;
    }

    @Override
    public boolean isEmpty() {
        return (this.top == null);
    }

    @Override
    public void popAll() {
        this.top = null;
    }

    @Override
    public void push(E newItem) {
        Node<E> node = new Node<E>(newItem); // 1) create a new node to hold the item
        node.setNext(this.top); // 2) have the node point to the "old" top
        this.top = node; // 3) place the new node at the top
    }

    @Override
    public E pop() throws StackException {
        Node<E> currentTop = this.top;
        this.top = currentTop.getNext();
        return currentTop.getItem();

        // alternate way
        //E item = this.top.getItem();
        //this.top = this.top.getNext();
        //return item;
    }

    @Override
    public E peek() throws StackException {
        if (this.isEmpty())
            throw new StackException("Stack is empty.");

        return this.top.getItem();
    }

    @Override
    public String toString() {
        String s = "[";
        Node<E> current = this.top;
        while (current != null) {            
            s = s + current.getItem().toString();
            current = current.getNext();
            if (current != null) 
                s = s + ", ";
        }
        return s + "]";
    }

    public void reverseStack() {
        StackReferenceBased<E> helper = new StackReferenceBased<E>();
        while (!this.isEmpty()) {
            helper.push(this.pop());
        }        
        this.top = helper.top;
    }

}
