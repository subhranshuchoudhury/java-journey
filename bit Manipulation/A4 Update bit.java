import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        sc.close();
        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;

        if (choice == 1) { // set bit
            System.out.println("Result: " + (bitMask | n));
        } else { // for 0.
            bitMask = ~(bitMask);
            System.out.println("Result: " + (bitMask & n));
        }
    }
}
