public class Friend {
    private String name;
    private boolean status; // true - online, false - offline

    public Friend(String username, boolean onlineStatus) {
        this.name = username;
        this.status = onlineStatus;
    }

    public Friend(String username) {
        this(username, false);
    }
    
    public String getUsername(){
        return this.name;
    }

    public boolean isOnline() {
        return status;
    }

    public void setStatus(boolean online) {
        this.status = online;        
    }

    @Override 
    public boolean equals(Object other) {
        if ( !(other instanceof Friend) )
            return false;

        Friend otherFriend = (Friend) other;
        return this.name.equals(otherFriend.name);
    }

    @Override
    public String toString() {
        String s = this.status ? "Online" : "Offline";        
        return this.name + " " + s;
    }
}
