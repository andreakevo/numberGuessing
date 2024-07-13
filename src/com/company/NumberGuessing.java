package com.company;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(10);

        boolean guessed = false;
        String output;
        int input;
        System.out.println("Your time starts now");
        long startTime = System.currentTimeMillis();
        do {
            try {
                System.out.println("Guess the number from 0 to 9");
                input = Integer.parseInt(scanner.nextLine());
                if(input==number){
                    guessed = true;
                    break;
                }
                output = input<number ? "Low" : "High";
                System.out.println(output);
                System.out.println("-".repeat(20));
                System.out.println();
            }catch (NumberFormatException e){
                System.out.println("Please enter a number");
                System.out.println("-".repeat(20));
            }

        }while (!guessed);
        long stopTime = System.currentTimeMillis();
        System.out.println("You guessed it right. \nThe wanted number is " + number
                + ". \nYour time is " + (stopTime - startTime) + " milliseconds." );
    }
}
