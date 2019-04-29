package ANU.java;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        int n, temp, sum = 0, i;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Descending Order:");
        for (i = 0; i < n - 1; i++) {
            System.out.print(a[i]);
        }
        System.out.print(a[n - 1]);


        for (i = 0; i <n; i++)
        {


            if (a[i] % 2 == 0)
            {
                System.out.println();
            }
            sum = sum + a[i];
        }
        System.out.println("sum of even numbers" + " " + sum);
        if(sum>15)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }


    }


}


