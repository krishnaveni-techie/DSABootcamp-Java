package conditionals_loops;
import java.util.Scanner;
public class PerimeterOfParallelogram {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side a of the parallelogram:");
        double a= sc.nextDouble();
        System.out.println("Enter the side b of the parallelogram:");
        double b= sc.nextDouble();
        double p=2*(a+b);
        System.out.println("Perimeter Of Parallelogram is:" + " " + p);
    }
}
