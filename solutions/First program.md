#Input a year and find whether it is a leap year or not.

import java.util.Scanner;

public class leapyear {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter year to find leap year");
int year=sc.nextInt();
if(year%400==0)
System.out.println("leap year!");
else if (year%100==0)
System.out.println("not a leap year");
else if (year%4==0)
System.out.println("leap year");
else
System.out.println("not a leap year");
}
}
#Take two numbers and print the sum of both.