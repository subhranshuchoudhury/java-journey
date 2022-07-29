// Action of object

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        Car nisan = new Car("Brezza", "red", 2017);
        nisan.drive();
    }
}

/**
 * Car
public class Car {

    private String model;
    private String color;
    private int year;

    public Car(String model,String color,int year){

        this.model = model;
        this.color = color;
        this.year = year;
    }

    // this is a action performed by the car class.
    public void drive(){
        System.out.println("Your " + this.color + " color, " + this.model + " is ready to drive. Since " + this.year + ".");
    }



}
*/
