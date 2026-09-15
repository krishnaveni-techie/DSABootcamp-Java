import java.util.Scanner;

public class SimpleInt {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principal amount:");
        double P=sc.nextDouble();
        System.out.println("Enter Time:");
        double T=sc.nextDouble();
        System.out.println("Enter Rate of intrest:");
        double r=sc.nextDouble();
        double SI=(P * T * r)/100;
        System.out.println("Simple Interest " + SI);
    }
}
