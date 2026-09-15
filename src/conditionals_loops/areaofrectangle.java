package conditionals_loops;

import java.util.Scanner;

public class areaofrectangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length:");
        double length = sc.nextDouble();
        System.out.println("enter the height:");
        double height = sc.nextDouble();
        double area=length * height;
        System.out.println("the area of the rectangle is:" + area);

    }
}
