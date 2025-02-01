package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Constants.BOUND_100;
import static hexlet.code.Constants.ROUNDS_COUNT;
import static hexlet.code.Engine.runGame;

public class GCD {

    public static void startGame() {

        String question = "Find the greatest common divisor of given numbers.";
        String[][] questionsAndAnswers = new String[ROUNDS_COUNT][2];

        for (var qwsAndAns : questionsAndAnswers) {
            int randomNumber1 = new Random().nextInt(BOUND_100);
            int randomNumber2 = new Random().nextInt(BOUND_100);

            qwsAndAns[0] = randomNumber1 + " " + randomNumber2;
            qwsAndAns[1] = getGCD(randomNumber1, randomNumber2);
        }

        runGame(question, questionsAndAnswers);

    }


    public static String getGCD(int randomNumber1, int randomNumber2) {
        int gcd = 0;

        int maxNumber = Math.max(randomNumber1, randomNumber2);
        int minNumber = Math.min(randomNumber1, randomNumber2);

        while (gcd == 0) {

            int remainderOfDivision = maxNumber % minNumber;

            if (remainderOfDivision == 0) {
                gcd = minNumber;
            } else {
                maxNumber = minNumber;
                minNumber = remainderOfDivision;
            }
        }

        return Integer.toString(gcd);
    }

}
