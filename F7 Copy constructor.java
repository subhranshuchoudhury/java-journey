/**
 * Copy constructor
 */
public class App {

    public static void main(String[] args) {
        Person p1 = new Person("Subhranhsu Choudhury", "Indian", "26/08/2003", 5);
        System.out.println(p1.getname());
        p1.setname("Baishakhi Das");
        System.out.println(p1.getname());

        Person p2 = new Person(p1); // copy constructor (p2=p1)
        System.out.println(p2.getname());


    }
}

/*

// in Person.java file

public class Person {

    private String name;
    private String nationality;
    private String dob;
    private int seatNumner;

    public Person (String name,String nationality,String dob,int seatNumner) {
        this.name = name;
        this.nationality = nationality;
        this.dob = dob;
        this.seatNumner = seatNumner;
    }

    
    // getters

    public String getname() {
        return this.name;
    }
    public String getnationality() {
        return this.nationality;
    }
    public String getdob() {
        return this.dob;
    }
    public int getseatNumber() {
        return this.seatNumner;
    }

    // setter

    public void setname(String name) {
        this.name = name;
    }
    public void setnationality(String natio) {
        this.nationality = natio;
    }
    public void setdob(String dob) {
        this.dob = dob;
    }
    public void setseatnumber(int seatnumber) {
        this.seatNumner = seatnumber;
    }

    // copy constructor #############

    public Person(Person source){
        this.name = source.name;
        this.nationality = source.nationality;
        this.dob = source.dob;
        this.seatNumner = source.seatNumner;
    }
}
 */
