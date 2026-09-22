//Input currency in rupees and output in USD.

import java.util.Scanner;

public class Rupees {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rupees:");
        double rupees=sc.nextInt();
        double USD= rupees/95.79;
        System.out.println("Rupees in USD:"+ USD);


    }
}
