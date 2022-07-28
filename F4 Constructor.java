/**
 * App
 */
public class App {

    public static void main(String[] args) {

        Car TATA = new Car("TATA", 790000, 2012, "red");
        System.out.println("Brand: "  + TATA.make + " Price: " + TATA.price + " Year: " + TATA.year + " Color: " + TATA.color);
    }
}

// In Car.java file ----------- ########

/*

public class Car {

    // creating the car class.
    String make;
    double price;
    int year;
    String color;

    public Car(String make,double price,int year,String color){ // create the constructor
        // this keyword: means current object.

        this.make = make;
        this.price = price;
        this.color = color;
        this.year = year;
    }
}
*/

