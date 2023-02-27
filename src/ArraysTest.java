import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysTest {

    public static void main(String[] args) {
        int[] args1 = new int[3];
        int[] args2 = new int[3];
        int[][] args3 = {args1, args2};

        int[] args4 = new int[3];
        args4[0] = 6;

        args3[1] = args4;

        //stringArrayCreation();
        //intArrayCreation();
        multipleDimentionArrayCreation();
    }

    public static void multipleDimentionArrayCreation() {
        String[][] keyboard = {
                {"7", "8", "9"},
                {"4", "5", "6"},
                {"1", "2", "3"},
                {"0", "+", "enter"}
        };
        System.out.println(Arrays.toString(keyboard)); //do not work


        System.out.println("Arrays.toString(keyboard[0]) = " + Arrays.toString(keyboard[0]));
        System.out.println("Arrays.toString(keyboard[1]) = " + Arrays.toString(keyboard[1]));
        System.out.println("Arrays.toString(keyboard[2]) = " + Arrays.toString(keyboard[2]));
        System.out.println("Arrays.toString(keyboard[3]) = " + Arrays.toString(keyboard[3]));

        keyboard[3][2] = "abrakadabra";
        System.out.println();
        System.out.println("Arrays.toString(keyboard[3]) = " + Arrays.toString(keyboard[3]));
    }




    public static void intArrayCreation() {
        InputStream is = System.in;
        Scanner scanner = new Scanner(is);

        int[] args = new int[3];
        System.out.println("please enter first number to add");
        args[0] = scanner.nextInt();

        System.out.println("please enter second number to add");
        args[1] = scanner.nextInt();

        args[2] = args[0] + args[1];
        System.out.println("args[2] = args[0] + args[1] = " + args[2]);
        System.out.println("Arrays.toString(args) = " + Arrays.toString(args));

    }



















    public static void stringArrayCreation() {
        String[] names = new String[3]; //size is static
        names[0] = "Igor";
        names[1] = "Lesia";

        System.out.println(names);
        System.out.println(Arrays.toString(names));

        System.out.println("names.length = " + names.length);

        names[1] = "Second value";

        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));
    }


































}
