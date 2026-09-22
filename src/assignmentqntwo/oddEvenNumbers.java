//Write a program to print whether a number is even or odd, also take input from the user.
import java.util.Scanner;
public class oddEvenNumbers{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
}
