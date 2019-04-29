package ANU.java;
import java.util.Scanner;
import java.lang.String;


public class GuessNumber {

        public static void main(String args[]) {
            int target = 30;

            Scanner scn = new Scanner(System.in);

            while (true) {


                System.out.println("enter the number");
                int num = scn.nextInt();
                if (num < target) {

                    System.out.println("Number guessed is lesser than original number");
                }
                else if (num > target)
                {
                    System.out.println("Number guessed is more than original number");
                }
                else
                    {
                    System.out.println("Number guessed matches the original number");
                    break;
                    }

            }
        }
    }

