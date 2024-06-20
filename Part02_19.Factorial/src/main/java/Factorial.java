
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        int n = 1;
        int factorial = 1;
        while (n <= number) {
            if (number == 0) {
                break;
            } else {
                factorial *= n;
                n++;
            }
        }
        System.out.print("Factorial: " + factorial);
        scanner.close();
    }
}
