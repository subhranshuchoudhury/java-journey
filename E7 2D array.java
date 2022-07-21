import java.text.NumberFormat.Style;
import java.util.Arrays;
import java.util.Scanner;

// 2D Array

public class HelloWorld {
    
    public static void main(String[] args) {

        int[][] grades = new int[3][4]; // 3-row, 4-column
        
        // updating the 2D array

        grades[0][0] = 1; // row 1 and column 1
        grades[0][1] = 2; // row 1 and column 2
        grades[0][2] = 5; // row 1 and column 3
        //...



        System.out.println(Arrays.toString(grades[0]));
        System.out.println(Arrays.toString(grades[1]));
        System.out.println(Arrays.toString(grades[2]));

        // Another Way
        System.out.println("\n\nAnother way: \n\n");

        int[][] grades2 = {
            {1,32,3,45},
            {4,53,63,32},
            {23,45,67,21}
        };

        System.out.println("Row 1: " + grades2[0][0] + " " + grades2[0][1] + " " + grades2[0][2] + " " + grades2[0][3]);
      //...

    }
}


