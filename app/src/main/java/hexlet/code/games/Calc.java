package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Calc {

    public static void calculateExpression(String name, Scanner scanner, Random random) {

        System.out.println("What is the result of the expression?");

        int rightAnswers = 0;

        int correctAnswersToWin = 3;
        int randomNumbersBound = 20;

        while (rightAnswers != correctAnswersToWin) {
            int randomNumber1 = random.nextInt(randomNumbersBound);
            int randomNumber2 = random.nextInt(randomNumbersBound);
            char[] operations = {'+', '-', '*'};
            int randomIndex = random.nextInt(operations.length);
            char operation = operations[randomIndex];

            System.out.println("Question: " + randomNumber1 + " " + operation + " " + randomNumber2);
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();

            int result = 0;
            switch (operation) {
                case '+':
                    result = randomNumber1 + randomNumber2;
                    break;
                case '-':
                    result = randomNumber1 - randomNumber2;
                    break;
                case '*':
                    result = randomNumber1 * randomNumber2;
                    break;
                default:
            }

            if (answer == result) {
                System.out.println("Correct!");
                rightAnswers++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }

        if (rightAnswers == correctAnswersToWin) {
            System.out.println("Congratulations, " + name + "!");
        }

    }

}
