// while


import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner scan = new Scanner (System.in);
    String password = "1234";
    String input = "";

    while (!input.equals (password))
      {
	System.out.println ("Enter password: ");
	input = scan.nextLine ();
      }
    System.out.println ("Correct password!");


  }
}

// while - condition must be true for execution of code.
// we use while when we not clear about how many time the loop will run.
