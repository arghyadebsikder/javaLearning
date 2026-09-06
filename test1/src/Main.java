import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random arghya = new Random();

        System.out.print("Please enter the height of the rectangle: ");
        int height = scanner.nextInt();
        height = arghya.nextInt(1, 5);

        System.out.print("Please enter the weight of the rectangle: ");
        int weight;
        weight = scanner.nextInt();

        System.out.println("The area of the rectangle is: " + height * weight + "cm");

//        scanner.close();
    }
}
