public class StackReferencedBased<E> implements StackADT<E> {
    
    private Node<E> top;

    public StackReferencedBased() {
        this.top = null; // creating an empty stack
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
    public E peek() throws StackException {
        if (this.isEmpty())
            throw new StackException("Stack is empty.");

        return this.top.getItem();
    }

    @Override
    public void push(E newItem) {
       Node<E> newTop = new Node<E>(newItem);
       newTop.setNext(this.top);
       this.top = newTop;
    }

    @Override
    public E pop() throws StackException {
        if (this.isEmpty())
            throw new StackException("Stack is empty.");

        E item = this.top.getItem();
        this.top = this.top.getNext();
        return item;

    }

    @Override
    public String toString() {
        String s = "[";
        Node<E> current = this.top; // traversal node
        while (current != null) { // end of stack
            E item = current.getItem();
            s = s + item.toString();
            
            // move to the next node
            current = current.getNext(); 
            
            if (current != null) // don't add a ","
               s = s + ", ";
            
            
        }
        return s + "]";
    }
   

   
}
