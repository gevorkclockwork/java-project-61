package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Constants.ROUNDS_COUNT;
import static hexlet.code.Constants.BOUND_100;
import static hexlet.code.Engine.runGame;

public class GCD {

    private static final String GAME_RULES = "Find the greatest common divisor of given numbers.";

    public static void startGame() {

        String[][] questionsAndAnswers = new String[ROUNDS_COUNT][2];

        for (String[] qwsAndAns : questionsAndAnswers) {
            int randomNumber1 = new Random().nextInt(BOUND_100);
            int randomNumber2 = new Random().nextInt(BOUND_100);

            qwsAndAns[0] = randomNumber1 + " " + randomNumber2;
            qwsAndAns[1] = getGCD(randomNumber1, randomNumber2);
        }

        runGame(GAME_RULES, questionsAndAnswers);

    }


    public static String getGCD(int randomNumber1, int randomNumber2) {

        while (randomNumber2 != 0) {
            int temp = randomNumber2;
            randomNumber2 = randomNumber1 % randomNumber2;
            randomNumber1 = temp;
        }

        return Integer.toString(randomNumber1);
    }

}
