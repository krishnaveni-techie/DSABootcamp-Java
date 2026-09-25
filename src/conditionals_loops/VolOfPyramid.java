package conditionals_loops;
import java.util.Scanner;
public class VolOfPyramid {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the base area:");
        double b=sc.nextDouble();
        System.out.println("Enter the height:");
        double h= sc.nextDouble();
        double p=(1.0/3)*b*h;
        System.out.println("Volume Of Pyramid:" + p);
    }
}
