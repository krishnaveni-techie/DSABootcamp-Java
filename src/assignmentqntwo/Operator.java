//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;

public class Operator {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second  number:");
        int b=sc.nextInt();
        System.out.println("Enter  operator:");
        char operator = sc.next().charAt(0);
        if (operator == '+')
        {
            int c=a+b;
            System.out.println("the sum of two number is :"+ c);
        }
        else if(operator == '-') {
            int c=a-b;
            System.out.println("Subtraction of two numbers:"+ c );

        } else if (operator == '*') {
            int c=a*b;
            System.out.println("Multiplication:"+c);

        }
        else if (operator == '/'){
            int c=a/b;
            System.out.println("Division:"+c);
        }
        else {
            System.out.println("Invalid ");
        }


    }
}
