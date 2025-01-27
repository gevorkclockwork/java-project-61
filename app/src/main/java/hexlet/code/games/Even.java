package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.BOUND_100;
import static hexlet.code.Engine.CORRECT_ANSWERS_TO_WIN;

public class Even {

    public static void evenParity(String name, Scanner scanner, Random random) {


        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int rightAnswers = 0;

        while (rightAnswers != CORRECT_ANSWERS_TO_WIN) {
            int randomNumber = random.nextInt(BOUND_100);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            if (randomNumber % 2 == 0 && answer.equals("yes") || randomNumber % 2 != 0 && answer.equals("no")) {
                System.out.println("Correct!");
                rightAnswers++;
            } else if (randomNumber % 2 == 0 && answer.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            } else if (randomNumber % 2 != 0 && answer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            } else {
                break;
            }
        }

        if (rightAnswers == CORRECT_ANSWERS_TO_WIN) {
            System.out.println("Congratulations, " + name + "!");
        }

    }


}
