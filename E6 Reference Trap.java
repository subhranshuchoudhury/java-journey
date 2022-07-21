import java.text.NumberFormat.Style;
import java.util.Arrays;
import java.util.Scanner;

// Reference Trap

public class HelloWorld {
    
    public static void main(String[] args) {

        String[] oldFriends = {"Rahul","Babu","Lucky","Raja"};
        String[] newFriends = oldFriends; //it will stores the reference of the oldFriends array.

        newFriends[2] = "Srabana"; // if you change the newFriend then oldFriend also change.


        System.out.println("Old friends: " + Arrays.toString(oldFriends));
        System.out.println("New friends: " + Arrays.toString(newFriends));

        // solution

        // use loop or Arrays.copyOf();
        String[] CopyoldFriends = {"Rahul","Babu","Lucky","Raja"};
        String[] newFriendsFixed = Arrays.copyOf(oldFriends, oldFriends.length); // wow trick.
        newFriendsFixed[2] = "Srabana";
        System.out.println("After Fixed: ");
        System.out.println("Old friends: " + Arrays.toString(CopyoldFriends));
        System.out.println("New friends: " + Arrays.toString(newFriendsFixed));

    }
}

// The state of a varibale should not change because you updated another.

/*
 * Trap: Setting array variables equal to each other.
 * Pitfall: Both variables point to the same array.
 * Solution: Create a new array. Then copy every value using a loop.
 * Solution-II: Set it equal to a copy of the array (Arrays.copyOf(array,array.length)).
 */

