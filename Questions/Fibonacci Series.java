import java.text.NumberFormat;
import java.text.NumberFormat.Style;
import java.util.*;

/**
 * Hello
 */
public class Hello {

    public static void main(String[] args) {

        System.out.println("Enter your range ?");

        Scanner scanner = new Scanner(System.in);

        int range = scanner.nextInt();

        int n1 = 0, n2 = 1, n3;

        System.out.print(n1 + " " + n2);

        for (int i = 2; i < range; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);

            n1 = n2;
            n2 = n3;
        }

        scanner.close();

    }

}
