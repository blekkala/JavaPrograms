/**
 * 
 */
package com.JavaPrograms.p1;

/**
 * 
 */
import java.util.Scanner;

public class Quizapplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int score = 0;

	        // Question 1
	        System.out.println("In which year James gosling created java ");
	        System.out.println("A) 1994");
	        System.out.println("B) 1995");
	        System.out.println("C) 1996");
	        System.out.print("Enter your answer: ");
	        String answer1 = scanner.nextLine();
	        if (answer1.equalsIgnoreCase("B")) {
	            System.out.println("Correct!");
	            score++;
	        } else {
	            System.out.println("Incorrect. The correct answer is B) 1995.");
	        }

	        // Question 2
	        System.out.println("\n Is java a interpreted language or not?");
	        System.out.println("A) Null");
	        System.out.println("B) No");
	        System.out.println("C) Yes");
	        System.out.print("Enter your answer: ");
	        String answer2 = scanner.nextLine();
	        if (answer2.equalsIgnoreCase("C")) {
	            System.out.println("Correct!");
	            score++;
	        } else {
	            System.out.println("Incorrect. The correct answer is C) Yes.");
	        }

	        // Question 3
	        System.out.println("\nWhich of the following programming languages is used for Android app development?");
	        System.out.println("A) Java");
	        System.out.println("B) Python");
	        System.out.println("C) C++");
	        System.out.print("Enter your answer: ");
	        String answer3 = scanner.nextLine();
	        if (answer3.equalsIgnoreCase("A")) {
	            System.out.println("Correct!");
	            score++;
	        } else {
	            System.out.println("Incorrect. The correct answer is A) Java.");
	        }

	        // Question 4
	        System.out.println("\nWhat is the chemical symbol for gold?");
	        System.out.println("A) Ag");
	        System.out.println("B) Au");
	        System.out.println("C) Hg");
	        System.out.print("Enter your answer: ");
	        String answer4 = scanner.nextLine();
	        if (answer4.equalsIgnoreCase("B")) {
	            System.out.println("Correct!");
	            score++;
	        } else {
	            System.out.println("Incorrect. The correct answer is B) Au.");
	        }

	        // Question 5
	        System.out.println("\nWhich of the following musicians was known as the 'King of Rock and Roll'?");
	        System.out.println("A) Chuck Berry");
	        System.out.println("B) Elvis Presley");
	        System.out.println("C) Little Richard");
	        System.out.print("Enter your answer: ");
	        String answer5 = scanner.nextLine();
	        if (answer5.equalsIgnoreCase("B")) {
	            System.out.println("Correct!");
	            score++;
	        } else {
	            System.out.println("Incorrect. The correct answer is B) Elvis Presley.");
	        }

	        // Question 6
	        System.out.println("\nWhat is the smallest country in the world, both in terms of population and land area?");
	        System.out.println("A) Vatican City");
	        System.out.println("B) Monaco");
	        System.out.println("C) Nauru");
	        System.out.print("Enter your answer: ");
	        String answer6 = scanner.nextLine();
	        if (answer6.equalsIgnoreCase("A")) {
	            System.out.println("Correct!");
	            score++;
	        } else {
	            System.out.println("Incorrect. The correct answer is A) Vatican City.");
	        }

	        // Question 7
	        System.out.println("\nWho painted the famous painting 'The Starry Night'?");
	        System.out.println("A) Leonardo da Vinci");
	        System.out.println("B) Vincent van Gogh");
	        System.out.println("C) Pablo Picasso");
	        System.out.print("Enter your answer: ");
	        String answer7 = scanner.nextLine();
	        if (answer7.equalsIgnoreCase("B")) {
	            System.out.println("Correct!");
	            score++;
	        } else {
	            System.out.println("Incorrect. The correct answer is B) Vincent van Gogh.");
	        }

	        // Question 8
	        System.out.println("\nWhat is the largest mammal on Earth?");
	        System.out.println("A) Blue whale");
	        System.out.println("B) Fin whale");
	        System.out.println("C) Humpback whale");
	        System.out.print("Enter your answer: ");
	        String answer8 = scanner.nextLine();
	        if (answer8.equalsIgnoreCase("A")) {
	            System.out.println("Correct!");
	            score++;
	        } else {
	            System.out.println("Incorrect. The correct answer is A) Blue whale.");
	        }

	        // Question 9
	        System.out.println("\nWho wrote the famous novel 'To Kill a Mockingbird'?");
	        System.out.println("A) F. Scott Fitzgerald");
	        System.out.println("B) Harper Lee");
	        System.out.println("C) Jane Austen");
	        System.out.print("Enter your answer: ");
	        String answer9 = scanner.nextLine();
	        if (answer9.equalsIgnoreCase("B")) {
	            System.out.println("Correct!");
	            score++;
	        } else {
	            System.out.println("Incorrect. The correct answer is B) Harper Lee.");
	        }
	        
	        // Question 10
	        System.out.println("\nWho created java?");
	        System.out.println("A) John gosling");
	        System.out.println("B) John legend");
	        System.out.println("C) John Lenon");
	        System.out.println("Enter your answer: ");
	        String answer10 = scanner.nextLine();
	        if (answer10.equalsIgnoreCase("A")) {
	        	System.out.println("Correct!");
	        	score++;
	        } else {
	        	System.out.println("Incorrect. The correct answer is A) John gosling.");
	        }
	        System.out.println("\nQuiz finished! Your final score is " + score + "/10.");
	    }

	}

