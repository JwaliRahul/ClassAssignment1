package ClassAssignment1;

import java.util.Scanner;

//8.Write a Java program that displays the sum of n odd natural numbers.

public class SumOfOddNos {
    public static void main (String[] args){
        int a,n,sum;
        a=1;
        sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of your choice: ");
        n=input.nextInt();
        System.out.println("Sum of n odd numbers: ");
        for (int i=1; i<=n; i++)
        {
            sum=sum+a;
            a=a+2;
        }
        System.out.println(sum);
    }
}
