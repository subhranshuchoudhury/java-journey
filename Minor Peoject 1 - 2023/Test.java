import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Scanner sc = new Scanner(System.in);
        Strings msg = new Strings();
        Strings.printer(msg.msg_1);
        int emp_iter = sc.nextInt();
        while (emp_iter > 500 || emp_iter < 0) {
            System.out.println("The employee capacity is of 500 only.\nTry again with new value: ");
            emp_iter = sc.nextInt();
        }

        Employee[] employees = new Employee[emp_iter];

        for (int i = 0; i < emp_iter; i++) {

            Strings.printer("Enter details for employee: " + (i + 1));

            Strings.printer(msg.name);
            String name = sc.next();
            Strings.printer(msg.emp_id);
            int empId = sc.nextInt();
            Strings.printer(msg.salary);
            double salary = sc.nextDouble();
            Strings.printer(msg.hireDate);
            MyDate hireDate = new MyDate(sc.next());
            Strings.printer(msg.jobPosition);
            String jobPosition = sc.next();
            Strings.printer(msg.contactNumber);
            String contactNumber = sc.next();
            // address section
            Strings.printer(msg.address);
            Strings.printer(msg.city);
            String cityName = sc.next();
            Strings.printer(msg.pin);
            String pinCode = sc.next();
            Strings.printer(msg.state);
            String state = sc.next();
            employees[i] = new Employee(name, empId, salary, hireDate, jobPosition, contactNumber,
                    new Address(cityName, state, pinCode));

        }

        /*
         * Comment out these function to run.
         */

        // int count = foreignEmployeeCount(employees);
        // System.out.println("Total number of foreign: " + count);
        // getEmployeesBySalary(employees, 1000, 3000);
        // arrangeEmployeeBySalary(employees);
        // getEmployeesByJobPosition(employees, "manager");
        // getEmployeesByHireDate(employees, dateFormat.parse("01-01-2005"),
        // dateFormat.parse("12-12-2005"));

        sc.close();

    }

    public static void arrangeEmployeeBySalary(Employee[] e) {
        Arrays.sort(e, (e1, e2) -> {
            if (e1 == null && e2 == null) {
                return 0;
            } else if (e1 == null) {
                return 1;
            } else if (e2 == null) {
                return -1;
            } else {
                return Double.compare(e2.salary, e1.salary);
            }
        });
    }

    public static void getEmployeesByJobPosition(Employee[] e, String jp) {
        for (Employee employee : e) {
            if (employee != null && jp.equals(employee.jobPosition)) {
                System.out.println(employee);
            }
        }
    }

    public static void getEmployeesByHireDate(Employee[] e, Date d1, Date d2) {

        java.util.Date startDate;
        java.util.Date endDate;
        try {
            startDate = (d1);
            endDate = (d2);
        } catch (Exception ex) {
            System.out.println("Invalid date format");
            return;
        }
        for (Employee employee : e) {
            if (employee != null && employee.hireDate != null && employee.getDate().after(startDate)
                    && employee.getDate().before(endDate)) {
                System.out.println(employee);
            }
        }
    }

    public static void getEmployeesBySalary(Employee[] e, double s1, double s2) {
        for (Employee employee : e) {
            if (employee != null && employee.salary >= s1 && employee.salary <= s2) {
                System.out.println(employee);
            }
        }
    }

    public static int foreignEmployeeCount(Employee[] e) {
        int count = 0;
        for (Employee employee : e) {
            if (employee != null && employee.contactNumber != null && !employee.contactNumber.startsWith("+91")) {
                count++;
            }
        }
        return count;
    }

}
