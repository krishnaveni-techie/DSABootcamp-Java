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
import java.util.Scanner;

public class SumofTwoNumbers {
static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a value for A:");
int A=sc.nextInt();
System.out.println("Enter a value for B:");
int B=sc.nextInt();
int sum=A+B;
System.out.println("The sum of Two Numbers is ");
System.out.println(sum);
}
}
