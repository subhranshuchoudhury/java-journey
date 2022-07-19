
// loop game.
import java.util.Scanner;

public class HelloWorld {
    // global variables
    static int points = 0;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Collect at least 3 points to win. Enter anything to roll: ");
        System.out.println("Great, here are the rules:\n");
        System.out.println(" - If you roll a 6 the game stops.");
        System.out.println(" - If you roll a 4 nothing happens.");
        System.out.println(" - Otherwise, you get 1 point.\n");
        System.out.println("You must collect at least 3 points to win. Enter anything to roll:");

        scan.nextLine();
        startGame();

    }

    public static void startGame() {

        int dice = rollTheDice();

        while (true) {
            switch (dice) {
                case 6:
                    System.out.println("You rolled a 6. End of game.");
                    exitGame();
                    break;

                case 4:
                    System.out.println("You rolled a 4. Zero points. Keep rolling.");
                    break;

                default:
                    System.out.println("You rolled a " + dice + ". One point. Keep rolling.");
                    points++;

            }
            dice = rollTheDice();
            scan.nextLine();
        }

    }

    public static int rollTheDice() {
        double dice = (Math.random() * 6) + 1;
        return (int) dice;

    }

    public static void exitGame() {
        System.out.println("\n\nGame Over!\nYour Score: " + points);
        if (points >= 3) {
            System.out.println("Wow, You are the Winner!");
        } else {
            System.out.println("You lose the game!");
        }
        System.exit(0);

    }
}

/**
 * make 3 points to win.
 * if roll dice: 4 then nothing counts.
 * if roll dice: 6 then the game ends.
 * other dice roll will get each one point.
 */
