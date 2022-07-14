// Scanner P-I
import java.util.Scanner; // import the scanner 

class ScannerP1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); // declare it and create a object of it.
        
        int age;
        System.out.println("Enter Your Age: \n");
        age = scan.nextInt();
        scan.nextLine(); // This is to consume the enter key.
        System.out.println("Age:---> " + age);
        

        System.out.println("\nEnter Your Name: ");
        String name = scan.nextLine();
        scan.close(); // to close the scanner prevent memory leak.
        System.out.println("Name:---> " + name);
        
        // nextDouble()
        
        
    }
}
// Error solution: Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH)
// if error occured: https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo

