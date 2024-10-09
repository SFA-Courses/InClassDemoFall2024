public class QueueReferencedBased<E> implements QueueADT<E> {
    private Node<E> front;
    private Node<E> last; 

    // create an empty queue
    public QueueReferencedBased() {
        this.front = null;
        this.last = null; 
    }

    @Override
    public boolean isEmpty() {
        return (this.front == null);
    }

    @Override
    public void dequeueAll() {
        this.front = null;
        this.last = null;         
    }

    @Override
    public E peek() throws QueueException {
        if (this.isEmpty())
            throw new QueueException("Queue is empty.");
        
        return this.front.getItem(); 

    }

    @Override
    public E dequeue() throws QueueException {
        if (this.isEmpty())
            throw new QueueException("Queue is empty.");
        // grab the item at the front
        E item = this.front.getItem();
        // move front to second in line
        this.front = this.front.getNext();
        // return the item 

        return item;

    }

    @Override
    public void enqueue(E item) {
        
        // put the item in a node
        Node<E> node = new Node<E>(item);
        if (this.isEmpty()) 
            this.front = node;
        else 
            this.last.setNext(node);// connect current last item to new node
        
        // update the reference to the last item
        this.last = node;

    }

    @Override
    public String toString() {
        String s = "[";
        Node<E> current = this.front;
        while (current != null) {
            s = s + current.getItem().toString();
            if (current.getNext() != null) 
                s = s + ", ";
            current = current.getNext(); // move to next node
        }
        return s + "]";
    }
}
