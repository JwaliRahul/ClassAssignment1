package ClassAssignment1;

//7.Write a Java program to display the multiplication table of a given integer.

import java.util.Scanner;

public class MultiplicationTable {
    public static void main (String [] args){
        int number;
        int result=1;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number of your choice: ");
        number = input.nextInt();
        System.out.println("Multiplciation table for the given number is as follows: ");

        for (int i=1; i<=20; i++)
        {
            result = number*i;
            System.out.println(number+"*"+i+"="+result);
        }
    }
}


