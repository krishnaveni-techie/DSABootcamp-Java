package conditionals_loops;
import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of semesters: ");
        int n = sc.nextInt();

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter GPA for semester " + i + ": ");
            sum += sc.nextDouble();
        }

        if (n > 0) {
            double cgpa = sum / n;
            System.out.println("CGPA: " + cgpa);
        } else {
            System.out.println("Enter a positive number of semesters.");
        }
    }
}