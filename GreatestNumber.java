package ClassAssignment1;

//1) Write a Java program that takes three numbers from the user and prints the greatest number.

import java.util.Scanner;

public class GreatestNumber {
    public static void main (String [] args) {

        int firstNumber,secondNumber,thirdNumber,greatestNumber;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");

        firstNumber=input.nextInt();

        System.out.println("Enter the second number");

        secondNumber=input.nextInt();

        System.out.println("Enter the third number");

        thirdNumber=input.nextInt();

        if (firstNumber>secondNumber)
            greatestNumber=firstNumber;
        else
            greatestNumber=secondNumber;
        if (greatestNumber<thirdNumber)
            greatestNumber=thirdNumber;
        System.out.println("The greatest number is " +greatestNumber);
    }

}
