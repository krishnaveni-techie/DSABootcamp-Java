package conditionals_loops;

import java.util.Scanner;

public class areaofcircle {
static void main(String args[]) {
Scanner sc =new Scanner(System.in);
System.out.println("Enter the radius:");
double radius =sc.nextDouble();
double area= Math.PI *radius*radius;
System.out.println("Area of the corcle:" + area);
sc.close();
}
}