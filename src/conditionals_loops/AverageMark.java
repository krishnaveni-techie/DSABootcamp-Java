package conditionals_loops;

import java.util.Scanner;

public class AverageMark{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        double total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            total += sc.nextDouble();
        }

        if (n > 0) {
            System.out.println("Average marks: " + total / n);
        } else {
            System.out.println("Enter a positive number of subjects.");
        }
    }
}