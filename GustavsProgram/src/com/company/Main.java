package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Scanner text = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String Namn = text.next();

        System.out.println("Hello " + Namn + " Welcome to Gustavs Program! ");

        int loop = 1;
        while (loop == 1) {

        System.out.print("Choose number 1 to 6: ");
        int num = in.nextInt();

        switch (num) {

                    case 1:
                        System.out.println("You choose number one wich is FizzBuzz 1 - 200");

                        for (int i = 1; i < 201; i++) {

                            if (i == 100) {
                                System.out.println("ENDOFTHEWORLD");

                            } else if (i % 3 == 0 & i % 5 == 0) {
                                System.out.println("FizzBuzz");

                            } else if (i % 5 == 0) {
                                System.out.println("Buzz");

                            } else if (i % 3 == 0) {
                                System.out.println("Fizz");

                            } else {
                                System.out.println(i);

                            }

                        } break;

                    case 2:
                        System.out.print("You choose number two wich multiplicates any number you type by 10: ");
                        int num2 = in.nextInt();

                        for (int i = 0; i < 10; i++) {
                            System.out.println(num2 + " x " + (i + 1) + " = " + (num2 * (i + 1)));

                        }
                        break;

                    case 3:
                        System.out.print("You choose number three, enter 4 numbers and get the mean of them: ");
                        int num1m = in.nextInt();
                        int num2m = in.nextInt();
                        int num3m = in.nextInt();
                        int num4m = in.nextInt();

                        System.out.println("The mean of the 4 numbers you entered: " + (num1m + num2m + num3m + num4m) / 4.0);

                        break;

                    case 4:
                        System.out.print("You choose number four, Enter your age to find out what your age is in 10 years: ");
                        int age = in.nextInt();

                        System.out.println("Your age in 10 years would be: " + (age + (10)));

                        break;

                    case 5:
                        System.out.println("You choose number five, this will print out a to z");

                        for (char t = 'a'; t <= 'z'; t++) {

                            if (t == 'b') {
                                System.out.println("THATS B");

                            } else {
                                System.out.println(t);

                            }

                        } break;

                    case 6:

                        Scanner val = new Scanner(System.in);
                        Random generator = new Random();

                        System.out.println("You choose number six!\n Lets play (R)ock, (P)aper, (S)cissors.");

                        String personPlay;
                        String computerPlay;

                        int randomNumber = generator.nextInt(3);

                        if (randomNumber == 1) {
                            computerPlay = "R";

                        } else if (randomNumber == 2) {
                            computerPlay = "P";

                        } else {
                            computerPlay = "S";
                        }

                        System.out.print("Enter your play: ");
                        personPlay = val.next();

                        System.out.println("Opponents play: " + computerPlay);

                        if (personPlay.equalsIgnoreCase(computerPlay)) {
                            System.out.println("Its a tie!");

                        } else if (personPlay.equalsIgnoreCase("R") & computerPlay.equalsIgnoreCase("P")) {
                            System.out.println("You lose...");

                        } else if (computerPlay.equalsIgnoreCase("R") & personPlay.equalsIgnoreCase("P")) {
                            System.out.println("You WON!!!");

                        } else if (personPlay.equalsIgnoreCase("S") & computerPlay.equalsIgnoreCase("P")) {
                            System.out.println("You WON!!!");

                        } else if (computerPlay.equalsIgnoreCase("S") & personPlay.equalsIgnoreCase("P")) {
                            System.out.println("You lose...");

                        } else if (personPlay.equalsIgnoreCase("R") & computerPlay.equalsIgnoreCase("S")) {
                            System.out.println("You Won!!!");

                        } else if (computerPlay.equalsIgnoreCase("R") & personPlay.equalsIgnoreCase("S")) {
                            System.out.println("You lose...");

                        } else {
                            System.out.println("Not a valid choice");

                        } break;

                        default:
                        System.out.println("Not a valid number, try again.");

                }

        }
    }
}




