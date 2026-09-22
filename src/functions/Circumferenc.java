//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
package functions;
import java.util.Scanner;
public class Circumferenc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for areaOfCircle:");
        float areaOfCircle= sc.nextFloat();
        float radius = (float) Math.sqrt(areaOfCircle/3.14);
        float Circumferance = (float) (2 * 3.14 *radius);
        System.out.println("the circumference of the given AreaOfCircle is:" + Circumferance);
    }
}
