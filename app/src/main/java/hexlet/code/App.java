package hexlet.code;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int gameNumber = scanner.nextInt();
        System.out.println();

        switch (gameNumber) {
            case 1:
                Greet.greeting();
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                Engine.gamesManagement(gameNumber);
                break;
            case 0:
                break;
            default:
        }

    }
}
