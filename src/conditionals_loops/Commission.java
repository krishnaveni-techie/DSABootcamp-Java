package conditionals_loops;

import java.util.Scanner;

public class Commission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total sales: ");
        double sales = sc.nextDouble();

        System.out.print("Enter commission amount: ");
        double commission = sc.nextDouble();

        if (sales > 0) {
            double percent = commission / sales * 100;
            System.out.println("Commission percentage: "
                    + percent + "%");
        } else {
            System.out.println("Sales must be greater than zero.");
        }
    }
}