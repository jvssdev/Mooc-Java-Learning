
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfPositiveNumbers = 0;
        int numberOfPositiveNumbers = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0 && numberOfPositiveNumbers == 0) {
                System.out.println("Cannot calculate the average");
                break;
            } else if (number == 0 && numberOfPositiveNumbers != 0) {
                System.out.print((double) sumOfPositiveNumbers / numberOfPositiveNumbers);
                break;
            } else {
                if (number > 0) {
                    numberOfPositiveNumbers = numberOfPositiveNumbers + 1;
                    sumOfPositiveNumbers = sumOfPositiveNumbers + number;
                }
            }
        }
        scanner.close();
    }
}
