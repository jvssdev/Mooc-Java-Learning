
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Give a year:");
        Integer year = Integer.valueOf(scan.nextLine());
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println("The year is a leap year.");
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 != 0) {
            System.out.println("The year is not a leap year.");
        } else if (year % 4 != 0) {
            System.out.println("The year is not a leap year.");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("The year is a leap year.");
        }
        scan.close();
    }
}
