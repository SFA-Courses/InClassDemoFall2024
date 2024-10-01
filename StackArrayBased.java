public class StackArrayBased<E> implements StackADT<E> {
    private static final int MAX_CAPACITY = 50;
    private int top; // index for top of stack

    private Object[] items; // holds the stack items.

    // create an empty stack
    public StackArrayBased() {
        this.items = new Object[MAX_CAPACITY];
        this.top = -1; // use -1 to indicate empty
    }
    
    @Override
    public boolean isEmpty() {
        return (this.top == -1);
    }

    public boolean isFull() {
        return (this.top == MAX_CAPACITY-1);
    }

    // add a new item to the stack
    public void push(E newItem) throws StackException {
        if (this.isFull())
            throw new StackException("Stack is full.");

        this.top++; 
        this.items[this.top] = newItem;

    }
    
    // remove and return stack top
    public E pop() throws StackException {
        if (this.isEmpty())
            throw new StackException("Stack is emtpy.");

        // get the top
        E currentTop =  (E) this.items[this.top]; // cast Object to type E
        this.items[this.top] = null; // free up memory (optional)
        this.top--; // remove it from stack

        return currentTop; // return the top
    }

    // returns stack top
    public E peek() throws StackException {
        if (this.isEmpty())
            throw new StackException("Stack is emtpy.");

        return (E) this.items[this.top]; // cast Object to type E
    }

    @Override
    public void popAll() {
        this.top = -1;
        this.items = new Object[MAX_CAPACITY];
    }

    @Override
    public String toString() {
        String s = "[";
        for (int i = top; i >= 0; i--) {
            s = s + this.items[i].toString();
            if (i != 0)
                s = s + ",";
        }
        return s + "]";
    }

}