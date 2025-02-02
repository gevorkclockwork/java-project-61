package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Constants.ROUNDS_COUNT;
import static hexlet.code.Constants.LOWER_BOUND_PRIME_NUMBERS;
import static hexlet.code.Constants.BOUND_100;
import static hexlet.code.Engine.runGame;

public class Prime {

    private static final String GAME_RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";


    public static void startGame() {

        String[][] questionsAndAnswers = new String[ROUNDS_COUNT][2];

        for (String[] qwsAndAns : questionsAndAnswers) {
            int randomNumber = new Random().nextInt(LOWER_BOUND_PRIME_NUMBERS, BOUND_100);

            qwsAndAns[0] = Integer.toString(randomNumber);
            qwsAndAns[1] = checkPrime(randomNumber);
        }

        runGame(GAME_RULES, questionsAndAnswers);

    }


    public static String checkPrime(int randomNumber) {

        String numberIsPrime = "yes";

        for (int i = 2; i < randomNumber; i++) {
            if (randomNumber % i == 0) {
                numberIsPrime = "no";
            }
        }
        return numberIsPrime;
    }


}
