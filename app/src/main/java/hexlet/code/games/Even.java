package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Constants.BOUND_100;
import static hexlet.code.Constants.ROUNDS_COUNT;
import static hexlet.code.Engine.runGame;

public class Even {

    public static void startGame() {

        String question = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionsAndAnswers = new String[ROUNDS_COUNT][2];

        for (var qwsAndAns : questionsAndAnswers) {
            int randomNumber = new Random().nextInt(BOUND_100);

            qwsAndAns[0] = Integer.toString(randomNumber);
            qwsAndAns[1] = randomNumber % 2 == 0 ? "yes" : "no";
        }

        runGame(question, questionsAndAnswers);

    }


}
