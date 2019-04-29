package ANU.java;
import java.util.Scanner;

public class pattern {
    public static void main(String ars[])
    {
        int n,s1;
        int i=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the integer");
        n=s.nextInt();

        s1= n+4-1;
        for(i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
                s1--;
            }

        }


    }

}

