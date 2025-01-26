package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Progression {

    public static void determineNumber(String name, Scanner scanner, Random random) {

        System.out.println("What number is missing in the progression?");

        int rightAnswers = 0;
        int correctAnswersToWin = 3;
        int randomNumbersBound = 20;
        int lowerBound = 1;
        int upperBound = 10;
        int arrayLength = 10;

        while (rightAnswers != correctAnswersToWin) {

            int[] progression = new int[arrayLength];

            int step = random.nextInt(lowerBound, upperBound);
            int number = random.nextInt(randomNumbersBound);

            for (int i = 0; i < progression.length; i++) {
                progression[i] = number;
                number += step;
            }

            int hiddenElement = progression[random.nextInt(0, progression.length)];

            System.out.print("Question: ");
            for (int i = 0; i < progression.length; i++) {
                if (progression[i] == hiddenElement) {
                    System.out.print(".." + " ");
                } else {
                    System.out.print(progression[i] + " ");
                }
            }
            System.out.println();
            System.out.print("Your answer: ");
            int hiddenElementByUser = scanner.nextInt();

            if (hiddenElementByUser == hiddenElement) {
                System.out.println("Correct!");
                rightAnswers++;
            } else {
                System.out.println("'" + hiddenElementByUser + "' is wrong answer ;(. "
                        + "Correct answer was '" + hiddenElement + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }

        if (rightAnswers == correctAnswersToWin) {
            System.out.println("Congratulations, " + name + "!");
        }
    }

}
