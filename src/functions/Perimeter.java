package functions;

import java.util.Scanner;

public class Perimeter {
        static double circle(double r) {
            return 2 * Math.PI * r;
        }

        static double equilateral(double a) {
            return 3 * a;
        }

        static double parallelogram(double a, double b) {
            return 2 * (a + b);
        }

        static double rectangle(double l, double b) {
            return 2 * (l + b);
        }

        static double square(double a) {
            return 4 * a;
        }

        static double rhombus(double a) {
            return 4 * a;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("1. Circle");
            System.out.println("2. Equilateral Triangle");
            System.out.println("3. Parallelogram");
            System.out.println("4. Rectangle");
            System.out.println("5. Square");
            System.out.println("6. Rhombus");

            System.out.println("Enter your choice:");
            int choice = sc.nextInt();

            double a, b;

            if (choice == 1) {
                System.out.println("Enter radius:");
                a = sc.nextDouble();
                System.out.println("Perimeter = " + circle(a));

            } else if (choice == 2) {
                System.out.println("Enter side:");
                a = sc.nextDouble();
                System.out.println("Perimeter = " + equilateral(a));

            } else if (choice == 3) {
                System.out.println("Enter two adjacent sides:");
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println("Perimeter = " + parallelogram(a, b));

            } else if (choice == 4) {
                System.out.println("Enter length and breadth:");
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println("Perimeter = " + rectangle(a, b));

            } else if (choice == 5) {
                System.out.println("Enter side:");
                a = sc.nextDouble();
                System.out.println("Perimeter = " + square(a));

            } else if (choice == 6) {
                System.out.println("Enter side:");
                a = sc.nextDouble();
                System.out.println("Perimeter = " + rhombus(a));

            } else {
                System.out.println("Invalid choice");
            }

            sc.close();
        }
    }

