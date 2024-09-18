
public class TestFriendList {
    public static void main(String[] args) throws ListException {
        FriendsList friendList = new FriendsList();
        System.out.println("Testing add: ");
        friendList.add(0, new Friend("bob", false));
        friendList.add(1, new Friend("Lezduit", true));
        friendList.add(2, new Friend("Joe", true));
        System.out.println(friendList.toString());

        System.out.println();
        System.out.println("Testing remove: ");
        friendList.remove(2);
        System.out.println(friendList);

        System.out.println();
        System.out.println("Testing remove all: ");
        friendList.removeAll();
        System.out.println(friendList);
    }
}
