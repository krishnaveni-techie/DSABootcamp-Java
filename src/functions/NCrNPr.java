package functions;

import java.util.Scanner;

public class NCrNPr {
        static int fact(int n) {
            int f = 1;
            for (int i = 1; i <= n; i++)
                f *= i;
            return f;
        }

        static int ncr(int n, int r) {
            return fact(n) / (fact(r) * fact(n - r));
        }

        static int npr(int n, int r) {
            return fact(n) / fact(n - r);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter n and r:");*9
            int n = sc.nextInt();
            int r = sc.nextInt();

            if (n >= 0 && r >= 0 && r <= n) {
                System.out.println("NCr = " + ncr(n, r));
                System.out.println("NPr = " + npr(n, r));
            } else {
                System.out.println("Invalid input");
            }
        }
    }

