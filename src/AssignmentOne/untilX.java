package AssignmentOne;

import java.util.Scanner;

public class untilX {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int sum = 0;

            while (true) {
                System.out.println("Enter a number or x to stop:");

                String input = sc.next();

                if (input.equals("x")) {
                    break;
                }

                int num = Integer.parseInt(input);
                sum = sum + num;
            }

            System.out.println("Sum = " + sum);
        }
    }

