package ClassAssignment1;

import java.util.Scanner;

//5.Write a program in Java to input 5 numbers from the keyboard and find their sum and average.

public class FiveNumberAvg {
    public static void main (String [] args) {
        int a,b,c,d,e,sum,average;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        a =input.nextInt();

        System.out.println("Enter the second number: ");
        b =input.nextInt();

        System.out.println("Enter the third number: ");
        c =input.nextInt();

        System.out.println("Enter the fourth number: ");
        d =input.nextInt();

        System.out.println("Enter the fifth number: ");
        e =input.nextInt();

        sum=a+b+c+d+e;
        System.out.println("Sum of the five numbers is: " +sum);
        average=sum/5;
        System.out.println("Average of the five numbers is: " +average) ;
    }

}
