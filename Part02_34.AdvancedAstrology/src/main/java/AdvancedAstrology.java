
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }

        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = number; i > 0; i--) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int i = size - 1;
        int j = 1;
        while (i >= 0) {
            printSpaces(i);
            printStars(j);
            i--;
            j++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int j = 1;
        int i = height - 1;

        while (i >= 0) {
            printSpaces(i);
            if (j > 1) {
                printStars(j * 2 - 1);
            } else {
                printStars(j);
            }
            i--;
            j++;
        }
        for (int k = 0; k < 2; k++) {
            printSpaces(height - 2);
            System.out.println("***");
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
