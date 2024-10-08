public class QueueArrayBased<E> implements QueueADT<E> {
    private static final int MAX_CAPACITY = 50;

    private Object[] queueArray; // items of the array
    private int size; // size of the array

    // create an empty queue
    public QueueArrayBased() {
        this.size = 0;
        this.queueArray = new Object[MAX_CAPACITY];
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean isFull() {
        return this.size == MAX_CAPACITY;
    }

    @Override
    public void removeAll() {
        this.size = 0;
        this.queueArray = new Object[MAX_CAPACITY];
    }

    @Override
    public E peek() throws QueueException {
        if (this.isEmpty())
            throw new QueueException("Queue is empty.");

        return (E) this.queueArray[0];
    }

    @Override
    public E dequeue() throws QueueException {
        if (this.isEmpty())
            throw new QueueException("Queue is empty.");

        // retrieve the item
        E returnItem = (E) this.queueArray[0];

        // remove the first element from queue
        this.queueArray[0] = null;

        // shift the elements
        for (int i = 1; i < this.size; i++) 
            this.queueArray[i-1] = this.queueArray[i];
        // decrease the size
        this.size--;

        // return the item
        return returnItem;

    }

    @Override
    public void enqueue(E item) {
        if (this.isFull())
            throw new QueueException("Queue is full.");

        this.queueArray[size] = item; // add the item to the end
        this.size++; // increase the size
    }

    @Override
    public String toString() {
        String s = "[";
        for (int i =0; i < this.size; i++) {
            s = s + this.queueArray[i].toString();
            if (i != size-1) 
                s = s + ", ";
        }
        return s + "]";
    }
}
