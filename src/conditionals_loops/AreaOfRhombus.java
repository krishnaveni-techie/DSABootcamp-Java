package conditionals_loops;
import java.util.Scanner;
public class AreaOfRhombus {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value for d1:");
        int d1=sc.nextInt();
        System.out.println("Enter value for d2:");
        int d2=sc.nextInt();
        int area=(d1*d2)/2;
        System.out.println("the area of the rhombus is:" +area);
    }
}
