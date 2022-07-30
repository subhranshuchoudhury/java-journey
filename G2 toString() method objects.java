
// toString() method in objects.

/**
 * App
 */
public class App {

    public static void main(String[] args) {

        Person person = new Person("Subhranshu Choudhury", "Indian", "26/08/2003", 2);
        if (person.applyPassport() == true) {
            person.setPassport();

        }


        System.out.println(person);

        // not use toString() method --> Person@7a81197d

        // use toString() method
        // Name: Subhranshu Choudhury
        // Nationality: Indian
        // Date of Birth: 26/08/2003
        // Seat Number: 2
        // Passport: [Subhranshu Choudhury, Indian, 26/08/2003]

    }

}

// **************

import java.util.Arrays;

public class Person {

    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;

    // constructor

    public Person(String name, String natio, String DOB, int seatNumber) {
        this.name = name;
        this.nationality = natio;
        this.dateOfBirth = DOB;
        this.seatNumber = seatNumber;
        this.passport = new String[3];

    }

    // getter

    public String getName() {
        return this.name;
    }

    public String getNatio() {
        return this.nationality;
    }

    public String getDOB() {
        return this.dateOfBirth;
    }

    public String[] getPassport() {
        return Arrays.copyOf(this.passport, this.passport.length);
    }

    public int getSeatNumber() {
        return this.seatNumber;
    }

    // copy constructor

    public Person(Person source) {
        this.name = source.name;
        this.dateOfBirth = source.dateOfBirth;
        this.seatNumber = source.seatNumber;
        this.nationality = source.nationality;
        this.passport = Arrays.copyOf(source.passport, source.passport.length);
    }

    // setter

    public void setPassport() {
        this.passport = new String[] { this.name, this.nationality, this.dateOfBirth };
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDOB(String dob) {
        this.dateOfBirth = dob;
    }

    public void setNatio(String natio) {
        this.nationality = natio;
    }

    public void setSeatNum(int seat) {
        this.seatNumber = seat;
    }

    // apply passport

    public boolean applyPassport() {
        int draw = (int)(Math.random() * 2);
        System.out.println(draw);
        return (draw > 0 ? true : false);
    }

    // choose seat

    public void chooseSeat() {
        this.seatNumber = (int)(Math.random() * 11 + 1);
    }

    // toString method **************************

    public String toString() {
        return ("Name: " + this.getName() + "\n"
                + "Nationality: " + this.getNatio() + "\n"
                + "Date of Birth: " + this.getDOB() + "\n"
                + "Seat Number: " + this.getSeatNumber() + "\n"
                + "Passport: " + Arrays.toString(this.getPassport()) + "\n");
    }

}
