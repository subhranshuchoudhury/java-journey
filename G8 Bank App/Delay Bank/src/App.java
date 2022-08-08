import java.util.Scanner;

import Database.*;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Account[] users = new Account[] { new Account("subhranshu", 8000,
                false, "pass"),
                new Account("baishakhi", 12000, true, "pass") };

        Bank accounts = new Bank(users);

        String name;
        String password;
        System.out.println("\t\t**************************");
        System.out.println("\t\t**************************");
        System.out.println("\t\t****** DELAY  BANK *******");
        System.out.println("\t\t**************************");
        System.out.println("\t\t**************************");

        while (true) {
            System.out.println("Enter Your Banking Details: ");
            System.out.print("Enter your name: ");
            name = scan.nextLine();
            System.out.print("Enter your Password: ");
            password = scan.nextLine();
            if (accounts.getAccountDetails(name, password).equals("404")) {
                System.out.println("\nAuthorization Failed.\n");
                continue;
            }
            System.out.println("\n\n***** Welcome " + name + " *****");
            System.out.println(accounts.getAccountDetails(name, password));
            System.out.println("******************\n");
            break;
        }

        while (true) {
            System.out.print("1. Check Balance\n2. Transfer Money\n3. Exit\n--> ");
            int key = scan.hasNextInt() ? scan.nextInt() : 0;
            switch (key) {
                case 0:
                    System.out.println("Invalid entry.");
                    scan.nextLine();
                    break;
                case 1:
                    System.out.println("Your Account Balance: " + accounts.getSavings(name) + "\n");
                    scan.nextLine();
                    break;
                case 2:
                    System.out.println("***[Transfer Money To Other Accounts]***");
                    scan.nextLine();
                    System.out.print("Enter recipient name: ");
                    String recipientName = scan.nextLine();
                    recipientName = accounts.isValidUser(recipientName) != -1 ? recipientName : null;
                    System.out.print("Enter Amount : ");
                    int send_amount = scan.hasNextInt() ? scan.nextInt() : 0;
                    send_amount = send_amount <= accounts.getSavings(name) ? send_amount : 0;
                    scan.nextLine();

                    if (recipientName == null || name.equals(recipientName)) {
                        System.out.println("Enter valid recipient name.\n");
                        break;
                    } else if (send_amount < 0) {
                        System.out.println("You entered wrong value. (Negative)\n");
                        break;
                    } else if (send_amount == 0) {
                        System.out.println("You have not enough balance. Or transfer should greater than 0.\n");
                        System.out.println("Balance: " + accounts.getSavings(name));
                        break;
                    }

                    // Transfer the money
                    accounts.TransferMoney(name, recipientName, send_amount);
                    System.out.println("\n\n*********\nTransaction Successful..." + "\nBanking Name: " + name
                            + "\nTransaction Amount: " + send_amount + "\nRecipient Name: " + recipientName
                            + "\nClosing Balance: " + accounts.getSavings(name) + "\n*********");
                    break;

                case 3:
                    // System.out.println(accounts.toString());
                    System.exit(0);
                    scan.close();
                default:
                    scan.nextLine();
                    continue;
            }
        }

    }
}
