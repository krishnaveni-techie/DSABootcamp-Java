package functions;

import java.util.Scanner;

public class Vowelsandconsonents {

        static void check(char ch) {
            ch = Character.toLowerCase(ch);

            if (ch < 'a' || ch > 'z')
                System.out.println("Not an alphabet");
            else if ("aeiou".indexOf(ch) != -1)
                System.out.println("Vowel");
            else
                System.out.println("Consonant");
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a character:");
            char ch = sc.next().charAt(0);
            check(ch);
        }
    }

