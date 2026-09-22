
//Define a method that returns the product of two numbers entered by user.
package functions;

import java.util.Scanner;

public class Prodoftwono {
    static void product(int a,int b){
        System.out.println("product of two number is:" + a*b);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value for A:");
        int a= sc.nextInt();
        System.out.println("Enter a value for B:");
        int b= sc.nextInt();
        product(a, b);
    }
}
