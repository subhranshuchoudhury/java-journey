/**
 * App
 */
public class App {

    public static void main(String[] args) {

        // create the object with the help of Car class. 
        Car nissan = new Car();

        nissan.make = "Nissan";
        nissan.color = "Crimson red";
        nissan.year = 1956;
        nissan.price = 576000;

        System.out.println("This " + nissan.make + " is worth " + nissan.price + " ruppess. It was built in " + nissan.year + ". Its color is " + nissan.color);
    }
}

/*
 * Create a file with the name Car.java
 * Create a public class that store type of the object
 */


// public class Car {

//     // creating the car class.
//     String make;
//     double price;
//     int year;
//     String color;
// }
