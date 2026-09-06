import java.util.Random;
import java.util.Scanner;

public class Main {

    static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean isExit = false;

        while(!isExit) {

            System.out.println("\n\nWelcome to random number guessing game");
            System.out.print("Please guess a number between 1-100: ");
            int rand = random.nextInt(1, 101), guess = 0, attempt = 0;
            while (guess != rand) {
                guess = scanner.nextInt();
                if (guess > rand) {
                    System.out.println("Lower!");
                }
                if (guess < rand) {
                    System.out.println("Higher!");
                }
                attempt++;
            }
            System.out.println("Congratulations, you have guessed the correct number in " + attempt + " attempt");
            System.out.print("\n\nDo you want to\n1) Play again \n2) Exit\nEnter you choice: ");

            int choice = scanner.nextInt();
            if(choice == 2) isExit = true;
        }
    }
}
