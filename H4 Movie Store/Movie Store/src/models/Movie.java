package models;

public class Movie {
    // 6 fields
    // name, format, rating, sellingPrice, rentalPrice, and isAvailable.
    private String name;
    private String format;
    private double rating;
    private double sellingPrice;
    private double rentalPrice;
    private boolean isAvailable;

    // constructor

    public Movie(String name, String format, double rating) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must contain a value.");
        }
        if (!(format.equals("DVD")) && !(format.equals("Blue-Ray"))) {
            throw new IllegalArgumentException("Format must be DVD or Blue-Ray");
        }
        if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException("Invalid rating.");
        }
        this.isAvailable = true;
        this.sellingPrice = format.equals("Blue-Ray") ? 4.25 : 2.25;
        this.rentalPrice = format.equals("DVD") ? 0.99 : 1.99;
        this.name = name;
        this.rating = rating;
        this.format = format;
    }

    // getter

    public String getName() {
        return name;
    }

    public String getFormat() {
        return format;
    }

    public double getRating() {
        return rating;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // setter

    public void setName(String name) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name should have a value.");
        }
        this.name = name;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setFormat(String format) {
        if (!(format.equals("DVD")) || !(format.equals("Blue-Ray"))) {
            throw new IllegalArgumentException("Format should only DVD or Blue-Ray");
        }
        this.format = format;
        setSellingPrice(format.equals("DVD") ? 2.25 : 4.25);
        setRentalPrice(format.equals("DVD") ? 0.99 : 1.99);
    }

    public void setRating(double rating) {
        if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException("Rating is invalid.");
        }
        this.rating = rating;
    }

    // private: as user has not granted permission to do modification.

    private void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    private void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    // copy constructor

    public Movie(Movie source) {
        this.isAvailable = source.isAvailable;
        this.sellingPrice = source.format.equals("Blue-Ray") ? 4.25 : 2.25;
        this.rentalPrice = source.format.equals("DVD") ? 0.99 : 1.99;
        this.name = source.name;
        this.rating = source.rating;
        this.format = source.format;
    }

    // toString method

    public String toString() {
        return ("\t Name: " + this.name + "\n" + "\t Format: " + this.format + "\n" + "\t Rating: " + this.rating + "\n"
                + "\t Selling Price: " + this.sellingPrice + "\n" + "\t Rental Price: " + this.rentalPrice + "\n"
                + "\t Availability: " + (this.isAvailable ? "In-Stock" : "Rented") + "\n");
    }

}
