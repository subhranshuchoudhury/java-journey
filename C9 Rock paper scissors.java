import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner scan = new Scanner (System.in);
      System.out.println ("[- Rock Paper Scissors -]");

      System.out.println ("Are you ready to play ? (y or n):");
    String choice = scan.next ();

    switch (choice)
      {
      case "y":
	int gotDraw = draw ();
	  System.out.println
	  ("Enter Your choice: \nRock (R), Paper (P), Scissors (S): ");
	String userDraw = scan.next ();
	  checkWin (gotDraw, userDraw);
	  break;
	case "n":System.out.println ("Game closed!");
	  System.exit (0);
	  break;
	default:System.exit (0);
      }
  }
  public static int draw ()
  {

    double draw = (Math.random () * 3) + 1;
    return (int) draw;

  }
  // num == Integer.parseInt(str) convert string to num.
  public static void checkWin (int gotDraw, String userDraw)
  {
    int uDraw = 0;
    switch (userDraw)
      {
      case "R":
	uDraw = 1;
	break;
      case "P":
	uDraw = 2;
	break;
      case "S":
	uDraw = 3;
	break;
      default:
	System.out.println ("User's choice is invalid!");
	System.exit (0);
      }

    System.out.println ("Your Choice: " + userDraw);
    switch (gotDraw)
      {
      case 1:
	System.out.println ("Computer Choice: R (Rock)");
	break;
      case 2:
	System.out.println ("Computer Choice: P (Paper)");
	break;
      case 3:
	System.out.println ("Computer Choice: S (Scissor)");
	break;
      default:
	System.exit (0);
      }
    System.out.println ("\n\n\n");
    if (gotDraw == uDraw)
      {
	System.out.println ("Game Draw!");
      }
    else if (gotDraw == 1 && uDraw == 2)
      {
	System.out.println ("Congrats!, You won!");
      }
    else if (gotDraw == 1 && uDraw == 3)
      {
	System.out.println ("Sorry!, You lose!");
      }
    else if (gotDraw == 2 && uDraw == 1)
      {
	System.out.println ("Sorry!, You lose!");
      }
    else if (gotDraw == 2 && uDraw == 3)
      {
	System.out.println ("Congrats!, You won!");
      }
    else if (gotDraw == 3 && uDraw == 1)
      {
	System.out.println ("Congrats!, You won!");
      }
    else if (gotDraw == 3 && uDraw == 2)
      {
	System.out.println ("Sorry!, You lose!");
      }
  }
}
