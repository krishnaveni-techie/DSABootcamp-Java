package conditionals_loops;
import java.util.Scanner;
public class AreaOfEquitriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for side of the triangle:");
        double s= sc.nextDouble();
        double equi=(Math.sqrt(3)/4)*(s*s);
        System.out.println("The Area of Equilateral Traingle is:" + equi);
    }
}
