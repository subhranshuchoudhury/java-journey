import java.text.NumberFormat.Style;
import java.util.Arrays;
import java.util.Scanner;

// Java Pedia.

public class HelloWorld {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many historical figures will you register?");
        int fig = scan.nextInt();

        String[][] HistoricalDB = new String[fig][3]; // our column is fixed.

        // store the data.

        for (int i = 0; i < HistoricalDB.length; i++) {
            System.out.println("Figure: " + (i + 1));
            System.out.print("\t- Name: ");
            scan.nextLine();
            HistoricalDB[i][0] = scan.nextLine();
            System.out.print("\t- DOB: ");
            HistoricalDB[i][1] = scan.next();
            System.out.print("\t- Occupation: ");
            HistoricalDB[i][2] = scan.next();
        }

        // show the saved data.
        System.out.println("\nStored data in the database: \n");
        for (int i = 0; i < HistoricalDB.length; i++) {
            System.out.print("[" + (i + 1) + "]: ");
            System.out.print(HistoricalDB[i][0] + "\t");
            System.out.println();
        }

        // ask user if they want to search.

        System.out.println("\nDo you want to search ? (y or n)");
        scan.nextLine();
        String key = scan.nextLine();
        switch (key) {
            case "y":
                System.out.println("Enter name: ");
                String name = scan.nextLine();
                scan.close();
                Boolean flag = false;
                for (int i = 0; i < HistoricalDB.length; i++) {
                    if (name.equals(HistoricalDB[i][0])) {
                        flag = true;
                        System.out.println("Data Found!");
                        System.out.print("Name: " + HistoricalDB[i][0] + "\t");
                        System.out.print("Date of birth: " + HistoricalDB[i][1] + "\t");
                        System.out.print("Occupation: " + HistoricalDB[i][2] + "\t");

                    }
                }
                if (!flag)
                    System.out.println("Sorry, No data found!");
                break;

            default:
                System.exit(0);
        }

    }

}
