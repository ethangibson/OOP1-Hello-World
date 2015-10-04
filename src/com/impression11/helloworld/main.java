package com.impression11.helloworld;

// These are the imported classes and libraries!
// IntelliJ can import a lot of these itself though we often have to select which venors package to use!
import java.util.Scanner;

/**
 * Created by Ethan on 28/09/15.
 */
public class main {

    // This is the main method that gets ran when the application runs

    public static void main(String[] args) {

        // Lets set some varibales
        int myFirstInteger = 42;
        String myFirstString = "hello there";

        // Print out our variable to the console
        System.out.println(myFirstString);

        // This method will also print out integers as well!
        System.out.println(myFirstInteger);

        // Create a scanner object
        // The methods accessible with the scanner object allow us to input text into the application through the terminal
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the capital of the UK?");
        // scannerObject.next(); reteives the first word entered
        String answerOne = sc.next();

        System.out.println("What is 11 + 22?");
        // scannerObject.nextInt(); reteives the integer input
        int answerTwo = sc.nextInt();

        System.out.println("What is your lecturer's full name ?");
        // scannerObject.nextLine(); reteives the full line of input text
        String answerThree = sc.nextLine();
        // Next line is a bit funny from time to time - running it twice fixes things!
        answerThree = sc.nextLine();

        int scoreKeeper = 0;

        if (answerOne.equals("London")){
            // Like in PHP - ++ increases the value of an integer by 1
            scoreKeeper++;
        }

        if (answerTwo == 33){
            scoreKeeper++;
        }

        if (answerThree.equals("Ethan Gibson")) {
            scoreKeeper++;
        }

        // Output total score
        System.out.println("You scored " + scoreKeeper + " out of 3");


    }
}
