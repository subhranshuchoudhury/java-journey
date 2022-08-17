import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] kuchVi) {

        // ArrayList

        ArrayList<String> names = new ArrayList<String>();
        names.add("Joe");
        names.add("Kate");

        System.out.println(names.size());

        for (int i = 0; i < names.size(); i++) {
            // getter
            System.out.println("Name: " + names.get(i));
        }

        names.set(0, "Subhranshu Choudhury");

        names.add(2, "Offelia");

        System.out.println(names.get(2));

        names.remove(2);

        names.clear();

        System.out.println(names.size());

        // System.out.println(names.get(0));

        // Array vs ArrayList

        // - use arrays when size is fixed.
        // - use ArrayList where size can vary.
        
        // ArrayList<int> numbers = new ArrayList<int>(); -- error ArrayList can only store objects.
        // ArrayList<Integer> numbers = new ArrayList<Integer>(); -- correct
        // ArrayList can only store objects.



    }
}

// ignore -- previous recap

/*
 * Wrapper: immutable class that wraps around a primitive.
 * Integer - immutable class that wraps around int.
 */
