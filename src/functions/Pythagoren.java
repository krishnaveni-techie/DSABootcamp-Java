package functions;
import java.util.Scanner;

public class Pythagoren
{
    static void check(int a, int b, int c)
    {
        if(a * a + b * b == c * c)
            System.out.println("Pythagorean Triplet");
        else
            System.out.println("Not a Pythagorean Triplet");
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        check(a, b, c);
    }
}