package ANU.java;
import java.util.*;
import java.lang.String;

public class Reverse {
    public static void main(String[] args)
    {
        String orig, rev = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string to reverse");
        orig = in.nextLine();

        int length = orig.length();

        for (int i = length - 1 ; i >= 0 ; i--)
            rev = rev + orig.charAt(i);

        System.out.println("Reverse of the string: " + rev);
    }}



