//Input a year and find whether it is a leap year or not.

import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year to find leap year");
        int year = sc.nextInt();
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("leap year");
        } else {
            System.out.println("not leap year");
        }
    }
}