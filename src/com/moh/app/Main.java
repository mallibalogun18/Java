package com.moh.app;
/*
* Mohammed A.
* April 22, 2020
* Working on my programming skills. Quick implementation of a switch case statement
* that a user can engaging with by selecting a number between 1 or 5. To exit the game select 0
* */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the Switch Game");
        System.out.println("Enter a number between 1 to 5:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        while(x != 0){
            switchCaseExample(x);
            System.out.println("Enter 0 to exit or press a number from 1 to 5 to replay the game.");
            x = scanner.nextInt();
        }

    }

    //this method will determine the output based on the selection
    public static void switchCaseExample(int number){

        if(number >= 1 && number <= 5){
            switch (number){
                case 1:
                    System.out.println("You've selected number "+ number);
                    break;
                case 2:
                    System.out.println("You've selected number "+ number);
                    break;
                case 3:
                    System.out.println("You've selected number "+ number);
                    break;
                case 4:
                    System.out.println("You've selected number "+ number);
                    break;
                case 5:
                    System.out.println("You've selected number "+ number);
                    break;
            }
        } else{
            System.out.println(number+" is not one of the number that you may select to play the game.");
            System.out.println("Try again by selecting the numbers between 1 and 5");
        }

    }

}
