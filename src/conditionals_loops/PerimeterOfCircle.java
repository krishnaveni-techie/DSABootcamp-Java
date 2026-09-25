package conditionals_loops;
import java.util.Scanner;
public class PerimeterOfCircle {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value for Radius:");
        double r=sc.nextDouble();
        double p=2*Math.PI*r;
        System.out.println("The Perimeter of the Circle is:" + p);
    }
}

