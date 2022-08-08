package models;

public class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        if (name == null || name.isBlank() || price < 0 || quantity < 0) {
            throw new IllegalArgumentException("Check the input for name, price and quantity.");
        }
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Item(Item source) {
        this.name = source.name;
        this.price = source.price;
        this.quantity = source.quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank.");
        }
        this.name = name;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.price = price;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        this.quantity = quantity;
    }

    public String toString() {
        return this.name + ": " + this.price + " (" + this.quantity + ")";
    }

}
