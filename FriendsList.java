public class FriendsList implements ListADT<Friend> {
    private Node<Friend> head; // first node in the list (index 0)
    private int numFriends;

    // construct an empty friends list
    public FriendsList() {
        this.numFriends = 0;
        this.head = null;
    }

    // construct a list with one element
    public FriendsList(Friend firstFriend) {
        this.numFriends = 1;
        this.head = new Node<Friend>(firstFriend); // node containing our first friend
    }

    @Override
    public boolean isEmpty() {
        return (this.numFriends == 0);

        // return (this.head == null); // also works
    }

    @Override
    public int size() {
        return this.numFriends;
    }

    
    /**
     * This method returns the index of the friend in the 
     * list. If the friend is not in the list, return -1.
     * @param friend - a friend to look for
     * @return index of friend in the list or -1 if not in list
     */
    public int find(Friend friend) {
        return 42;
    }



    // precondition 0 <= index < size()
    private Node<Friend> getNodeAt(int index) {
        Node<Friend> node = this.head;
        for (int i = 1; i <= index; i++)
            node = node.getNext();

        return node;
    }

    @Override
    public void add(int index, Friend newFriend) throws ListException {
        if (index < 0 || index > size())
            throw new ListException("Index " + index + " invalid for a list of size " + this.size());

        Node<Friend> newNode = new Node<Friend>(newFriend); // node for new friend

        if (index == 0) {
            newNode.setNext(this.head);
            this.head = newNode;
        } else {
            Node<Friend> predecessor = this.getNodeAt(index - 1);
            Node<Friend> successor = predecessor.getNext();
            predecessor.setNext(newNode);
            newNode.setNext(successor);
        }

        this.numFriends++;
    }

    @Override
    public void remove(int index) throws ListException {

        if (index == 0) {
            this.head = this.head.getNext();
        } else {
            Node<Friend> predecessor = this.getNodeAt(index - 1);
            Node<Friend> nodeToRemove = predecessor.getNext();
            Node<Friend> successor = nodeToRemove.getNext();

            predecessor.setNext(successor);
            nodeToRemove.setNext(null); // leaving the list (optional step)
        }
        this.numFriends--;
    }

    @Override
    public void removeAll() {
        this.numFriends = 0;
        this.head = null;
    }

    @Override
    public Friend get(int index) throws ListException {
        if (index < 0 || index >= this.size())
            throw new ListException("Index " + index + " invalid for a list of size " + this.size());

        Node<Friend> node = this.getNodeAt(index);
        return node.getItem(); // this gives us the friend in the node!
    }

    @Override
    public String toString() {
        String s = "[";
        if (!this.isEmpty()) {
            Node<Friend> current = this.head;
            for (int i = 0; i < this.size()-1; i++) {
                s = s + current.getItem().toString() + ", ";
                current = current.getNext();
            }
            s = s + current.getItem().toString();
        }
        return s + "]";

    }

}
