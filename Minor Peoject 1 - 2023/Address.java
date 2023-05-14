
public class Address {

    String city, state, nationality, pin, landmark;
    int countryCode;

    Address(String city, String state, String pin) {
        this.city = city;
        this.state = state;
        this.pin = pin;
    }

    public String getAddress() {
        return "City: " + city + "\nState: " + state + "\nPin: " + pin;
    }

}
