package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Constants.*;
import static hexlet.code.Engine.runGame;

public class Calc {

    public static void startGame() {

        String question = "What is the result of the expression?";
        String[][] questionsAndAnswers = new String[ROUNDS_COUNT][2];
        char[] operations = {'+', '-', '*'};

        for (var qwsAndAns : questionsAndAnswers) {
            int randomNumber1 = new Random().nextInt(BOUND_100);
            int randomNumber2 = new Random().nextInt(BOUND_100);
            int randomIndex = new Random().nextInt(operations.length);
            char operation = operations[randomIndex];

            qwsAndAns[0] = randomNumber1 + " " + operation + " " + randomNumber2;
            qwsAndAns[1] = randomCalc(randomNumber1, randomNumber2, operation);
        }

        runGame(question, questionsAndAnswers);

    }

    public static String randomCalc(int randomNumber1, int randomNumber2, int operation) {

        int result = 0;
        switch (operation) {
            case '+':
                result = randomNumber1 + randomNumber2;
                break;
            case '-':
                result = randomNumber1 - randomNumber2;
                break;
            case '*':
                result = randomNumber1 * randomNumber2;
                break;
            default:
        }
        return Integer.toString((result));
    }

}
