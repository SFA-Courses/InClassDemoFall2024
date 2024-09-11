public interface ListADT<E> {
    public boolean isEmpty();
    public int size(); 
    public void add(int index, E item) throws ListException;
    public void remove(int index) throws ListException;
    public void removeAll();
    public E get(int index) throws ListException;
}
