import java.text.NumberFormat.Style;
import java.util.Arrays;
import java.util.Scanner;

// Store data in 2D array and retrive it.

public class HelloWorld {
    
    public static void main(String[] args) {

        int[][] numberStore = new int[10][10];
      
      // store data into the 2D array.

        for (int i = 0; i < numberStore.length; i++) {
            for (int j = 0; j < numberStore.length; j++) {
                numberStore[i][j] = randomGenerate();
            }
        }
      
      // retrieve the stored data.

        System.out.println("Stored Number are: ");

        for (int i = 0; i < numberStore.length; i++) {
            for (int j = 0; j < numberStore.length; j++) {
                System.out.print(numberStore[i][j] + "\t");
            }
            System.out.println();
        }
        
        
    }

    public static int randomGenerate() {

        double random = Math.random()*101;
        return (int)random;
        
    }

    
}


