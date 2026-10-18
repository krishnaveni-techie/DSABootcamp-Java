package functions;

import java.util.Scanner;

public class RupeesUSD {

        static double convert(double rupees) {
            return rupees / 88;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter amount in rupees:");
            double rupees = sc.nextDouble();

            System.out.println("Amount in USD = " + convert(rupees));
        }
    }

