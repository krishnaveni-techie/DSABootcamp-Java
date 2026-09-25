package conditionals_loops;
import java.util.Scanner;
public class PeriOfRhombus {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of the rhombus:");
        double s=sc.nextDouble();
        double p=4*(s);
        System.out.println("Perimeter Of Rhombus is:" + " " +p);
    }
}
