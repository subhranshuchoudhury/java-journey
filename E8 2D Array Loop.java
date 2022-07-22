
import java.util.Arrays;

// 2D Array Loop.

public class HelloWorld {
    
    public static void main(String[] args) {

        
        
        String[][] priceTable = {
            {"Baking: ","12.99","8.99","3.45","4.23","5.7"},
            {"Beverage: ", "2.44","4.5","6.7","3.2","1.2"},
            {"Cerals: ","12.99","8.99","3.45","3.2","1.2"}
        };
        
        // looping the array.

        for (int i = 0; i < priceTable.length; i++) { // i refers to row.
            for (int j = 0; j < priceTable[i].length; j++) { // j refers to column.
                System.out.print(priceTable[i][j]  + "\t");
            }
            System.out.println();
        }
    }

    
}


