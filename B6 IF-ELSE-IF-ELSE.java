// if , else-if , else
import java.util.*;

class ifelseifelse {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Percentage (%): ");
        double percent = scan.nextDouble();
        if(percent < 30){
            System.out.println("F Grade! Failed.:(");
        }else if(percent >30 && percent <= 50){
            System.out.println("C Grade! Passed.");
        }else if(percent > 50 && percent <= 60){
            System.out.println("C+ Grade! Passed.");
        }else if(percent > 60 && percent <= 75){
            System.out.println("B Grade! Passed.");
        }else if(percent > 75 && percent < 90){
            System.out.println("B+ Grade! Passed.");
        }else if(percent >= 90 && percent <= 100){
            System.out.println("A1 Grade! Passed.");
        }else{
            System.out.println("Sorry Wrong Entry!! :(");
        }
        
    }
}
