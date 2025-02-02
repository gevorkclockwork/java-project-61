package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Constants.ROUNDS_COUNT;
import static hexlet.code.Constants.PROGRESSION_LENGTH;
import static hexlet.code.Constants.FIRST_PROGRESSION_STEP;
import static hexlet.code.Constants.LAST_PROGRESSION_STEP;
import static hexlet.code.Constants.BOUND_20;
import static hexlet.code.Engine.runGame;


public class Progression {

    private static final String GAME_RULES = "What number is missing in the progression?";


    public static void startGame() {

        String[][] questionsAndAnswers = new String[ROUNDS_COUNT][2];

        int[] progression = new int[PROGRESSION_LENGTH];

        int hiddenElement;

        for (String[] qwsAndAns : questionsAndAnswers) {

            int step = new Random().nextInt(FIRST_PROGRESSION_STEP, LAST_PROGRESSION_STEP);
            int number = new Random().nextInt(BOUND_20);

            for (int i = 0; i < progression.length; i++) {
                progression[i] = number;
                number += step;
            }

            hiddenElement = progression[new Random().nextInt(0, progression.length)];

            String progressionString = getProgressionString(progression, hiddenElement);

            qwsAndAns[0] = progressionString;

            qwsAndAns[1] = Integer.toString(hiddenElement);
        }

        runGame(GAME_RULES, questionsAndAnswers);

    }

    public static String getProgressionString(int[] progression, int hiddenElement) {

        StringBuilder progressionString = new StringBuilder();
        for (int i = 0; i < progression.length; i++) {
            if (progression[i] == hiddenElement) {
                progressionString.append("..").append(" ");
            } else {
                progressionString.append(progression[i]).append(" ");
            }
        }

        return String.valueOf(progressionString);
    }

}
