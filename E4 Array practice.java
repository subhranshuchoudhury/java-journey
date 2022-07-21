import java.text.NumberFormat.Style;
import java.util.Scanner;


public class HelloWorld {
    
    public static void main(String[] args) {
        String[] menu = {"coffee","burger","chowmin","biriyani","chicken pokoda","cake"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, What you would like to eat sir ?");
        String userInput = scanner.nextLine();
        scanner.close();

        for (int i = 0; i < menu.length; i++) {
            if(userInput.equals(menu[i])){
                System.out.println("Yes we have " + userInput + " in index " + i+ ".");
                break;
            }
            
        }
        
       
    }
}






