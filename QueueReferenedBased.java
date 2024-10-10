public class QueueReferenedBased<E> implements QueueADT<E> {

    private Node<E> front; // node that is first
    private Node<E> last;  // node that is last in the queue

    // create our empty queue
    public QueueReferenedBased() {
        this.front = null;
        this.last = null;
    }

    @Override
    public boolean isEmpty() {
        return this.front == null;         
    }

    @Override
    public void dequeueAll() {
        this.front= null;
        this.last =null;         
    }

    @Override
    public E peek() throws QueueException {
        if (this.isEmpty())
            throw new QueueException("Queue is empty.");
        
        return this.front.getItem(); // item in the first node
    }

    @Override
    public E dequeue() throws QueueException {
        if (this.isEmpty())
            throw new QueueException("Queue is empty.");
/*
        if (this.front.getNext() == null) // one element
            this.last = null; 
        if (this.front == this.last) // one element
            this.last = null;
*/
        E firstItem = this.front.getItem();
        this.front = this.front.getNext();
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
