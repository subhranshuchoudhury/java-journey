import java.net.MalformedURLException;
import java.net.URL;

public class App {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com/images");
            System.out.println(url.getProtocol());
            System.out.println(url.getHost());
            
            
        }  catch (MalformedURLException e) {
            System.out.println(e.getMessage());
            
    }
}
}
