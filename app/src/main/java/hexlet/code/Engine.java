package hexlet.code;

import hexlet.code.games.*;

import java.util.Random;
import java.util.Scanner;

public class Engine {

    public static void gamesManagement(int gameNumber) {

        String name = Greet.greeting();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        switch (gameNumber) {
            case 2:
                Even.evenParity(name, scanner, random);
                break;
            case 3:
                Calc.calculateExpression(name, scanner, random);
                break;
            case 4:
                GCD.calculateGCD(name, scanner, random);
                break;
            case 5:
                Progression.determineNumber(name, scanner, random);
                break;
            case 6:
                Prime.checkingNumber(name, scanner, random);
                break;
            default:
        }

    }

}
