public interface QueueADT<E> {
    public boolean isEmpty();
    public void dequeueAll();
    public E peek() throws QueueException;
    public E dequeue() throws QueueException;
    public void enqueue(E item);
}
