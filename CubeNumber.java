package ClassAssignment1;

//6.Write a Java program to display the cube of the given number up to an integer

import java.util.Scanner;

public class CubeNumber {
    public static void main(String[] args) {
        int x, cubeOfx;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter x: ");
        x = input.nextInt();

        cubeOfx = x * x * x;
        System.out.println("Cube of x: " + cubeOfx);
    }
            }