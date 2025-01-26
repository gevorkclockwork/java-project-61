package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Prime {

    public static void checkingNumber(String name, Scanner scanner, Random random) {

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int rightAnswers = 0;
        int correctAnswersToWin = 3;
        int randomNumbersBound = 100;

        while (rightAnswers != correctAnswersToWin) {

            int randomNumber = random.nextInt(randomNumbersBound);

            String numberIsPrime = "yes";

            for (int i = 2; i < randomNumber; i++) {
                if (randomNumber % i == 0) {
                    numberIsPrime = "no";
                    break;
                }
            }

            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            if (answer.equals(numberIsPrime)) {
                System.out.println("Correct!");
                rightAnswers++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. "
                        + "Correct answer was '" + numberIsPrime + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }

        if (rightAnswers == correctAnswersToWin) {
            System.out.println("Congratulations, " + name + "!");
        }
    }

}
