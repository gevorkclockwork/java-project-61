package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Constants.ROUNDS_COUNT;
import static hexlet.code.Constants.LOWER_BOUND_PRIME_NUMBERS;
import static hexlet.code.Constants.BOUND_100;
import static hexlet.code.Engine.runGame;

public class Prime {

    public static void startGame() {

        String question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionsAndAnswers = new String[ROUNDS_COUNT][2];

        for (var qwsAndAns : questionsAndAnswers) {
            int randomNumber = new Random().nextInt(LOWER_BOUND_PRIME_NUMBERS, BOUND_100);

            qwsAndAns[0] = Integer.toString(randomNumber);
            qwsAndAns[1] = checkPrime(randomNumber);
        }

        runGame(question, questionsAndAnswers);

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
