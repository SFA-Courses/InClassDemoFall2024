public class FriendsList implements ListADT<Friend> {
    private Node<Friend> head;
    private int numFriends;

    // empty
    public FriendsList() {
        this.head = null;
        this.numFriends = 0;
    }

    // list with one element
    public FriendsList(Friend firstFriend) {
        this.numFriends = 1;
        this.head = new Node<Friend>(firstFriend);
    }

    @Override
    public boolean isEmpty() {
        return (this.numFriends == 0);
        // return (this.head == null); // would work
        // return (this.size() == 0); // would also work
    }

    @Override
    public int size() {
        return this.numFriends;
    }

    private Node<Friend> getNodeAt(int index) {
        Node<Friend> node = this.head;
        for (int k = 1; k <= index; k++)
            node = node.getNext();

        return node;
    }

    @Override
    public void add(int index, Friend newFriend) throws ListException {
        if (index < 0 || index > this.size())
            throw new ListException("Index out of range.");
        // make a Node for my newFriend
        Node<Friend> newNode = new Node<Friend>(newFriend);

        // new best friend - index 0
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
        if (index < 0 || index >= size())
            throw new ListException("Index " + index + " is out of range for a list of size " + this.size());

        if (index == 0) {
            this.head = this.head.getNext();
        } else {
            Node<Friend> predecessor = this.getNodeAt(index - 1);
            Node<Friend> nodeToRemove = predecessor.getNext();
            Node<Friend> successor = nodeToRemove.getNext();

            predecessor.setNext(successor);
            nodeToRemove.setNext(null);
        }

        this.numFriends--;
    }

    @Override
    public void removeAll() {
        this.head = null;
        this.numFriends = 0;
    }

    @Override
    public Friend get(int index) throws ListException {
        if (index < 0 || index >= size())
            throw new ListException("Index " + index + " is out of range for a list of size " + this.size());

        Node<Friend> node = this.getNodeAt(index);
        return node.getItem();

        // return this.getNodeAt(index).getItem();
    }

    @Override
    public String toString() {
        String s = "[";
        if (!this.isEmpty()) {
            Node<Friend> current = this.head;
            for (int i = 0; i < size() - 1; i++) {
                s = s + current.getItem().toString() + ", ";
                current = current.getNext();
            }
            s = s + current.getItem().toString();
        }
        return s + "]";
    }

}
