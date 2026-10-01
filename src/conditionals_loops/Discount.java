package conditionals_loops;
import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product price: ");
        double price = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        double percent = sc.nextDouble();

        double discount = price * percent / 100;
        double finalPrice = price - discount;

        System.out.println("Discount amount: " + discount);
        System.out.println("Final price: " + finalPrice);
    }
}