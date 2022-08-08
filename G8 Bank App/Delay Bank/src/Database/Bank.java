package Database;

public class Bank {
    private Account[] accounts; // create a array field from the the Account.java field.

    public Bank(Account[] accounts) {
        this.accounts = new Account[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            this.accounts[i] = new Account(accounts[i]); // possible for the copy constructor inside Accounts.java
        }
    }

    // getter

    public String getAccountDetails(String name, String password) {
        for (int i = 0; i < this.accounts.length; i++) {
            if (this.accounts[i].getName().equals(name) && this.accounts[i].getPassword().equals(password)) {
                return this.accounts[i].toString();
            }
        }
        return "404";
    }

    public int isValidUser(String name) {
        for (int i = 0; i < this.accounts.length; i++) {
            if (this.accounts[i].getName().equals(name)) {
                return i; // return the index.
            }
        }
        return -1;
    }

    public int getSavings(String name) {
        for (int i = 0; i < this.accounts.length; i++) {
            if (this.accounts[i].getName().equals(name)) {
                return this.accounts[i].getSavings();
            }
        }
        return 404; // should never execute.
    }

    public void TransferMoney(String name, String recipient, int Amount) {

        // sender
        int finalAmount = getSavings(name) - Amount;
        accounts[isValidUser(name)].setSavings(finalAmount);

        // recipient
        int increasedAmount = getSavings(recipient) + Amount;
        accounts[isValidUser(recipient)].setSavings(increasedAmount);
    }

    // toString

    public String toString() {
        String temp = "____________\n";
        for (int i = 0; i < this.accounts.length; i++) {
            temp += this.accounts[i];
            temp += "\n____________\n\n";
        }
        temp += "***************";
        return temp;
    }

}
