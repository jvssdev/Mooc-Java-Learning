
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numberOfNumbers = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                System.out.println("Average of the numbers: " + ((double) sum / numberOfNumbers));
                break;
            } else {
                numberOfNumbers = numberOfNumbers + 1;
                sum = sum + number;
            }
        }
        scanner.close();
    }
}
