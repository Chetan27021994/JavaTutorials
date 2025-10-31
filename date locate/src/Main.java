import java.time.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int day1 = sc.nextInt();
        int month1 = sc.nextInt();
        int year1 = sc.nextInt();


        int day2 = sc.nextInt();
        int month2 = sc.nextInt();
        int year2 = sc.nextInt();

        sc.close();


        LocalDate date1 = LocalDate.of(year1, month1, day1);
        LocalDate date2 = LocalDate.of(year2, month2, day2);


        if (date1.isBefore(date2)) {
            System.out.println("Date1 is before Date2");
        } else if (date1.isAfter(date2)) {
            System.out.println("Date1 is after Date2");
        } else {
            System.out.println("Both dates are equal");
        }
    }
}
