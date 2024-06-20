
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        int whereTo2 = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from? ");
        int whereFrom = Integer.valueOf(scanner.nextLine());
        if (whereFrom <= whereTo2) {
            for (int i = whereFrom; i <= whereTo2; i++) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
