/**
 * App
 */
public class App {

    public static void main(String[] args) {

        Car TATA = new Car("TATA", 790000, 2012, "red");
        TATA.setMake("Ford");
        TATA.setColor("Vanta Black");

        // System.out.println("Brand: "  + TATA.make + " Price: " + TATA.price + " Year: " + TATA.year + " Color: " + TATA.color); // error
        System.out.println("Brand: "  + TATA.getMake() + " \nPrice: " + TATA.getPrice() + " \nYear: " + TATA.getYear() + " \nColor: " + TATA.getColor());


    }
}



// What is a getter ?
// - Method (function) that returns a field's value.
// - getters dont have parameters.

// in the other Car.java file.

/*
public class Car {

    // creating the car fields with private keyword.

    private String color;
    private String make;
    private double price;
    private int year;

    public Car(String make,double price,int year,String color){
        
        // this keyword: means current object.

        this.make = make;
        this.price = price;
        this.color = color;
        this.year = year;
    }

    // define 4 getters for 4 parameters.

    public String getMake(){
        return this.make;
    }
    public int getYear(){
        return this.year;
    }
    public double getPrice(){
        return this.price;
    }
    public String getColor(){
        return this.color;
    }
    
    // Setters 

    public void setMake(String make){
        this.make = make;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setColor(String color){
        this.color = color;
    }
}
 */


