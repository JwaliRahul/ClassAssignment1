package ClassAssignment1;


//4.Write a Java program to display n terms of natural numbers and their sum

import java.util.Scanner;

public class NaturalNumbersSum {
    public static void main (String[] args) {
        int numberOfTerms,sum;
        sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of natural numbers: ");
        numberOfTerms = input.nextInt();
        for (int i=1; i<=numberOfTerms; i++) {
            System.out.println(i);
            sum =i+sum;
        }
        System.out.println("The sum of the above natural numbers is " +sum);
    }
}
