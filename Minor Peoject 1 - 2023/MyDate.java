import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyDate {
    Scanner sc = new Scanner(System.in);
    Date date;

    MyDate(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        // while (!date.matches(pattern)) {
        // System.out.println("The date format is invalid: eg.(14-05-2023) :");
        // date = sc.next();
        // }

        try {
            this.date = dateFormat.parse(date);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public Date getDate() {
        return this.date;
    }

}
