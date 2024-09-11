public class Friend {
    private String username;
    private boolean online;

    public Friend(String name, boolean status) {
        this.username = name;
        this.online = status;
    }

    public Friend(String name) {
        this(name, false);
    }

    public String getUsername() {
        return this.username;
    }

    public void setStatus(boolean online) {
        this.online = online;
    }

    public boolean isOnline() {
        return this.online;
    }

    @Override
    public String toString() {
        String s = this.online ? "Online" : "Offline";
/* 
        String s; 
        if (this.online)
            s = "Online";
        else 
            s = "Offline";
        */


        return this.username + " " + s;
    }
}
