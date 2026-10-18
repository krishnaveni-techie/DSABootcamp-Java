package functions;

import java.util.Scanner;

public class LtwoNumbers {

        static void largest(int a, int b) {
            if (a > b) {
                System.out.println(a + " is largest");
            } else if (b > a) {
                System.out.println(b + " is largest");
            } else {
                System.out.println("Both numbers are equal");
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter first number:");
            int a = sc.nextInt();

            System.out.println("Enter second number:");
            int b = sc.nextInt();

            largest(a, b);
        }
    }

