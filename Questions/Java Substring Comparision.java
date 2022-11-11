import java.util.Arrays;

import org.jcp.xml.dsig.internal.dom.Utils;

/**
 * Hello
 */
public class Hello {

    public static void main(String[] args) {
        String name = "welcometojava";
        int k = 3;
        java.util.List<String> a = new java.util.ArrayList<>();
        for (int i = 0; i <= name.length() - k; i++) {

            a.add(name.substring(i, i + k));

        }

        java.util.Collections.sort(a); // watch it

        String smallest = a.get(0);
        String largest = a.get(a.size() - 1);

        System.out.println(smallest + "\n" + largest);

    }
}
