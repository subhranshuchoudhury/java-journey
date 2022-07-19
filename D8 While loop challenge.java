import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String username = "Subhranshu";
        String password = "1234";
        String inputUsername = "";
        String inputPassword = "";

    

        while (!username.equals(inputUsername) && !password.equals(inputPassword)) {
            System.out.print("- Username: ");
            inputUsername = scan.nextLine();
            System.out.print("- Password: ");
            inputPassword = scan.nextLine();

            if(!inputUsername.equals(username) && !inputPassword.equals(password)){
                System.out.println("Incorrect, try again!");
            }
        }

        System.out.println("User logged-In !");

    }
}
