//4.Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int A = sc.nextInt();

        System.out.println("Enter second number:");
        int B = sc.nextInt();

        System.out.println("Enter operator (+, -, *, /):");
        String operator = sc.next();

        if (operator.equals("+")) {
            System.out.println("Result = " + (A + B));
        }
        else if (operator.equals("-")) {
            System.out.println("Result = " + (A - B));
        }
        else if (operator.equals("*")) {
            System.out.println("Result = " + (A * B));
        }
        else if (operator.equals("/")) {
            System.out.println("Result = " + (A / B));
        }
        else {
            System.out.println("Invalid operator");
        }
    }
}