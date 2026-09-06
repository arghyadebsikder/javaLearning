import java.util.Scanner;

public class Main {

    static void printWelcomeScreen(){
        System.out.println("Press 1 to see the menu");
        System.out.println("Press 2 to view the profile");
        System.out.println("Press 3 to view the wallet balance");
        System.out.println("Press 4 to view the transactions");
        System.out.println("Press 5 to deposit money");
        System.out.println("Press 6 to Exit");
        System.out.print("Please enter your choice: ");
    }

    static void showMenu(){
        System.out.println("showmenu");
    }

    static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, Welcome to Arghya's Baking Shop");
        System.out.println("Here You can buy pizza and enjoy your meal");

        while(true){

            printWelcomeScreen();

            int choice = scanner.nextInt();


            switch(choice){
                case 1 -> showMenu();
//                case 2 -> showProfile();
//                case 3 -> showWalletBalance();
//                case 4 -> showTransactions();
//                case 5 -> depositMoney();
                case 6 -> {
                    System.out.println("Thank you for visiting in our shop");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Please choose a number from 1-6\n");
            }

        }


    }
}
