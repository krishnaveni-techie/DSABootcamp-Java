package conditionals_loops;
import java.util.Scanner;
public class VolOfCone {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of the cone:");
        double r=sc.nextDouble();
        System.out.println("enter the height of the cone:");
        double h=sc.nextDouble();
        double c=(1.0/3)*Math.PI*(r*r)*h;
        System.out.println("Volume Of Cone:" +" " +c);
    }
}
