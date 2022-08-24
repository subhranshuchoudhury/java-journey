package models;

import java.util.ArrayList;

public class Store {
    ArrayList<Movie> movies; // ArrayList as movie can remove & can added.

    public Store() {
        this.movies = new ArrayList<Movie>();
    }

    public Movie getMovie(int index) {
        return new Movie(this.movies.get(index));
    }

    public Movie getMovie(String name) {
        for (int i = 0; i < this.movies.size(); i++) {
            if (this.movies.get(i).getName().equals(name)) {
                return new Movie(this.movies.get(i));
            }
        }
        return null; // when the loop did not find any result.

    }

    public void setMovie(int index, Movie movie) {
        this.movies.set(index, new Movie(movie));
    }

    public void addMovie(Movie movie) {
        this.movies.add(new Movie(movie));
    }

    public void action(String name, String action) {
        if (this.movies.isEmpty()) {
            throw new IllegalStateException("Store is not in a valid state.");
        }
        if (!(action.equals("sell")) && !(action.equals("rent")) && !(action.equals("return"))) {
            throw new IllegalArgumentException("action must be sell,rent or return.");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name cannot be null or blank.");
        }
        for (int i = 0; i < this.movies.size(); i++) {
            if (movies.get(i).getName().equals(name)) {
                switch (action) {
                    case "sell":
                        if (!(movies.get(i).isAvailable())) {
                            throw new IllegalStateException("Movie is not available for sell.");
                        }
                        this.movies.remove(i);
                        break;

                    case "rent":
                        this.movies.get(i).setAvailable(false);
                        break;

                    case "return":
                        this.movies.get(i).setAvailable(true);
                        break;
                }
            }
        }
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.movies.size(); i++) {
            temp += this.movies.get(i).toString();
            temp += "\n\n";
        }
        return temp;
    }
}
