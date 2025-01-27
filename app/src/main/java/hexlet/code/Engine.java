package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Random;
import java.util.Scanner;

public class Engine {

    public static final int CORRECT_ANSWERS_TO_WIN = 3;
    public static final int BOUND_100 = 100;
    public static final int BOUND_20 = 20;
    public static final int LOWER_BOUND_PRIME_NUMBERS = 2;
    public static final int FIRST_PROGRESSION_STEP = 1;
    public static final int LAST_PROGRESSION_STEP = 10;
    public static final int PROGRESSION_LENGTH = 10;

    public static void gamesManagement(String gameNumber) {

        String name = Greet.greeting();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        switch (gameNumber) {
            case "2":
                Even.evenParity(name, scanner, random);
                break;
            case "3":
                Calc.calculateExpression(name, scanner, random);
                break;
            case "4":
                GCD.calculateGCD(name, scanner, random);
                break;
            case "5":
                Progression.determineNumber(name, scanner, random);
                break;
            case "6":
                Prime.checkingNumber(name, scanner, random);
                break;
            default:
        }

    }

}
