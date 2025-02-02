package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void runGame(String gameRules, String[][] questionsAndAnswers) {

        Scanner scanner = new Scanner(System.in);

        String name = Greet.greet();
        System.out.println(gameRules);

        for (String[] qwsAndAns : questionsAndAnswers) {
            System.out.println("Question: " + qwsAndAns[0]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (compareAnswers(userAnswer, qwsAndAns[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'"
                        + userAnswer + "' is wrong answer ;(. Correct answer was '" + qwsAndAns[1] + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + name + "!");


    }

    public static boolean compareAnswers(String userAnswer, String correctAnswer) {
        return userAnswer.toLowerCase().equals(correctAnswer);
    }


}
