package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Even {

    public static void evenParity(String name, Scanner scanner, Random random) {

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int rightAnswers = 0;

        while (rightAnswers != 3) {
            int randomNumber = random.nextInt(100);
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

        if (rightAnswers == 3) {
            System.out.println("Congratulations, " + name + "!");
        }

    }


}
