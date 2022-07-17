// if-else-switch
import java.util.*;

class Program{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Area (A) or Permimeter (P) ? :");
        String choice = scan.nextLine();
        System.out.println("Enter Length :");
        double length = scan.nextDouble();
        System.out.println("Enter Width :");
        double width = scan.nextDouble();
        scan.close();
        
        Calculate(length,width,choice);
        
    }
    public static void Calculate(double length,double width,String option){
        
        if(length < 0 || width < 0){
            System.out.println("Length or Width must be a positive value.");
            System.exit(0); // shut everything. end the further code.
            
        }
        
        switch(option){
            case "A":
                System.out.println("Area: " + (length*width) + "  unit sq.");
                break;
            case "P":
                System.out.println("Perimeter: " + (2*(length+width)) + "  unit sq.");
                break;
            default:
            System.out.println("Invalid Choice!");
        }
        
    }
}
