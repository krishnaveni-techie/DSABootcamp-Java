//Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class Greet {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String name=sc.next();
        System.out.println("Heloo"+" " +name);
    }


}
