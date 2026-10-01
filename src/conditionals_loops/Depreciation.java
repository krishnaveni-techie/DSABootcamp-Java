package conditionals_loops;
import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial value: ");
        double value = sc.nextDouble();

        System.out.print("Enter depreciation rate (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter number of years: ");
        int years = sc.nextInt();

        for (int i = 1; i <= years; i++) {
            value = value * (1 - rate / 100);
        }

        System.out.println("Value after depreciation: " + value);
    }
}
