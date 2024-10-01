public interface StackADT<E> {
    // determine if the stack is empty
    public boolean isEmpty();

    // add a new item to the stack
    public void push(E newItem);
    
    // remove and return stack top
    public E pop() throws StackException;

    // returns stack top
    public E peek() throws StackException;

    public void popAll();
}