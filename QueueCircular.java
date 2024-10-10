public class QueueCircular<E> implements QueueADT<E> {   
    private Node<E> last;  // node that is last in the queue

    // create our empty queue
    public QueueCircular() {        
        this.last = null;
    }

    @Override
    public boolean isEmpty() {
        return this.last == null;         
    }

    @Override
    public void dequeueAll() {        
        this.last =null;         
    }

    @Override
    public E peek() throws QueueException {
        if (this.isEmpty())
            throw new QueueException("Queue is empty.");
        
        Node<E> front = this.last.getNext();
        return front.getItem(); // item in the first node
    }

    @Override
    public E dequeue() throws QueueException {
        if (this.isEmpty())
            throw new QueueException("Queue is empty.");

        Node<E> front = this.last.getNext();
        E firstItem = front.getItem();
        this.last.setNext(front.getNext());
        return firstItem;
    }

    @Override
    public void enqueue(E item) {
        Node<E> node = new Node<E>(item);
        if (this.isEmpty())
            this.front = node; 
        else 
            this.last.setNext(node);

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
            
            current = current.getNext();
        }
        return s + "]";
    }

    
    
}
