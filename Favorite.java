import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

public class Favorite {
    private Date date;
    private String name;
    private URL url;

    public Favorite(String name, String address) throws MalformedURLException {
        this.name = name;
        this.date = new Date(); // current date
        this.url = new URL(address);
    }
    @Override
    public String toString() {
        String s = this.name + " " + this.date + " \n";
        return s + this.url.toString();
    }
}
