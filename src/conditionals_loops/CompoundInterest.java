package conditionals_loops;


import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter annual rate (%): ");
        double r = sc.nextDouble();

        System.out.print("Enter time in years: ");
        double t = sc.nextDouble();

        double amount = p * Math.pow(1 + r / 100, t);
        double interest = amount - p;

        System.out.println("Compound interest: " + interest);
        System.out.println("Total amount: " + amount);
    }
}
