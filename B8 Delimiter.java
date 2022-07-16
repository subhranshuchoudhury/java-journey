// Delimiter - white space that separate input data.
import java.util.Scanner;
class delimiter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter two int numbers in one line: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Enter two long numbers in one line: ");
        long num3 = scan.nextLong();
        long num4 = scan.nextLong();
        System.out.println("Enter two double numbers in one line: ");
        double num5 = scan.nextDouble();
        double num6 = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter two words in one line: ");
        String name1 = scan.nextLine();
        String name2 = scan.NextLine(); // or scan.next();
        scan.close();
        
        // outputs
        
        System.out.println("___________OUTPUT__________\n");
        
        System.out.println("\nIntegers: " + num1 + "\t," + num2);
        System.out.println("\nLongs: " + num3 + "\t," + num4);
        System.out.println("\nDouble: " + num5 + "\t," + num6);
        System.out.println("\nWords: " + name1 + "\t," + name2);
    }
}

/*

when use scan.nextLine() it will actually consume the white
space after the input means. if input is only a. then after
the "a". console have white spaces right of it. and the 
whitespace will further inputed as nextLine();

how to solve this:

before our orginal nextLine(), we have to throwaway another dummy nextLine() to consume the white space.

scan.nextLine() // dummy
variable = scan.nextLine() // original

*/
