import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;

        System.out.println("Devinez un nombre entre 1 et 100 :");

        while (numberOfTries < 10) {
            guess = input.nextInt();
            numberOfTries++;

            if (guess < numberToGuess) {
                System.out.println("Trop bas !");
            } else if (guess > numberToGuess) {
                System.out.println("Trop haut !");
            } else {
                win = true;
                break;
            }
        }

        if (win) {
            System.out.println("Bravo ! Vous avez trouvé le nombre en " + numberOfTries + " essais.");
        } else {
            System.out.println("Désolé, vous avez utilisé vos 10 essais. Le nombre était " + numberToGuess + ".");
        }

        input.close();
    }
}
