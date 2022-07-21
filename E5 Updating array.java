import java.text.NumberFormat.Style;
import java.util.Arrays;
import java.util.Scanner;

// Update array

public class HelloWorld {
    
    public static void main(String[] args) {
        String[] menu = {"coffee","burger","chowmin","biriyani","chicken pokoda","cake"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, What you will like to update ?");
        String userInput = scanner.nextLine();
        System.out.println("Enter the index: ");
        int userIndex = scanner.nextInt();
        scanner.close();

        menu[userIndex] = userInput; // update the array.

        System.out.println("Updated Array: " + Arrays.toString(menu));

        // new value add to the menu array.

        // create a new array which can store upto 10 elements.
        String[] newMenu = new String[10];

        // migrating old array to the new one.
        for (int i = 0; i < menu.length; i++) {
            newMenu[i] = menu[i];
        }

        // add new value to the new array.

        newMenu[6] = "Pakhala"; // empty index will fieldup with "null".

        System.out.println("New Menu Array: " + Arrays.toString(newMenu));

        // the empty field will automatically filled with "Null" values.

        
       
    }
}

// we can't increase length of a existing array.
// so we should create another array and merge the array to it.

