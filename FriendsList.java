public class FriendsList implements ListADT<Friend> {

    private Node<Friend> head; // first node in the list
    private int numFriends; 
    // empty friends list
    public FriendsList() {
        this.numFriends = 0;
        this.head = null;
    }
    // friends list with 1 element
    public FriendsList(Friend firstFriend) {
        this.numFriends= 1;
        this.head = new Node<Friend>(firstFriend);
    }


    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public void add(int index, Friend item) throws ListException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public void remove(int index) throws ListException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public void removeAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeAll'");
    }

    @Override
    public Friend get(int index) throws ListException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }
    
}
