import java.util.Date;

/**
 * Employee
 */
public class Employee {

    String name;
    int empId;
    double salary;
    MyDate hireDate;
    String jobPosition;
    String contactNumber;
    Address address;

    Employee(
            String name,
            int empId,
            double salary,
            MyDate hireDate,
            String jobPosition,
            String contactNumber,
            Address address) {

        this.name = name;
        this.empId = empId;
        this.salary = salary;
        this.hireDate = hireDate;
        this.jobPosition = jobPosition;
        this.contactNumber = contactNumber;
        this.address = address;

    }

    public String toString() {
        return "-------------------------------\nName: " + this.name + "\nEmp ID: " + this.empId + "\nSalary: "
                + this.salary + "\nHire Date: "
                + this.hireDate.getDate() + "\nJob Position: " + this.jobPosition + "\nContact Number: "
                + this.contactNumber + "\nAddress: \n" + address.getAddress() + "\n--------------------------------";
    }

    public double getSalary() {
        return this.salary;
    }

    public String getJob() {
        return this.jobPosition;
    }

    public Date getDate() {
        return this.hireDate.getDate();
    }

}