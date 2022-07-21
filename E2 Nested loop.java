// Nested loop

public class HelloWorld {
    
    public static void main(String[] args) {

       for(int i=0;i<3;i++){
        System.out.println("Parent Loop!");
        for(int j=0;j<3;j++){
            System.out.println("Child Loop!");
        }
       }
    }
}

// output: 

// Parent Loop!
// Child Loop!
// Child Loop!
// Child Loop!
// Parent Loop!
// Child Loop!
// Child Loop!
// Child Loop!
// Parent Loop!
// Child Loop!
// Child Loop!
// Child Loop!


