package functions;


import java.util.Scanner;

public class Area {

    static double circle(double r) {
        return Math.PI * r * r;
    }

    static double triangle(double b, double h) {
        return b * h / 2;
    }

    static double rectangle(double l, double b) {
        return l * b;
    }

    static double isosceles(double a, double b) {
        return (b / 4) * Math.sqrt(4 * a * a - b * b);
    }

    static double parallelogram(double b, double h) {
        return b * h;
    }

    static double rhombus(double d1, double d2) {
        return d1 * d2 / 2;
    }

    static double equilateral(double a) {
        return Math.sqrt(3) * a * a / 4;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.println("4. Isosceles Triangle");
        System.out.println("5. Parallelogram");
        System.out.println("6. Rhombus");
        System.out.println("7. Equilateral Triangle");

        System.out.println("Enter your choice:");
        int choice = sc.nextInt();

        double a, b;

        if (choice == 1) {
            System.out.println("Enter radius:");
            a = sc.nextDouble();
            System.out.println("Area = " + circle(a));

        } else if (choice == 2) {
            System.out.println("Enter base and height:");
            a = sc.nextDouble();
            b = sc.nextDouble();
            System.out.println("Area = " + triangle(a, b));

        } else if (choice == 3) {
            System.out.println("Enter length and breadth:");
            a = sc.nextDouble();
            b = sc.nextDouble();
            System.out.println("Area = " + rectangle(a, b));

        } else if (choice == 4) {
            System.out.println("Enter equal side and base:");
            a = sc.nextDouble();
            b = sc.nextDouble();
            System.out.println("Area = " + isosceles(a, b));

        } else if (choice == 5) {
            System.out.println("Enter base and height:");
            a = sc.nextDouble();
            b = sc.nextDouble();
            System.out.println("Area = " + parallelogram(a, b));

        } else if (choice == 6) {
            System.out.println("Enter both diagonals:");
            a = sc.nextDouble();
            b = sc.nextDouble();
            System.out.println("Area = " + rhombus(a, b));

        } else if (choice == 7) {
            System.out.println("Enter side:");
            a = sc.nextDouble();
            System.out.println("Area = " + equilateral(a));

        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}


