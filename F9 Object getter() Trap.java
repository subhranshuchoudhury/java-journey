import java.util.Arrays;

public class Person {

    String name;
    String nationality;
    String dateOfBirth;
    String[] passport;
    int seatNumber;

    public String[] getPassport(){
        return Arrays.copyOf(this.passport, this.passport.length);
        // never: return this.passport --> it will change the value if you accidentaly change it.
    }

    // copy constructor

    public Person(Person source){
        this.name = source.name;
        //...
        this.passport = Arrays.copyOf(source.passport, source.passport.length);
    }
  
}
