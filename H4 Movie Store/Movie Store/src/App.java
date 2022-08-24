import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.naming.ldap.ManageReferralControl;

import models.Movie;
import models.Store;

public class App {

    static Store store = new Store();

    public static void main(String[] args) throws Exception {

        // --> when don't have the Store class.
        // Movie movie = new Movie("The Shawshank Redemption", "Blue-Ray", 9.2);
        // movie.setFormat("DVD");
        // Movie movie2 = new Movie(movie);
        // System.out.println(movie2);

        // --> when we have the Store class
        // store.addMovie(new Movie("Mirage", "Blue-Ray", 9.1));
        // store.action("Mirage", "rent");
        // System.out.println(store);

        // --> from a local file.
        try {
            loadMovies("C:/Users/subhr/Desktop/MOVIE STORE/Movie Store/src/movieDB.txt");
            System.out.println("Movie loaded... 100%");
            System.out.println(store);
            manageMovies();
        } catch (Exception e) {
            System.out.println("File Error: " + e);
        }
    }

    // function to read data from a file.

    public static void loadMovies(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scannedFile = new Scanner(fis);
        while (scannedFile.hasNextLine()) {
            String movieLine = scannedFile.nextLine();
            String[] movieTerms = movieLine.split("--");
            store.addMovie(new Movie(movieTerms[0], movieTerms[1], Double.parseDouble(movieTerms[2]))); // [0] - movie
                                                                                                        // name,[1] -
                                                                                                        // rating,[2]
                                                                                                        // - format
        }
        scannedFile.close();
    }

    // function to ask user to manage the movie store.

    public static void manageMovies() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("\nWould you like to \n\ta) purchase\n\tb) rent \n\tc) return.");
            String response = scan.nextLine();

            if (!(response.equals("a") || response.equals("b") || response.equals("c"))) {
                scan.close();
                break;
            }

            System.out.print("Enter the name of the movie: ");
            String name = scan.nextLine();
            // if (store.getMovie(name) == null) {
            // System.out.println("\n\nThe input you provided is not valid. Please try
            // again\n");
            // continue;
            // }

            switch (response) {
                case "a":
                    if (!(store.getMovie(name).isAvailable())) {
                        System.out.println("\n\n\n\nThe movie is not available for purchase. Please try again\n");
                        continue;
                    }
                    store.action(name, "sell");
                    break;
                case "b":
                    store.action(name, "rent");
                    break;
                case "c":
                    store.action(name, "return");
                    break;
            }
            System.out.println("\n\nUPDATED MOVIES\n\n" + store);
        }
    }
}
