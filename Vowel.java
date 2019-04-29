package ANU.java;
import java.util.Scanner;
import java.lang.*;

public class Vowel {
    public static void main(String[] args) {
        System.out.println("enter the strinng");
        Scanner str = new Scanner(System.in);
        String s1 = str.nextLine();
        int len = s1.length();
        for (int i = 0; i < len; i++) {
            char ch = s1.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                System.out.println("vowel");
            }
            else
            {
                System.out.println("consonent ");
            }
        }

    }
}


