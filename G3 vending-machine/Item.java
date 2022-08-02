public class Item {
    private String name;
    private double price;
    private int quantity;

    // constructor

    public Item(String name,double price,int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // getter

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    // setter

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // copy constructor

    public Item(Item source){
        this.name = source.name;
        this.price = source.price;
        this.quantity = source.quantity;
    }

    // toString

    
    public String toString() {
        return this.name + " : " + this.price + " : (" + this.quantity + ")";
    }

}
