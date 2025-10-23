import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marital status (married/unmarried): ");
        String maritalStatus = sc.nextLine().trim().toLowerCase();

        System.out.print("Enter gender (male/female): ");
        String gender = sc.nextLine().trim().toLowerCase();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.close();

        boolean insured = false;

        if (maritalStatus.equals("married")) {
            insured = true;
        } else if (maritalStatus.equals("unmarried")) {
            if (gender.equals("male") && age > 30) {
                insured = true;
            } else if (gender.equals("female") && age > 25) {
                insured = true;
            }
        }

        if (insured) {
            System.out.println("Driver is insured.");
        } else {
            System.out.println("Driver is NOT insured.");
        }
    }
}
