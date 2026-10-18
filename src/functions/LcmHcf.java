package functions;

import java.util.Scanner;

public class LcmHcf {

        static int hcf(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        static int lcm(int a, int b) {
            return (a * b) / hcf(a, b);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter first number:");
            int a = sc.nextInt();

            System.out.println("Enter second number:");
            int b = sc.nextInt();

            System.out.println("HCF = " + hcf(a, b));
            System.out.println("LCM = " + lcm(a, b));
        }
    }

