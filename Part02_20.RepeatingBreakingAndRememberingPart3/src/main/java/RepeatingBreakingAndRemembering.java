
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about
        // the parts you haven't done, but you'll get points for the finished parts.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int numbersOfNumbers = 0;
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            sum += num;
            numbersOfNumbers++;
            if (num == -1) {
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + (sum + 1));
                System.out.println("Numbers: " + (numbersOfNumbers - 1));
                break;
            }
        }
        scanner.close();
    }
}
