import java.io.InputStream;
import java.util.Scanner;

public class IfStatementsExample {

    public static final String JANUARY = "JANUARY";
    public static final String FEBRUARY = "FEBRUARY";
    public static final String MARCH = "MARCH";
    public static final String APRIL = "APRIL";
    public static final String MAY = "MAY";
    public static final String JUNE = "JUNE";
    public static final String JULY = "JULY";
    public static final String AUGUST = "AUGUST";
    public static final String SEPTEMBER = "SEPTEMBER";
    public static final String OCTOBER = "OCTOBER";
    public static final String NOVEMBER = "NOVEMBER";
    public static final String DECEMBER = "DECEMBER";


    public static void main(String[] args) {
        //ifExample();
        //caseExample();
        newSwitch();
    }

    public static void ifExample() {
        InputStream is = System.in;
        Scanner scanner = new Scanner(is);

        System.out.println("please enter your age");
        int age = scanner.nextInt();

        if (age < 0 || age > 130) {
            System.out.println("seems like you enter wrong number");
        } else {
            System.out.println("age is correct");
        }

        String result;
        result = age > 130 ? "incorrect age" : "correct age";
        System.out.println(result);
    }


    public static void caseExample() {
        InputStream is = System.in;
        Scanner scanner = new Scanner(is);

        System.out.println("please enter number");
        int number = scanner.nextInt();

        switch (number) {
            case 3: {
                System.out.println("FIZZ");
            }
            break;
            case 5: {
                System.out.println("BAZZ");
            }
            break;
            case 15: {
                System.out.println("FIZZ & BAZZ");
            }
            break;
            default: {
                System.out.println("Try another number");
            }
        }
    }

    public static void newSwitch() {

        InputStream is = System.in;
        Scanner scanner = new Scanner(is);

        System.out.println("please enter month enum");
        Month month = Month.valueOf(scanner.next());

        String season = switch (month) {
            case JANUARY, FEBRUARY -> "winter came"; //несколько вариантов
            case MARCH, APRIL, MAY -> "spring";
            case JUNE, JULY, AUGUST -> "summer";
            case SEPTEMBER, OCTOBER, NOVEMBER -> {
                System.out.println("winter is coming!");
                callSomeMethod();
                yield "autumn";
            }
            case DECEMBER -> "winter came"; //oдин вариант
        };

        System.out.println("season = " + season);


        System.out.println("please enter month");
        String monthStr = scanner.next();


        season = switch (monthStr) {
            case "JAN", "FEB" -> "winter";
            case "MAR" -> "spring";
            default -> "error";
        };
        System.out.println("season = " + season);
    }

    private static void callSomeMethod() {
        //todo comlex logic
    }
}
