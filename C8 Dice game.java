// Dice Game!

import java.util.Scanner;
public class RollDice{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers between 1 and 6: ");
        
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int humanSum = num1+num2+num3;
        scan.close();
        
        System.out.println("Computer's turn: \n");
        
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();
        int computerSum = roll1+roll2+roll3;
        
        System.out.println("Your entries: " + num1 + " " + num2 + " " + num3);
        System.out.println("Computer's entries: " + roll1 + " " + roll2 + " " + roll3);
        
        if(humanSum > 18 || humanSum < 1){
            System.out.println("Check your entries!\nEntries should in the range of 1 to 6.");
            System.exit(0);
        }
        
        if(humanSum > computerSum){
            System.out.println("You Won!");
        }else if(humanSum == computerSum){
            System.out.println("Tie! No Winner..!");
        }else{
            System.out.println("Computer Won!");
        }
        
    }
    
    public static int rollDice(){
        double random = (Math.random()*6)+1;
        return (int)random;
        
 
    }
    
}
