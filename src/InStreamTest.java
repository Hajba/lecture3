import java.io.InputStream;
import java.util.Scanner;

public class InStreamTest {

    public static final String classDescription = "this class crated for learning purpose";

    public static void main(String[] args) {
        toStringUsage();
        //calculator();
    }

    public static void calculator() {
        InputStream is = System.in;
        Scanner scanner = new Scanner(is);

        System.out.println("please enter first int to add");
        int a1 = scanner.nextInt();
        System.out.println("please enter second int to add");
        int a2 = scanner.nextInt();

        System.out.println("res a1 + a2 = " + (a1 + a2));

        System.out.println("please enter your name");
        String name = scanner.next();
        String name2 = scanner.nextLine();
        System.out.println("hello from " +  name + name2);
    }

    public static void toStringUsage() {
        InStreamTest ist = new InStreamTest();
        System.out.println(ist);
    }

    @Override
    public String toString() {
        //return "This is our custom to string implementation. " + classDescription;
        return super.toString();
    }
}
