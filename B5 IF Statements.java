// if statement

class StatementIf {
    public static void main(String[] args) {
        int grade = 40;
        
        if(grade > 60) // no need of {} curly braces if there is only one statement id to execute.
        System.out.println("Great Job!");
        else
        System.out.println("Try Harder.. Better luck next time!");
        
        double mark = 400;
        
        if(mark > 300){ // more than one statement needs curly {} braces.
            System.out.println("Great Job! You Passes.");
            System.out.println("\nPercentage: " + (mark/600)*100);
        }
    } 
}
