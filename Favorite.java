import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

public class Favorite {
    private Date date;
    private String name;
    private URL url; 

    public Favorite(String name, String address) throws MalformedURLException {
        this.name = name;
        this.url = new URL(address); 
        this.date = new Date();
    }

    @Override
    public String toString() {
        String s = this.name + " " + this.date + "\n";
        return s + url.toString();
    }

}
