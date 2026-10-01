package conditionals_loops;

import java.util.Scanner;

public class Fibonnaciseries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for n:");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        for (int i=1;i<=n;i++){
            System.out.println(a);
            int next=a+b;
            a=b;
            b=next;
        }
    }
}
