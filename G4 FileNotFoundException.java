import java.io.FileInputStream; // to read data from files.
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            FileInputStream fStream = new FileInputStream("src/g.txt");
            Scanner scanner = new Scanner(fStream);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) { // (Exception e)--> can be
            System.out.println(e.getMessage());
        }
    }
}
