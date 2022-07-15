// Switch statements

import java.util.*;

class Switch{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int day;
        
        System.out.println("Enter day number between (1 to 7): ");
        day = scan.nextInt();
        
        switch(day)
        {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
            if(day > 7 || day < 1){
                System.out.println("Invalid entry! Kindly enter a number between 1 to 7");
            }
        }
    }
}
