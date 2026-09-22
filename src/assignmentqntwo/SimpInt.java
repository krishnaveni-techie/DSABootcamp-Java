import java.util.Scanner;

public class SimpInt {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal:");
        double P = sc.nextDouble();
        System.out.println("Enter time:");
        double T= sc.nextDouble();
        System.out.println("Enter Rate:");
        double R= sc.nextDouble();
        double Simple_Interest = (P * T * R)/100;
        System.out.println("Simple Interest is :"+ Simple_Interest);



    }
}
