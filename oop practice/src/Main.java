import java.util.Scanner;

public class Main {

    static void status(Car car){

        if(car.isInside) System.out.println("You are inside the car. Press 1 to exit the car");
        else System.out.println("You are not in the car. Press 1 to get in the car");

        if(car.isOpen) System.out.println("The car door is open. Press 2 to close the door");
        else System.out.println("The car door is close. Press 2 to open the door");

        if(car.isBelt) System.out.println("Your seat belt is tied. Press 3 to untie");
        else System.out.println("Your seat belt is not tied. Press 3 to tie");

        if(car.isStart) System.out.println("The car engine is on. Press 4 to turn off");
        else System.out.println("The car engine is off. Press 4 to turn on");

        if(car.isDriving) System.out.println("You are driving the car. Press 5 to stop driving");
        else System.out.println("You are not driving the car. Press 5 to start driving");

        System.out.println("Press 6 to exit");

    }

    static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Car car = new Car();

        System.out.println("Car Brand: " + car.brand);
        System.out.println("Car Model: " + car.model);
        System.out.println("Car relise date: " + car.reliseDate);
        System.out.println("Car Size: " + car.size + "feet");
        System.out.println();

        while(true){

            status(car);

            System.out.print("Please enter your choice: ");

            int choice = scanner.nextInt();

            System.out.print(">> ");
            switch(choice){
                case 1 -> {
                    if(car.isInside) car.exit();
                    else car.getIn();
                }case 2 -> {
                    if(car.isOpen) car.doorClose();
                    else car.doorOpen();
                }case 3 -> {
                    if(car.isBelt) car.unTieBelt();
                    else car.tieBelt();
                }case 4 -> {
                    if(car.isStart) car.stopEngine();
                    else car.start();
                }case 5 -> {
                    if(car.isDriving) car.stopDrive();
                    else car.drive();
                }case 6 -> {
                    if(car.isInside) System.out.println("Please get out of the car to exit");
                    else{
                        System.out.println("Exit successfully");
                        System.exit(0);
                    }
                }
                default -> System.out.println("Invalid choice. Please try again");
            }
            System.out.println();
        }

    }
}
