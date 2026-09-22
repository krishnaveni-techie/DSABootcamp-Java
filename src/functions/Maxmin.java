
//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
import java.util.Scanner;
public class Maxmin {
    static void max(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            System.out.println("first value is an maximum value:" + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("the value two is maximum value:" + num2);
        } else {
            System.out.println("the value three is maximum value:" + num3);
        }
    }

    static void mini(int num1, int num2, int num3) {
        if (num1 < num2 && num1 < num3) {
            System.out.println("first value is an minimum value:" + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("the value two is minimum value:" + num2);
        } else {
            System.out.println("the value three is minimum value:" + num3);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an value for num 1:");
        int num1 = sc.nextInt();
        System.out.println("enter an value for num 2:");
        int num2 = sc.nextInt();
        System.out.println("enter an value for num 3:");
        int num3 = sc.nextInt();
        max(num1, num2, num3);
        mini(num1, num2, num3);
    }
}


