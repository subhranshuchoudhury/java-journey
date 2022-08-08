import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import models.Item;
import models.Machine;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\t************************************************");
        System.out.println("\t             WELCOME TO JAVA DRINKS!            ");
        System.out.println("\t************************************************");

        Item[][] items = new Item[][] {
                { new Item("Pepsi", 1.99, 3), new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) },
                { new Item("Fanta", 1.99, 2), new Item("Barq's", 1.49, 2), new Item("A & W", 2.49, 3) },
                { new Item("Crush", 1.99, 2), new Item("C-Cola", 1.49, 2), new Item("Berry", 2.49, 1) }
        };

        Machine machine = new Machine(items);

        System.out.println(machine);

        while (true) {
            System.out.print("Pick a row: ");
            int row = scan.hasNextInt() ? scan.nextInt() : 404;
            scan.nextLine();

            System.out.print("Pick a spot in the row: ");
            int spot = scan.hasNextInt() ? scan.nextInt() : 404;
            scan.nextLine();

            if (row == 404 || spot == 404) {
                System.out.println("Invalid entry.");
                continue;
            } else if (row < 0 || spot < 0 || machine.getLength() - 1 < row || machine.getRow() - 1 < spot) {
                System.out.println("Invalid range.");
                continue;
            } else if (machine.getItem(row, spot).getQuantity() == 0) {
                System.out.println("Empty Slot.");
                continue;
            }

            machine.dispense(row, spot);
            System.out.println("\n" + machine);
            System.out.print("\nEnjoy your drink! Press 1 to purchase another: ");
            if (!scan.next().equalsIgnoreCase("1")) {
                break;
            }
        }
        scan.close();
    }
}
