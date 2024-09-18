public class FriendsList extends ListADT<Friend> {
    private Node<Friend> head;
    private int numFriends;

    public FriendsList() {
        this.head = null;
        this.numFriends = 0;
    }

    public FriendsList(Friend firstFriend) {
        this.head = new Node<Friend>(firstFriend);
        this.numFriends = 1;
    }

    @Override
    public boolean isEmpty() {
        return this.numFriends == 0;
    }

    @Override
    public int size() {
        return this.numFriends;
    }

    @Override
    public void removeAll() {
        // makes all nodes unreachable
        // and thus garbage collected
        this.head = null;
        this.numFriends = 0;
    }

    // Pre : 0 <= i < numItems
    private Node<Friend> getNodeAt(int i) {
        Node<Friend> n = this.head;
        for (int k = 1; k <= i; k++)
            n = n.getNext();

        return n;

    }

    @Override
    public void add(int index, Friend item) throws ListException {
        if (index < 0 || index > this.size())
            throw new ListException("Index " + index + " is invalid for a list of size " + this.size());

        Node<Friend> newFriend = new Node<Friend>(item);
        if (index == 0) {
            newFriend.setNext(this.head);
            this.head = newFriend;
        } else {
            Node<Friend> previous = this.getNodeAt(index - 1);
            Node<Friend> current = previous.getNext();

            // previous should not go to the new Node
            previous.setNext(newFriend);
            newFriend.setNext(current);
        }
        this.numFriends++; 
    }

    @Override
    public Friend get(int index) throws ListException {
        if ((index < 0) || (index >= this.size()))
            throw new ListException("Index " + index + " is invalid for a list of size " + this.size());

        Node<Friend> node = getNodeAt(index);
        return node.getItem();
    }

    @Override
    public void remove(int index) throws ListException {
        if ((index < 0) || (index >= this.size()))
            throw new ListException("Index " + index + " is invalid for a list of size " + this.size());

        if (index == 0)
            this.head = this.head.getNext();
        else {
            Node<Friend> previous = getNodeAt(index - 1);
            Node<Friend> nodeToRemove = previous.getNext();
            Node<Friend> nodeAfter = nodeToRemove.getNext();

            previous.setNext(nodeAfter);
        }
        this.numFriends--;
    }

    @Override
    public String toString() {
        String s = "[";
        if (this.size() != 0) {
            Node<Friend> current = this.head;
            for (int i = 0; i < this.size() - 1; i++) {
                s = s + current.getItem().toString() + ",";
                current = current.getNext();
            }
            s = s + current.getItem().toString();
        }

        return s + "]";
    }

}
