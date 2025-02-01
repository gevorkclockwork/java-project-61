package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Constants.*;
import static hexlet.code.Engine.runGame;


public class Progression {

    public static void startGame() {

        String question = "What number is missing in the progression?";
        String[][] questionsAndAnswers = new String[ROUNDS_COUNT][2];

        int[] progression = new int[PROGRESSION_LENGTH];
        ;
        int hiddenElement;

        for (var qwsAndAns : questionsAndAnswers) {

            int step = new Random().nextInt(FIRST_PROGRESSION_STEP, LAST_PROGRESSION_STEP);
            int number = new Random().nextInt(BOUND_20);

            for (int i = 0; i < progression.length; i++) {
                progression[i] = number;
                number += step;
            }

            hiddenElement = progression[new Random().nextInt(0, progression.length)];

            StringBuilder progressionString = new StringBuilder();
            for (int i = 0; i < progression.length; i++) {
                if (progression[i] == hiddenElement) {
                    progressionString.append("..").append(" ");
                } else {
                    progressionString.append(progression[i]).append(" ");
                }
            }

            qwsAndAns[0] = String.valueOf(progressionString);
            ;
            qwsAndAns[1] = Integer.toString(hiddenElement);
        }

        runGame(question, questionsAndAnswers);

    }

}
