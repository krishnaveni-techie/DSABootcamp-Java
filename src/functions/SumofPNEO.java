package functions;

import java.util.Scanner;

public class SumofPNEO {

        static void calculate(Scanner sc) {
            int n, neg = 0, even = 0, odd = 0;

            System.out.println("Enter numbers (0 to stop):");

            while ((n = sc.nextInt()) != 0) {
                if (n < 0)
                    neg += n;
                else if (n % 2 == 0)
                    even += n;
                else
                    odd += n;
            }

            System.out.println("Negative sum = " + neg);
            System.out.println("Positive even sum = " + even);
            System.out.println("Positive odd sum = " + odd);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            calculate(sc);
        }
    }

