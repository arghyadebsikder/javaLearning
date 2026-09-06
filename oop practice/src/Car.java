public class Car {

    String brand = "Porsche";
    String model = "911";
    int reliseDate =  2009;
    int size = 7;
    boolean isDriving = false;
    boolean isOpen = false;
    boolean isBelt = false;
    boolean isStart = false;


    void doorOpen(){
        isOpen = true;
        System.out.println("The door has been opened");
    }

    void doorClose(){
        isOpen = false;
        System.out.println("The door has been closed");
    }

    void tieBelt(){
        isBelt = true;
        System.out.println("Thank you for using seat belt");

    }

    void unTieBelt(){
        isBelt = false;
        System.out.println("Your seat belt is untied");
    }

    void start(){
        if(isDriving) System.out.println("You are already driving the car");
        else if(isStart) System.out.println("The car engine is already started");
        else if(isOpen) System.out.println("Please close the door before starting");
        else if(!isBelt) System.out.println("Please tie seat belt before starting the engine");
        else{
            isStart = true;
            System.out.println("Please drive with caution. Happy ride :)");
        }
    }

    void stopEngine(){
        isStart = false;
        System.out.println("The car engine stopped");
    }

    void drive(){
        if(isStart) {
            isDriving = true;
            System.out.println("You started driving the car");
        }else System.out.println("Please start the car before driving");
    }

    void stopDrive(){
        isDriving = false;
        System.out.println("Car is at parking mode");
    }

}
