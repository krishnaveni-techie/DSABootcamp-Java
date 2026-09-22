//Define a program to find out whether a given number is even or odd.
package functions;

import java.util.Scanner;

public class oddeven {
    static void even(int num){
        if(num %2==0){
            System.out.println("the number is even:" + num);
        }
        else{
            System.out.println("the number is odd:" +num);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check odddeven:");
        int num = sc.nextInt();
        even(num);
    }
}
