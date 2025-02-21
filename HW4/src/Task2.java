import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Калькулятор с возможностью суммировать / отнять / разделить числа");

        System.out.print("Введите первое число: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double secondNumber = scanner.nextDouble();

        System.out.println("Какую операцию хотите произвести?");
        System.out.println("сложение (1) / вычитание (2) / деление (3)");
        System.out.print("Введите число: ");
        int operation = scanner.nextInt();

        if (operation == 1) {
            System.out.println("Результат сложения  : " + (firstNumber + secondNumber));
        } else if (operation == 2) {
            System.out.println("Результат вычитания: " + (firstNumber - secondNumber));
        } else if (operation == 3) {
            System.out.println("Результат деления: " + (firstNumber / secondNumber));
        }
    }
}
