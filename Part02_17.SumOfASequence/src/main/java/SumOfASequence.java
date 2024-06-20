
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Last number? ");
        int number = Integer.valueOf(scanner.nextLine());
        int n = 1;
        int sum = 0;
        while (number + 1 != n) {
            sum += n;
            n++;
        }
        System.out.print("The sum is " + sum);
        scanner.close();
    }
}
