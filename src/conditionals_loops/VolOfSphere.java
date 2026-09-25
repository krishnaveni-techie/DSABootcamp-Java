package conditionals_loops;
import java.util.Scanner;
public class VolOfSphere {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the sphere:");
        double r=sc.nextDouble();
        double s=(4.0/3)*Math.PI*(r*r*r);
        System.out.println("Volume Of Sphere:"+s);
    }
}
