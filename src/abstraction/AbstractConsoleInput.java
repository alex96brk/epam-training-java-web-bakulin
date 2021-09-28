package abstraction;

import java.util.Scanner;

import static constant.MessageConstant.*;

public abstract class AbstractConsoleInput {

    private static final Scanner sc = new Scanner(System.in);

    public static int enterInteger(String parameterName) {
        Integer inputValue = null;
        printConsoleMessage(ENTER_INTEGER, parameterName);

        do {
            while (!sc.hasNextInt()) {
                System.out.println(ERROR_INCORRECT_VALUE_ENTER + "integer");
                System.out.print(String.format(ENTER_INTEGER, parameterName));

                sc.next();
            }
            inputValue = sc.nextInt();

        } while (inputValue == null);
        return inputValue;
    }

    public static double enterDouble(String parameterName) {
        Double inputValue = null;
        System.out.print(String.format(ENTER_DOUBLE, parameterName));

        do {
            while (!sc.hasNextDouble()) {
                System.out.println(ERROR_INCORRECT_VALUE_ENTER + "double");
                System.out.print(String.format(ENTER_DOUBLE, parameterName));

                sc.next();
            }
            inputValue = sc.nextDouble();

        } while (inputValue == null);
        return inputValue;
    }


    public static String enterString(String parameterName) {
        String inputValue = null;
        System.out.print(String.format(ENTER_STRING, parameterName));

        do {
            while (!sc.hasNext()) {
                System.out.println(ERROR_INCORRECT_VALUE_ENTER + "double");
                System.out.print(String.format(ENTER_STRING, parameterName));

                sc.next();
            }
            inputValue = sc.next();


        } while (inputValue == null);
        return inputValue;
    }

    public static void close() {
        sc.close();
    }

    private static void printConsoleMessage(String message, String variableParameterName) {
        System.out.print(String.format(message, variableParameterName));
    }



}
