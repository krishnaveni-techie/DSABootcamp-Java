package conditionals_loops;

import java.util.Scanner;
public class BattingAverage  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total runs: ");
        int runs = sc.nextInt();

        System.out.print("Enter times dismissed: ");
        int dismissals = sc.nextInt();

        if (dismissals > 0) {
            double average = (double) runs / dismissals;
            System.out.println("Batting average: " + average);
        } else {
            System.out.println("Dismissals must be greater than zero.");
        }
    }
}