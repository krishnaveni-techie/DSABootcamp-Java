package functions;

import java.util.Scanner;

public class Armstrong {

        static void armstrong(int start, int end) {
            for (int num = start; num <= end; num++) {
                int temp = num;
                int digits = 0;
                int sum = 0;

                int count = temp;

                while (count > 0) {
                    digits++;
                    count = count / 10;
                }

                count = temp;

                while (count > 0) {
                    int digit = count % 10;
                    int power = 1;

                    for (int i = 1; i <= digits; i++) {
                        power = power * digit;
                    }

                    sum = sum + power;
                    count = count / 10;
                }

                if (sum == temp) {
                    System.out.println(temp);
                }
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter starting number:");
            int start = sc.nextInt();

            System.out.println("Enter ending number:");
            int end = sc.nextInt();

            armstrong(start, end);
        }
    }

