package conditionals_loops;
import java.util.Scanner;
public class VolOfCylinder {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder:");
        double r=sc.nextDouble();
        System.out.println("Enter the height of the cylinder:");
        double h=sc.nextDouble();
        double c=Math.PI*(r*r)*h;
        System.out.println("Volume Of Cylinder:" + c);
    }
}
