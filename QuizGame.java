import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Java Quiz Game!\n");

        // Question 1
        System.out.println("1. What is the size of int in Java?");
        System.out.println("a) 8 bits");
        System.out.println("b) 16 bits");
        System.out.println("c) 32 bits");
        System.out.println("d) 64 bits");
        System.out.print("Your answer: ");
        String ans1 = input.nextLine();
        if (ans1.equalsIgnoreCase("c")) {
            System.out.println(" Correct!");
            score++;
        } else {
            System.out.println(" Wrong! Correct answer is: c) 32 bits");
        }

        // Question 2
        System.out.println("\n2. Which company developed Java?");
        System.out.println("a) Google");
        System.out.println("b) Oracle");
        System.out.println("c) Microsoft");
        System.out.println("d) Sun Microsystems");
        System.out.print("Your answer: ");
        String ans2 = input.nextLine();
        if (ans2.equalsIgnoreCase("d")) {
            System.out.println(" Correct!");
            score++;
        } else {
            System.out.println(" Wrong! Correct answer is: d) Sun Microsystems");
        }

        // Question 3
        System.out.println("\n3. Which keyword is used to create a class in Java?");
        System.out.println("a) def");
        System.out.println("b) var");
        System.out.println("c) class");
        System.out.println("d) new");
        System.out.print("Your answer: ");
        String ans3 = input.nextLine();
        if (ans3.equalsIgnoreCase("c")) {
            System.out.println(" Correct!");
            score++;
        } else {
            System.out.println(" Wrong! Correct answer is: c) class");
        }

        // Question 4
        System.out.println("\n4. Java is ___?");
        System.out.println("a) Compiled only");
        System.out.println("b) Interpreted only");
        System.out.println("c) Both compiled and interpreted");
        System.out.println("d) None");
        System.out.print("Your answer: ");
        String ans4 = input.nextLine();
        if (ans4.equalsIgnoreCase("c")) {
            System.out.println(" Correct!");
            score++;
        } else {
            System.out.println("Wrong! Correct answer is: c) Both compiled and interpreted");
        }

        // Final Result
        System.out.println("\nQuiz Completed!");
        System.out.println("Your Score: " + score + "/4");

        if (score == 4) {
            System.out.println("🌟 Excellent! You got all right!");
        } else if (score >= 2) {
            System.out.println("👍 Good job! Try to improve more.");
        } else {
            System.out.println("📚 Keep practicing! You can do it!");
        }

        input.close();
    }
}