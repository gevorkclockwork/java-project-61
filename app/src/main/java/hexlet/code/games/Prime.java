package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.CORRECT_ANSWERS_TO_WIN;
import static hexlet.code.Engine.LOWER_BOUND_PRIME_NUMBERS;
import static hexlet.code.Engine.BOUND_100;

public class Prime {

    public static void checkingNumber(String name, Scanner scanner, Random random) {

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int rightAnswers = 0;

        while (rightAnswers != CORRECT_ANSWERS_TO_WIN) {

            int randomNumber = random.nextInt(LOWER_BOUND_PRIME_NUMBERS, BOUND_100);

            String numberIsPrime = "yes";

            for (int i = 2; i < randomNumber; i++) {
                if (randomNumber % i == 0) {
                    numberIsPrime = "no";
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

        if (rightAnswers == CORRECT_ANSWERS_TO_WIN) {
            System.out.println("Congratulations, " + name + "!");
        }
    }

}
