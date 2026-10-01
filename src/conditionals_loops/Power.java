package conditionals_loops;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = sc.nextDouble();

        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();

        if (exponent < 0) {
            System.out.println("Enter a non-negative exponent.");
            return;
        }

        double result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Power: " + result);
    }
}