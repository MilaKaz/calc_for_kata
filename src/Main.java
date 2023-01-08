import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите арифметическое выражение");
        String expression = scanner.nextLine();

        String result = calc(expression);
        System.out.println(result);
    }

    public static String calc(String input) throws Exception {

        String[] subExpression;
        String delimiter = " ";
        subExpression = input.split(delimiter);

        if (subExpression.length != 3) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.print("Неверный формат. Введите арифметическое выражение разделяя знаки пробелами.");
            }
        }

        int num1 = Integer.parseInt(subExpression[0]);
        int num2 = Integer.parseInt(subExpression[2]);
        String symbol = subExpression[1];

        if (num1 < 1 || num1 > 10) {
            throw new Exception("Неверный формат. Введите цифры от 1 до 10.");
        }

        if (num2 < 1 || num2 > 10) {
            throw new Exception("Неверный формат. Введите цифры от 1 до 10.");
        }

        int result;

        switch (symbol) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            default:
                throw new Exception("Неверный формат. Введите символ +, -, / или *.");
        }

        return String.valueOf(result);
    }
}






