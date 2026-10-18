package functions;

import java.util.Scanner;

public class Calculator {


        static void calculate(double a, double b, char op) {
            if (op == '+') {
                System.out.println(a + b);
            } else if (op == '-') {
                System.out.println(a - b);
            } else if (op == '*') {
                System.out.println(a * b);
            } else if (op == '/') {
                if (b != 0) {
                    System.out.println(a / b);
                } else {
                    System.out.println("Cannot divide by zero");
                }
            } else {
                System.out.println("Invalid operator");
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter first number:");
            double a = sc.nextDouble();

            System.out.println("Enter second number:");
            double b = sc.nextDouble();

            System.out.println("Enter operator (+, -, *, /):");
            char op = sc.next().charAt(0);

            calculate(a, b, op);
        }
    }

