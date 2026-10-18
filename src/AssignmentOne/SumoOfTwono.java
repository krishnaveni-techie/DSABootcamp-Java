
//Take two numbers and print the sum of both.
import java.util.Scanner;

public class SumoOfTwono {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value for A:");
        int A=sc.nextInt();
        System.out.println("Enter a value for B:");
        int B=sc.nextInt();
        int sum=A+B;
        System.out.println("The sum of Two Numbers is ");
        System.out.println(sum);
    }
}