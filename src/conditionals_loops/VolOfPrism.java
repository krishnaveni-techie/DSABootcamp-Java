package conditionals_loops;
import java.util.Scanner;
public class VolOfPrism {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the area of the base:");
        double b=sc.nextDouble();
        System.out.println("Enter the height of the prism");
        double h=sc.nextDouble();
        double v=b*h;
        System.out.println("Volume Of Prism:" + v);
    }
}
