package functions;

import java.util.Scanner;

public class Simpleinterest {

        static double simpleInterest(double p, double t, double r) {
            return (p * t * r) / 100;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter principal:");
            double p = sc.nextDouble();

            System.out.println("Enter time:");
            double t = sc.nextDouble();

            System.out.println("Enter rate:");
            double r = sc.nextDouble();

            System.out.println("Simple Interest = " +
                    simpleInterest(p, t, r));
        }
    }

