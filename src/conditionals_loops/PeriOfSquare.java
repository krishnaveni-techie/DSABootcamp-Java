package conditionals_loops;
import java.util.Scanner;
public class PeriOfSquare {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of the square:");
        double s=sc.nextDouble();
        double p=4*(s);
        System.out.println("Perimeter Of Square is:" + " " +p);
    }
}
