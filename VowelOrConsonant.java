package ClassAssignment1;

import java.util.Scanner;

/* 2.Write a Java program that requires the user to enter a single character from the alphabet.
Print Vowel or Consonant, depending on user input.
If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
 */

public interface VowelOrConsonant {
    public static void main(String[] args) {

        String Letter, Vowel, Consonant;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an alphabet: ");

        Letter = input.next();

        if (Letter.length() > 1) {
          System.out.println("Error:Please enter only one character");
            System.exit(0);};

        if (Character.isLetter(Letter.charAt(0)))
        {
            if (Letter.equalsIgnoreCase("a")|| Letter.equalsIgnoreCase("e") ||
                Letter.equalsIgnoreCase("i") || Letter.equalsIgnoreCase("o") ||
                    Letter.equalsIgnoreCase("u"))
            System.out.println ("This is an Vowel");

        else
            System.out.println("This is a Consonant");

        }
        else
        {System.out.println("Error:Please enter only alphabets");}
        }
    }


