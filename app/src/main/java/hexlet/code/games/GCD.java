package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class GCD {

    public static void calculateGCD(String name, Scanner scanner, Random random) {

        System.out.println("Find the greatest common divisor of given numbers.");

        int rightAnswers = 0;

        while (rightAnswers != 3) {
            int randomNumber1 = random.nextInt(100);
            int randomNumber2 = random.nextInt(100);

            System.out.println("Question: " + randomNumber1 + " " + randomNumber2);
            System.out.print("Your answer: ");
            int userGCD = scanner.nextInt();

            int correctGCD =  findGCD(randomNumber1, randomNumber2);

            if (userGCD == correctGCD) {
                System.out.println("Correct!");
                rightAnswers++;
            } else {
                System.out.println("'" + userGCD + "' is wrong answer ;(. Correct answer was '" + correctGCD + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }

        if (rightAnswers == 3) {
            System.out.println("Congratulations, " + name + "!");
        }

    }

    public static int findGCD(int number1, int number2) {
        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        return number1;
    }

}
