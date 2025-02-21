import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Конвертер валют");

        System.out.print("Введите кол-во рублей: ");
        int rubles = scanner.nextInt();

        System.out.print("Введите куср доллара: ");
        double dollarRate = scanner.nextDouble();

        System.out.print("Введите куср евро: ");
        double euroRate = scanner.nextDouble();

        double dollars = rubles / dollarRate;
        double euros = rubles / euroRate;

        System.out.println("Значение в долларах: " + dollars);
        System.out.println("Значение в евро: " + euros);

    }
}
