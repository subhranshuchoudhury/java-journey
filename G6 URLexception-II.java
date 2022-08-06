import java.net.MalformedURLException;
import java.net.URL;

public class App {
    public static void main(String[] args) {
        try {
            ParseUrl("https://about.me/subhranshu");
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void ParseUrl(String linkurl) throws MalformedURLException {
        URL url = new URL(linkurl);
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
        System.out.println("Path: " + url.getPath());

    }
}
