import java.text.NumberFormat.Style;
import java.util.Arrays;
import java.util.Scanner;

// 

public class HelloWorld {
    
    public static void main(String[] args) {

        
        
        String[][] priceTable = {
            {"Baking: ","12.99","8.99","3.45","4.23","5.7"},
            {"Beverage: ", "2.44","4.5","6.7","3.2","1.2"},
            {"Cerals: ","12.99","8.99","3.45","3.2","1.2"}
        };

        for (int i = 0; i < priceTable.length; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print(priceTable[i][j]  + "\t");
            }
            System.out.println();
        }
    }

    
}


