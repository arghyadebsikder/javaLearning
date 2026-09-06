import java.util.Scanner;
import java.util.Random;

public class Main {

    static void printDice1(){
        System.out.println("""
                ⌈‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾⌉
                |                 |
                |                 |
                |        ●        |
                |                 |
                |                 |
                ⌊_________________⌋
                """);
    }
    static void printDice2(){
        System.out.println("""
                ⌈‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾⌉
                |                 |
                |    ●            |
                |                 |
                |            ●    |
                |                 |
                ⌊_________________⌋
                """);
    }
    static void printDice3(){
        System.out.println("""
                ⌈‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾⌉
                |   ●             |
                |                 |
                |        ●        |
                |                 |
                |             ●   |
                ⌊_________________⌋
                """);
    }
    static void printDice4(){
        System.out.println("""
                ⌈‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾⌉
                |                  |
                |    ●        ●    |
                |                  |
                |    ●        ●    |
                |                  |
                ⌊__________________⌋
                """);
    }
    static void printDice5(){
        System.out.println("""
                ⌈‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾⌉
                |   ●         ●   |
                |                 |
                |        ●        |
                |                 |
                |   ●        ●    |
                ⌊_________________⌋
                """);
    }
    static void printDice6(){
        System.out.println("""
                ⌈‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾⌉
                |                 |
                |   ●    ●    ●   |
                |                 |
                |   ●    ●    ●   |
                |                 |
                ⌊_________________⌋
                """);
    }


    static void printDice(int diceNumber){

        switch(diceNumber){
            case 1 -> printDice1();
            case 2 -> printDice2();
            case 3 -> printDice3();
            case 4 -> printDice4();
            case 5 -> printDice5();
            case 6 -> printDice6();
        }

    }

    static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while(true){
            System.out.println("Press enter to roll a dice");
            scanner.nextLine();

            int diceNumber = random.nextInt(1, 7);
            System.out.println("The dice number is " + diceNumber);
            printDice(diceNumber);
        }


//        scanner.close();

    }
}
