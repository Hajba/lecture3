import java.io.InputStream;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int a;
        int b;
        double c = 0d;
        InputStream is = System.in;
        Scanner scanner = new Scanner(is);

        printMenu();

        int menu = scanner.nextInt();

        if (menu < 1 || menu >= 5) {
            System.out.println("You enter incorrect menu number. Try again");
            return;
        } else {
            a = getNumberFromUser(scanner, "first");
            b = getNumberFromUser(scanner, "second");
        }


        if (menu == 1) {
            c = a + b;
        } else if (menu == 2) {
            c = a - b;
        } else if (menu == 3) {
            c = a / b;
        } else if (menu == 4) {
            c = a * b;
        }

        System.out.println("result = " + c);
        scanner.close();
    }

    public static int getNumberFromUser(Scanner scanner, String numberCount) {
        System.out.println("Please enter " + numberCount + " number");
        return Integer.valueOf(scanner.next());
    }

    public static void printMenu() {
        System.out.println("Choose math operation:");
        System.out.println("1) +");
        System.out.println("2) -");
        System.out.println("3) /");
        System.out.println("4) *");
    }
}
