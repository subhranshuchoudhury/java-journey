// break and continue.

// import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args){
        // Scanner scan = new Scanner(System.in);

        for(int i=0;i<10;i++){

            if(i%2==0){
                System.out.println(i);
                continue; // it will not print the outer code.
                // break; // output: 0
            }
            System.out.println("Outer of If.");

        }

    }
}

// continue - skips a run, and continues to the next one.
// break - it break the loop. and stops further execution.
