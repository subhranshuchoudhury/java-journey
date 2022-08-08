package Database;

public class Account {
    private String name;
    private int savings;
    private boolean tookLoan;
    private String password;

    // constructor

    public Account(String name, int savings, boolean tookLoan, String password) {
        this.name = name;
        this.savings = savings;
        this.tookLoan = tookLoan;
        this.password = password;
    }

    // copy constructor

    public Account(Account source) {
        this.name = source.name;
        this.savings = source.savings;
        this.tookLoan = source.tookLoan;
        this.password = source.password;

    }

    // getters

    public String getName() {
        return this.name;
    }

    public int getSavings() {
        return this.savings;
    }

    public boolean getTookLoan() {
        return this.tookLoan;
    }

    public String getPassword() {
        return password;
    }

    // setters

    // public void setName(String name) {
    // this.name = name;
    // username cannot be update.
    // }
    public void setPassword(String password, String prevPass) {

        if (prevPass == this.password) {
            this.password = password;
            System.out.println("Password Updated.");
        } else {
            throw new IllegalArgumentException("Your old password is not correct.");
        }
    }

    public void setSavings(int savings) {
        this.savings = savings;
    }

    public void setTookLoan(boolean tookLoan) {
        this.tookLoan = tookLoan;
    }

    // toString

    public String toString() {
        return ("Account name: " + this.name + "\n" + "Balance: " + this.savings + "\n" + "Loaned: "
                + (this.tookLoan ? "Yes" : "No"));
    }
}
