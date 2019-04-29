package ANU.java;
import java.util.Scanner;
import java.lang.String;
public class Upper
{
    public static void main(String args[])
    {
        int i=0;
        Scanner scn=new Scanner(System.in);
        System.out.println("enter  the element ");
       String s1=scn.nextLine();
       char m=s1.charAt(i);
        if(m >= 97 && m <= 122)
        {
            System.out.println("Lower Case");
        }
        else if(m >= 65 && m <= 97)
        {
            System.out.println("Upper Case");
        }
        else if(m >= 48 && m <= 57)
        {
            System.out.println("Digit");
        }
        else
        {
            System.out.println("special Charcter");
        }
    }
}
