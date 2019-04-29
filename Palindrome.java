package ANU.java;
import java.util.Scanner;

public class Palindrome {


        public static void main(String[] args) {
            int n, rev = 0, rem = 0, on, sum = 0;
            int[] a = new int[50];
            Scanner s = new Scanner(System.in);
            System.out.println("enter no");
            n = s.nextInt();
            on = n;
            while (n != 0) {
                rem = n % 10;
                rev = rev * 10 + rem;
                n = n / 10;
            }
            if (on == rev) {
                System.out.println("palindrome" + rev);
          /*for (int i = 0; i < n; i++)
            {
                a[i] = s.nextInt();
            }*/
                while (on > 0) {

                    rem = on % 10;
                    if (rem % 2 == 0) {
                        sum = sum + rem;
                    }
                    on = on / 10;


                }

                if (sum > 25) {

                    System.out.println("no is greater than 25 ");

                } else {
                    System.out.println("no is less than 25");
                }
            }
            else
            {
                System.out.println("not pal");
            }


        }}
