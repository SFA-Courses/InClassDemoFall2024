public class QueueOneReference<E> implements QueueADT<E> {    
    private Node<E> last; // last, the next is the front

    // create an empty queue
    public QueueOneReference() {        
        this.last = null; 
    }

    @Override
    public boolean isEmpty() {
        return (this.last == null);
    }

    @Override
    public void dequeueAll() {        
        this.last = null;         
    }

    @Override
    public E peek() throws QueueException {
        if (this.isEmpty())
            throw new QueueException("Queue is empty.");
        
        Node<E> front = this.last.getNext();
        return front.getItem(); 

    }

    @Override
    public E dequeue() throws QueueException {
        if (this.isEmpty())
            throw new QueueException("Queue is empty.");
        
        Node<E> front = this.last.getNext();    
        E item = front.getItem();
        if (front == this.last)  
            this.last = null;      
        else {
            // move front to second in line
            front = front.getNext();        
            this.last.setNext(front);
        }
        
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
